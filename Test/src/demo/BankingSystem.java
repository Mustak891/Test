package demo;

interface Payment {
    void pay(double amount);
    void refund(double amount);
}

class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via UPI");
    }
    public void refund(double amount) {
        System.out.println("Refunded ₹" + amount + " via UPI");
    }
}

class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via Credit Card");
    }
    public void refund(double amount) {
        System.out.println("Refunded ₹" + amount + " via Credit Card");
    }
}


public class BankingSystem {
	
//	 static void processPayment(Payment payment) {
//	        payment.pay(100.0);
//	        payment.refund(50.0);
//	    }

	public static void main(String[] args) {
		CreditCard payment =  new CreditCard();
		payment.pay(1.4);
		payment.refund(12.3);
		
		UPI payment2 =  new UPI();
		payment2.pay(1.4);
		payment2.refund(12.3);
		
		Payment e1 = new CreditCard();
		e1.pay(4.6);
		
//		processPayment(new CreditCard());
//		processPayment(new UPI());
		
	}

}
