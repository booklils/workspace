
public class initializevariableissue {
	public static void main(String args[]){
		//so here I have established a variable 
		//OUTSIDE THE FOR LOOP (in this case though I believe the issue
		//persists with other structures as well)
		
		int sebastian;
		
		for(int i=0;i<8;i++)
		{
			sebastian = 5*i;
			System.out.println(sebastian);
		}
		
	}

}
