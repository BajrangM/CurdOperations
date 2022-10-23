package in.Ashokit;

public class Test {
	public static void main(String[] args) {
		BillCollector bc=new BillCollector();
		
		bc.setPayment(new CreaditCardPayment());	  // injecting credit card obj into bill collector (setter injection)
		
//		BillCollector bc1=new BillCollector(new UpiPayment());    //// injecting credit card obj into bill collector (Constuctor injection)
		
		bc.collectPayment(1500);
	}

}
