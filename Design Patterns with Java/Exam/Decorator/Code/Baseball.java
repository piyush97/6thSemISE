
import java.util.*;

/**
 * 
 */
public class Baseball extends StadiumGames {

    /**
     * Default constructor
     */
	Sports sports;
    public Baseball(Sports sports) {
    	this.sports=sports;
    }

	@Override
	public int getCurrentStock() {
		return 2+sports.getCurrentStock();
		// TODO Auto-generated method stub
		
	}

}