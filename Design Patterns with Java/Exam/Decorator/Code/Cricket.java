
import java.util.*;

/**
 * 
 */
public class Cricket extends StadiumGames {

    /**
     * Default constructor
     */
	Sports sports;
    public Cricket(Sports sports) {
    	this.sports=sports;
    }

    @Override
	public int getCurrentStock() {
		return 2+sports.getCurrentStock();
		// TODO Auto-generated method stub
		
	}


}