interface Payment{
    void processpayment(int amount);
}
class CreditCardPayment implements Payment{
    public void processpayment(int amount){
        System.out.println("Processing credit card payment of : " + amount);
    }
}

class UPIPayment implements Payment{
    public void processpayment(int amount){
        System.out.println("Processing UPI payment of : " + amount);
    }
}

public class interface_5 {
    public static void main(String[] args) {
        Payment cc = new CreditCardPayment();
        Payment upi = new UPIPayment();

        cc.processpayment(100);
        upi.processpayment(200);
    }
}
