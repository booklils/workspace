package classes;

class Persons { //almost like String or int, creating a type
	
	//Instance Variables (data or "state")/facts about the 'Persons'
		String name;
		int age;
		
		
	// Classes can contain 2 things
	// 1. Data
	// represents the state of objects like name, heartrate, address, mood
	// 2. subroutines (methods)
		
	// methods are like the actions the 'Persons' can do (the object)
		
	void speak() { //this is a method
		System.out.println("My name is " +name +" and I am " +age+" years old.");
	}
	void sayHello() {
		System.out.println("Hello there.");
	}
	
}


public class methods { // when a class is public, the name must match the file name

	public static void main(String[] args) { // this is a method, the main method 
		
		//below is an object
		Persons Persons1 = new Persons(); // declaring a variable of type 'Persons'
		
		Persons1.name = "Ciel Phantomhive"; 
		Persons1.age = 13;
		
		Persons1.speak(); // this runs whatever method is established above under the void... etc.
		
		Persons Persons2 = new Persons(); // look another object
		
		Persons2.name = "Sebastian Michaelis";
		Persons2.age = 10000;
		
		Persons2.speak(); //invoking the method
		Persons2.sayHello(); // invoking another method
		
		System.out.println(Persons1.name);
		
	}

}
