package cfh;

interface Bicycle {
	//wheel revolution per minute 
	void changeCandence(int newValue);
	void changeGear(int newValue);
	void speedUp(int increment);
	void applyBrakes(int decrement);
	void changeCadence(int newValue);
	

}
