package liskovSubstitution.before;


public class Migration {
	
	public void flySouth(Duck... ducks) {
		for (Duck duck : ducks) {
			duck.fly();
		}
	}

}
