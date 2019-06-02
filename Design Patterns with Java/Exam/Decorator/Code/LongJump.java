
import java.util.*;

/**
 * 
 */
public class LongJump extends Athletics {

    /**
     * Default constructor
     */
	Sports sports;
    public LongJump(Sports sports) {
    	this.sports=sports;
    }

    @Override
	public int getCurrentStock() {
		return 2+sports.getCurrentStock();
		// TODO Auto-generated method stub
		
	}


}