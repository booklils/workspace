class Thing {
	public String name; //this is an instance variable, used by objects
	public static String description;
	//static variables only belong to the class
	//there can only be one version
	public final static int LUCKY_NUMBER = 8; //final values create constants that 
	//CANNOT BE REASSIGNED, like Math's PI constant	
	//these must be assigned values at creation; 
	
	public int id; //default value of 0
	
	public static int count=0;
	//static can also be used to count the number of objects created
	public Thing() {
		
		id = count; //gives the object an ID of whatever number object it was created
		
		count++; //counting each time this constructor is used
	}
	
	public void showName() {
		System.out.println(description); //instance methods can use static variables
		System.out.println(name);
		System.out.println("I am a g spy motherfucker");
	}
	
	//similarly, static METHODS are called by the class only
	public static void showInfo() {
		//static methods can access
		//static data (like description) because they both belong to the class
		//STATIC VARIABLES CANNOT USE INSTANCE VARIABLES
		System.out.println(description);
		System.out.println("I am g af son");
	}
}
public class StaticandFinal24 {
	public static void main(String args[]){
		
		//to call a static variable you must use
		//the class, NOT the object
		Thing.description = "I am an assasin spy";
		System.out.println(Thing.description);
		
		Thing.showInfo();
		
		Thing thing1 = new Thing();
		Thing thing2 =  new Thing();
		
		System.out.println(Thing.count);//counting number of objects made
		
		
		thing1.name = "Boyd";
		thing2.name = "Sin";
		
		//System.out.println(thing1.name);
		//System.out.println(thing2.name);
		
		thing1.showName();
		thing2.showName();
		
		System.out.println(Math.PI); //this is an 
		//example of a static constant from the class Math
		//constant values are usually UPPERCASE
		System.out.println(Thing.LUCKY_NUMBER);
		//these constants cannot be reassigned 
	}
	
}
