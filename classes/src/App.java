class Thing {
	public String name;
	public static String description; //a Static variable only has ONE version,
	//not multiple versions like 'name' may have (example, bob and sue)
	//variables like 'name', with the ability to have multiple versions,
	//are called instance variables, because they differ on the instance of
	//objects. 
	/*
	 * Static variables can only be called with the Class name (Thing) since
	 * it is only associated with the class, having only a single, static,
	 * version of itself
	 */
}
public class App {
	public static void main(String args[]){
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		Thing.description = "I am a thing"; //initializing with the class
		//because this static variable only has one version
		
		System.out.println(Thing.description);
		
		thing1.name = "Bob"; //initializing two different versions of 'name'
		thing2.name = "Sue";//based on the objects they belong to
		
		System.out.println(thing1.name);
		System.out.println(thing2.name);
		
	}

}
