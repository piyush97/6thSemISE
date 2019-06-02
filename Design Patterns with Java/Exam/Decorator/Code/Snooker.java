
import java.util.*;

/**
 * 
 */
public class Snooker extends GamesOnTable {

    /**
     * Default constructor
     */
	Sports sports;
    public Snooker(Sports sports) {
    	this.sports=sports;
    }

    @Override
	public int getCurrentStock() {
		return 2+sports.getCurrentStock();
		// TODO Auto-generated method stub
		
	}


}