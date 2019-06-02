
import java.util.*;

/**
 * 
 */
public class BungeeJumping extends AdventureGames {

    /**
     * Default constructor
     */
	Sports sports;
    public BungeeJumping(Sports sports) {
    	this.sports=sports;
    }

	@Override
	public int getCurrentStock() {
		return 2+sports.getCurrentStock();
		// TODO Auto-generated method stub
		
	}

}