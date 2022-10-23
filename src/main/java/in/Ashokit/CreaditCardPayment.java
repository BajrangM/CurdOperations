package in.Ashokit;

public class CreaditCardPayment implements IPayment {

	@Override
	public String pay(double amount) {
		// Logic of Credit Card payment
		return "Payment successful through credit card";
	}

}
