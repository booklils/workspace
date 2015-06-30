
public class Machine27 {
	
	private String namey = "Machine type 1"; //this can only be used by 
	//Machine 27, not even by Car27. Private variables are not inherited
	String namo = "Machine type 1"; //can be accessed from anywhere within the PACKAGE
	protected String name = "Machine type 2"; // can be accessed from anywhere within the package
	//and from within any child classes the class may have, like Car27
	
	public void start() {
		System.out.println("Machine started");
	}
	public void stop() {
		System.out.println("Machine stopped");
	}

}
