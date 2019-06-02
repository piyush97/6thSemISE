
import java.util.*;

/**
 * 
 */
public class Football extends StadiumGames {

    /**
     * Default constructor
     */
	Sports sports;
    public Football(Sports sports) {
    	this.sports=sports;
    }

    @Override
	public int getCurrentStock() {
		return 2+sports.getCurrentStock();
		// TODO Auto-generated method stub
		
	}


}