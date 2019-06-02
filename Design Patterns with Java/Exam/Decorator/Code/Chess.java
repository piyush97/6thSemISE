
import java.util.*;

/**
 * 
 */
public class Chess extends BoardGames {

    /**
     * Default constructor
     */
	Sports sports;
    public Chess(Sports sports) {
    	this.sports=sports;
    }

	@Override
	public int getCurrentStock() {
		return 2+sports.getCurrentStock();
		// TODO Auto-generated method stub
		
	}

}