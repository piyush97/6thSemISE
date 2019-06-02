
import java.util.*;

/**
 * 
 */
public class HighJump extends Athletics {

    /**
     * Default constructor
     */
	Sports sports;
    public HighJump(Sports sports) {
    	this.sports=sports;
    }

    @Override
	public int getCurrentStock() {
		return 2+sports.getCurrentStock();
		// TODO Auto-generated method stub
		
	}

}