// extending classes to make your own version of classes
public class Car27 extends Machine27{
//Car inherites everything from Machine (a car is a machine)
	//right click, source, Override/Implement methods, make an @Override method
	@Override //this is an Eclipse annotation (class name) which checks if this is really an Overriden Method
	public void start() {
		System.out.println("Car started");
	}
	/* INEFFICIENT METHOD
	public void start() { //signature is the same as in Machine27
		System.out.println("Car started"); //method has overridden the 
		//parent class's method
	}*/
	public void wipeWindShield() {
		System.out.println("Wiping wind shield...");
	}
	public void showInfo() {
		System.out.println("Car name" + name);
	}

	
}
