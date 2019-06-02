
import java.util.*;

/**
 * 
 */
public class Paragliding extends AdventureGames {

    /**
     * Default constructor
     */
	Sports sports;
    public Paragliding(Sports sports) {
    	this.sports=sports;
    }

    @Override
	public int getCurrentStock() {
		return 2+sports.getCurrentStock();
		// TODO Auto-generated method stub
		
	}


}