package liskovSubstitution.before;

public class RubberDucky implements Duck {

	public void fly() {
		throw new UnsupportedOperationException();
	}

	public void quack() {
		System.out.println("Quack! Quack! Quack!");
	}	

}
