
import java.util.*;

/**
 * 
 */
public class Kabaddi extends CourtGames {

    /**
     * Default constructor
     */
	Sports sports;
    public Kabaddi(Sports sports) {
    	this.sports=sports;
    }

    @Override
	public int getCurrentStock() {
		return 2+sports.getCurrentStock();
		// TODO Auto-generated method stub
		
	}


}