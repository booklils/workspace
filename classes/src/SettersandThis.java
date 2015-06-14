class Frog {
	private String name; //makes these two instance variables
	private int age; //private to this class, or 'local'
	public String getName() { //must return a String
		return name;
	}
	public int getAge() { //this is a get method
		return age;
	}
	//set methods allow you to set the data eliminating the worry over internal variables
	public void setName(String newName) { //does not need to return anything
		name = newName;
	}
	public void setAge(int age) { 
		//now age is referred to twice in the class
		 //with this second 'age' being local to only code within these two {}
	//in order to refer to the 'age' variable outside of the brackets, type 'this.' in front of 'age'
		this.age = age;
	}
	public void setInfo(String name, int age) {
		setName(name); //'this' is not always necessary
		setAge(age); 
	}
}

public class SettersandThis {
	public static void main(String args[]){
		
		Frog tobio = new Frog();
		
		/**  tobio.name = "Tobio-chan";  //now that 'private' is before the instance
		
		//tobio.age = 1   **/     // variables above, 'age' and 'name' cannot be called from outside of that class
		
		int name = 23; // now name can be used in another class since it is private to the other class.
		
		tobio.setName("Tobio-chan"); //this is effectively 
		//doing the same thing as above (tobio.name = "Tobio-chan");
		//but this is CALLING A METHOD whereas above you are simply calling a variable
		//THIS IS CALLED ENCAPSULATION
		//IT ALLOWS YOU TO HIDE INSTANCE VARIABLES, ONLY NEEDING TO KNOW WHAT TYPE THEY ARE
		
		//'PRIVATE' FURTHER ENFORCES ENCAPSULATION
		
		System.out.println(tobio.getName());
		
		
	}

}
