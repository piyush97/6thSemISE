public class client {
	
    public static void main( String args[]) {
        
    	outdoorAdventure A;
    	Factory f=new abled();
    	A=f.categoryA("para");
    	A.display();
    	A=f.categoryA("trek");
    	A.display();
    	Factory p=new differentlyAbled();
    	outdoorRegular R;
    	R=p.categoryR("cic");
    	R.display();
    	R=p.categoryR("foo");
    	R.display();
    }

}