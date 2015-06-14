//Lillian Hong 3.29.15

class Persons { //usually classes are put in their own file, and declared public
	String name;
	int age;
	
	void speak() { // void means that this method does not return any value
		System.out.println("My name is: "+name);
	}
	
	int calcRetirement() { //int means the method is returning an integer
		int yearsLeft = 65-age;
		
		System.out.println(yearsLeft + " years till retirement.");
		
		return yearsLeft;
	}
	
	int getAge() { //these are called 'get' methods because they just
		// get values from outside the class, in this instance they get the 'age'
		return age; // this value is actually made in another class, the one below
		
	}
	String getName() {
		return name;
	}
	
	
}



public class GettersandReturnValues {
	public static void main(String args[]) {
		
		Persons person1 = new Persons();
		
		person1.name = "Kaneki";
		person1.age = 17;
		
		person1.speak();
		person1.calcRetirement(); //this method does a calculation for you
		
		int years = person1.calcRetirement(); // this sets the variable years equal 
		//to the value of the return of this specific method. 
		
		System.out.println("Years till retirement: " + years);
		
		int age = person1.getAge();
		
		
		
	}

}
