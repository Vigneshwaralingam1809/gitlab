public class KFC {  
    String qty = "large";
    int price = 350;

    public static void main(String[] args) {
        KFC popcorn = new KFC();
        popcorn.buy();  
        System.out.println(popcorn.qty); 
    }

    public void buy() {
        System.out.println("Hi, hello");
        System.out.println(qty);  
    }
}

