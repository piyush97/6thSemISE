
import java.util.*;

/**
 * 
 */
public class Trekking extends AdventureGames {

    /**
     * Default constructor
     */
	Sports sports;
    public Trekking(Sports sports) {
    	this.sports=sports;
    }

    @Override
	public int getCurrentStock() {
		return 2+sports.getCurrentStock();
		// TODO Auto-generated method stub
		
	}

}