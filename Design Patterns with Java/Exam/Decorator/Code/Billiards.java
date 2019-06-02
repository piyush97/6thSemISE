
import java.util.*;

/**
 * 
 */
public class Billiards extends GamesOnTable {

    /**
     * Default constructor
     */
	Sports sports;
    public Billiards(Sports sports) {
    	this.sports=sports;
    }

	@Override
	public int getCurrentStock() {
		return 2+sports.getCurrentStock();
		// TODO Auto-generated method stub
		
	}

}