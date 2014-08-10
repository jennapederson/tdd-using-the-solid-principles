package interfaceSegregation.before;

public class OldBeaterAutomaticTransmission implements Vehicle {

	private int gear = 1;
	
	public void drive() {
		gear = 2;
		System.out.println("Driving...");
	}

	public void changeGear(int gear) {
		System.out.println("Driver cannot change gear on an automatic transmission.");
	}

	public void playIPod() {
		System.out.println("Car is too old to support playing an iPod");
	}

	public int getGear() {
		return gear;
	}

}
