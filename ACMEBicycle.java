package cfh;

public class ACMEBicycle implements Bicycle{
	private  int cadence = 0;
	private int speed = 0;
	private int gear = 1;
	
	// The compiler will now require that methods
	   // changeCadence, changeGear, speedUp, and applyBrakes
	   // all be implemented. Compilation will fail if those
	   // methods are missing from this class.

	    public void changeCadence(int newValue) {
	         cadence = newValue;
	    }
	  
	    public void changeGear(int newValue) {
	         gear = newValue;
	    }
	    
	    
	    public void speedUp(int increment) {
	         speed = speed + increment;   
	    }
	    
	    
	    public void applyBrakes(int decrement) {
	         speed = speed - decrement;
	    }

	    public void printStates() {
	         System.out.format("cadence:%3d\tspeed:%3d\tgear:%3d\n", cadence, speed, gear );
	    }

		public void changeCandence(int newValue) {
			// TODO Auto-generated method stub
			
		}

		

	  
	    
	}


