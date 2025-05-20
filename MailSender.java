package com.example.email_sender;

import jakarta.mail.*;
import jakarta.mail.internet.*;
import java.util.Properties;
import java.io.File;

public class MailSender {

    private static final String EMAIL_ADDRESS = "gittrackerproject@gmail.com";
    private static final String EMAIL_PASSWORD = "qjko mwmk xywg gqjk"; // Use app password if 2FA enabled

    public static void main(String[] args) {
        String studentName = "Vigneshwaralingam";
        String courseName = "Full Stack Java";
        String receiverEmail = "licky1809@gmail.com";
        String pdfPath = "/home/vignesh/Downloads/m_vigneshwaralingam.pdf";
        MailSender newobj = new MailSender();
        newobj.sendInvoiceEmail(studentName, courseName, receiverEmail, pdfPath);
    }

    public void sendInvoiceEmail(String studentName, String courseName, 
                                      String receiverEmail, String pdfPath) {
        // Email configuration
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(EMAIL_ADDRESS, EMAIL_PASSWORD);
            }
        });

        try {
            // Create message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(EMAIL_ADDRESS));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(receiverEmail));
            message.setSubject("Payment Invoice - " + studentName + " | " + courseName);

            // Create HTML message body
            String emailContent = "<html><body>"
                    + "<p>Dear " + studentName + ",</p>"
                    + "<p>I hope you are doing well.</p>"
                    + "<p>Thank you for choosing Payilagam and enrolling in our <strong>" 
                    + courseName + "</strong> course. Please find attached your payment invoice for your reference.</p>"
                    + "<p>For any questions regarding your invoice, please don't hesitate to contact us.</p>"
                    + "<p>Best regards,<br>"
                    + "Payilagam Admin<br>"
                    + "gittrackerproject@gmail.com</p>"
                    + "</body></html>";

            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setContent(emailContent, "text/html");

            // Create attachment
            MimeBodyPart attachmentPart = new MimeBodyPart();
            attachmentPart.attachFile(new File(pdfPath));

            // Combine parts
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            multipart.addBodyPart(attachmentPart);

            message.setContent(multipart);

            // Send email
            Transport.send(message);
            System.out.println("Invoice email sent successfully to " + studentName + "!");

        } catch (Exception e) {
            System.err.println("Error sending email:");
            e.printStackTrace();
        }
    }
}