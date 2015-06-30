// ALSO USES CLASSES Machine27  AND Car27
public class Inheritance27 {
	public static void main(String args[]) {
		Machine27 mach1 = new Machine27();
		
		mach1.start();
		mach1.stop();
		
		Car27 car1 = new Car27();
		
		car1.start();
		car1.wipeWindShield();
		car1.stop(); //CAR now has all the methods of Machine
	}

}
