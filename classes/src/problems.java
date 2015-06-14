import java.util.*;


public class problems {
	public boolean scoresIncreasing(int[] scores) {
		Scanner input = new Scanner(System.in);
	    for(int i=0;i<4;i++)
	    {
	  	  System.out.println("Input the first number in an array of five.");
	  	  
	  	  scores[i] = input.nextInt();
	  	  System.out.println(scores[i]);
	    }
	    int comparison=0;
	    for(int i=0;i<4;i++){
	    	if(scores[i] < comparison){
	    		return false;
	    	}
	    	comparison = scores[i] ;
	    }
	    return true;
	}
	
}
