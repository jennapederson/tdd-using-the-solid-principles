package interfaceSegregation.after;

public class OldBeaterAutomaticTransmission implements Vehicle {

	private int gear = 1;
	
	public void drive() {
		gear = 2;
		System.out.println("Driving...");
	}

	public int getGear() {
		return gear;
	}

}
