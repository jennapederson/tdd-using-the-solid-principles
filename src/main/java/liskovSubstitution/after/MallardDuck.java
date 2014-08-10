package liskovSubstitution.after;

public class MallardDuck implements Duck, Flyable {

	public boolean fly() {
		return true;
	}
	
	public void quack() {
		System.out.println("Quack! Quack! Quack!");
	}	

}
