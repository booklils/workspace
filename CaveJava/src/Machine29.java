///////IMPLEMENTS INFO////////////////////
/*
 * this forces the methods of any method signature
 * found in the Info interface file
 */
public class Machine29 implements Info{ 
	
	//I want machine and person to have the same method, despite
	//the fact that they are completely unrelated
	
	private int id = 7;
	
	public void start(){
		System.out.println("Machine started.");
		
	}

	@Override
	public void showInfo() {
		System.out.println("Machine ID is:" + id);		
	}

}
