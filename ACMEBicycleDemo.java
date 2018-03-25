package cfh;

public class ACMEBicycleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ACMEBicycle bike= new ACMEBicycle();
		bike.printStates();
		bike.speedUp(10);
		bike.changeCadence(2);
		bike.applyBrakes(5);
		bike.changeGear(4);
		bike.printStates();

	}

}
