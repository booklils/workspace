

class Machine {
	private String name;
	private int code;
	
	public Machine() {
		this("Boyd", 18); //a call to constructor must be the first line
		System.out.println("Contructor running...");
	}
	public Machine(String name){
		System.out.println("Second constructor running...");
		this.name = name;
	}
	public Machine(String name, int code) {
		System.out.println("Third constructor is running...");
		this.name = name;
		this.code = code;
	}
}
public class Constructors23 {
	public static void main(String[] args){
		Machine machine1 = new Machine();
		new Machine();
		Machine machine2 = new Machine("Sin Liu Vega");
	}

}
