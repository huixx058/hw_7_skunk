import java.util.*;

public class Die {
	
	public static final int SKUNK = 1;
	public static final int DEUCE = 2;
	
	//method to roll die
	public int roll() {
		Random r = new Random();
		return r.nextInt(7) + 1;
	}	
}




