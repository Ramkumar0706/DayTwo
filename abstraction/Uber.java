package abstraction;

class Uber extends Booking{

	@Override
	public void isReady() {
		System.out.println("uber is booked");
	}
}
