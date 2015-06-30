//toString for DEBUGGING 	
//USAGE////////////////////////////
// to be able to have a String representative of an object with which 
// you can identify objects by these Strings for debugging purposes 
class Frog {
	
	private int id;
	private String name;
	
	public Frog(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public String toString() {
		
		return String.format("%5d: %d", id, name);
		
		/*
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(": ").append(name);
		return sb.toString();
		*/
		//more inefficient method: return id + ":" + name;
	}
}
public class ThetoStringMethod26 {
	public static void main(String args[]){
		
		Frog frog1 = new Frog(7, "Hsin");
		Frog frog2 = new Frog(8, "Boyd");

		System.out.println(frog1); //sysout automatically tries to 
		//invoke a toString method for a String
		
		

	}

}
