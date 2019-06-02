
import java.util.*;

/**
 * 
 */
public class Badminton extends CourtGames {

    /**
     * Default constructor
     */
	Sports sports;
    public Badminton(Sports sports) {
    	this.sports=sports;
    }

	@Override
	public int getCurrentStock() {
		// TODO Auto-generated method stub
		return 2+sports.getCurrentStock();
	}

}