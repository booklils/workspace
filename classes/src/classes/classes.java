package classes;

class Person { //almost like String or int, creating a type
	
	//Instance Variables (data or "state")/facts about the 'Person'
		String name;
		int age;
		
		
	// Classes can contain 2 things
	// 1. Data
	// represents the state of objects like name, heartrate, address, mood
	// 2. subroutines (methods)
		
	// methods are like the actions the 'Person' can do (the object)
	
	
}


public class classes { // when a class is public, the name must match the file name

	public static void main(String[] args) { // this is a method, the main method 
		
		//below is an object
		Person person1 = new Person(); // declaring a variable of type 'Person'
		
		person1.name = "Ciel Phantomhive"; 
		person1.age = 13;
		
		
		Person person2 = new Person(); // look another object
		
		person2.name = "Sebastian Michaelis";
		person2.age = 10000;
		
		System.out.println(person1.name);
		
	}

}
