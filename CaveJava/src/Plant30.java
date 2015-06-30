
public class Plant30 {
	//public 
	//bad practice: instance variables are usually private or protected
	public static String name;
	public final static int ID = 8;
	//private
	//only accessed within the class
	private String type;
	//protected
	//accessed from within the class and 
	//any subclasses and classes in the same package
	protected String size;
	
	int height; //without before annotation, this is package level security
	//WILL NOT BE ABLE TO BE ACCESSED BY SUBCLASSES IF THEY ARE NOT IN SAME PACKAGE
	
	public Plant30(){
		this.name = "Groot";
		//this.name would be equivalent
		this.type = "Tree";
		this.size = "medium";
		this.height = 8;
	}
}
