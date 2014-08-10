package liskovSubstitution.after;


public class Migration {

	public void flySouth(Flyable... flyables) {
		for (Flyable flyable : flyables) {
			flyable.fly();
		}
	}
}
