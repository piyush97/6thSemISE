
import java.util.*;

/**
 * 
 */
public class Carrom extends BoardGames {

    /**
     * Default constructor
     */
	Sports sports;
    public Carrom(Sports sports) {
    	this.sports=sports;
    }

	@Override
	public int getCurrentStock() {
		return 2+sports.getCurrentStock();
		// TODO Auto-generated method stub
		
	}

}