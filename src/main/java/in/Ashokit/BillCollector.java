package in.Ashokit;

public class BillCollector {
	
	private IPayment payment; 									// need to initialise the object to avoid null pointer exception
	
	public void setPayment(IPayment payment) {             // we take setter method here to initialise the objet 
		
		this.payment=payment;
	}
	
	
	public BillCollector() {
		
		// TODO Auto-generated constructor stub
	}


	public BillCollector(IPayment payment) {
		
		this.payment = payment;
	}


	public void collectPayment(double amount) {
		
	String status = payment.pay(amount);
	System.out.println(status);
	}

}