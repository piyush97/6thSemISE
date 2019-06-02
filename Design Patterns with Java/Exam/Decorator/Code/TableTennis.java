
import java.util.*;

/**
 * 
 */
public class TableTennis extends GamesOnTable {

    /**
     * Default constructor
     */
	Sports sports;
    public TableTennis(Sports sports) {
    	this.sports=sports;
    }

    @Override
	public int getCurrentStock() {
		return 2+sports.getCurrentStock();
		// TODO Auto-generated method stub
		
	}


}