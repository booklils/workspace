//more than one Interfaces can be implemented
//separated by commas (ex: Info, Dino, Axel)
public class Person29 implements Info{
	
	private String name;
	
	public Person29(String name) {
		this.name = name;
	}
	
	public void greet() {
		System.out.println("Hello there.");
	}

	@Override
	public void showInfo() {
		System.out.println("Person's name is:" + name);
		
	}

}
