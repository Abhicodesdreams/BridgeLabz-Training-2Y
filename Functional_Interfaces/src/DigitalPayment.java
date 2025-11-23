interface Payment {
    void pay(double amt);
}

class UPI implements Payment {
    public void pay(double amt) {
        System.out.println("Paid via UPI: " + amt);
    }
}

class CreditCard implements Payment {
    public void pay(double amt) {
        System.out.println("Paid via Credit Card: " + amt);
    }
}

class Wallet implements Payment {
    public void pay(double amt) {
        System.out.println("Paid via Wallet: " + amt);
    }
}

public class DigitalPayment {
    public static void main(String[] args) {
        Payment p1 = new UPI();
        Payment p2 = new CreditCard();
        Payment p3 = new Wallet();

        p1.pay(500);
        p2.pay(1200);
        p3.pay(300);
    }
}
