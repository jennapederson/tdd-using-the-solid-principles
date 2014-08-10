package interfaceSegregation.after;

public class Porsche implements Vehicle, ManualTransmission {

	private AuxillaryAudioControls audio = new IpodControls();
	
	private int gear = 1;

	public void drive() {
		System.out.println("Driving...");
	}

	public void changeGear(int gear) {
		this.gear = gear; 
	}

	public void playAudio() {
		audio.play();
	}

	public int getGear() {
		return gear;
	}

}
