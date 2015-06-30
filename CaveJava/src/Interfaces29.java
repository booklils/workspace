//with Machine29 and Person29
//Usage: planning out projects with initial object definitions

/*
 * ANALOGY:
 * Bank Account:
 * After opening an account, you expect certain facilities that
 * every bank should have. These facilities are like the methods
 * defined within the Interface files
 */
public class Interfaces29 {
	
	public static void main(String args[]){
		
		 Machine29 mach1 = new Machine29();
		 mach1.start();
		 
		 Person29 person1 = new Person29("Damianos");
		 person1.greet();
		 
		 Info info1 = new Machine29(); //pointing at a class
		 info1.showInfo();
		 //this info1 object can only access the methods from Info
		 
		 Info info2 = person1; //pointing at a specific object defined above
		 info2.showInfo();//Now you can specify what methods you'd like the object created to use
		 
		 outputInfo(mach1);
		 outputInfo(person1);
	}
	//one usage: passing objects to a method using the same Interface
	private static void outputInfo(Info info) {
		info.showInfo();
	}

}
