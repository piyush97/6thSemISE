
import java.util.*;

/**
 * 
 */
public class Basketball extends CourtGames {

    /**
     * Default constructor
     */
	Sports sports;
    public Basketball(Sports sports) {
    	this.sports=sports;
    }

	@Override
	public int getCurrentStock() {
		return 2+sports.getCurrentStock();
		// TODO Auto-generated method stub
		
	}

}