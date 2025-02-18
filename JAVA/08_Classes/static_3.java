
class Laptop{
    String brand;
    int price;
    static String product;

    static {
        product = "laptop";
    }

    Laptop(){
        brand = "Acer";
        price =100;
        
    }

    void show(){
        System.out.println(brand + " " + price + " " + product);
    }
}

public class static_3 {
   public static void main(String[] args) {
        Laptop l1 = new Laptop();
        System.out.println(l1.brand);
        System.out.println(l1.price);
        
        System.out.println(Laptop.product);


   } 
}
