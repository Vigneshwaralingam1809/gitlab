class Payilagam{

 String course="java";
 int age=21;
 String address="1/b,velachery";

public static void main(String[] args){




displayInfo();


}

public Payilagam(String c,int ag,String add)
{

course=c;
age=ag;
address=add;
System.out.println("hii");


}

public Payilagam()
{

}
public static void displayInfo()
{
Payilagam sam = new Payilagam();
Payilagam ram = new Payilagam("python",33,"chennai");
System.out.println(sam.age);
System.out.println(sam.address);
System.out.println(sam.course);

System.out.println(ram.age);
System.out.println(ram.address);
System.out.println(ram.course);}



}























