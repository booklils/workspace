import java.util.*;

public class rnad {
	public static void main(String args[]){
		
		Random random = new Random();
		int[] money = {1,10,5,2,20,500,50,100,1000000,5000,1000,50000,100000,500000,250000,10000};

	    int swap1;
	    int swap2;
	    int temp;
		
		for (int j=0;j<16;j+=1)
        {
            swap1 = random.nextInt(16);
            swap2 = random.nextInt(16);
            temp = money[swap1];
            money[swap1] = money[swap2];
            money[swap2] = temp;
        }
		for (int j = 0;j<16;j++){
			System.out.println(money[j]);
		}
	}

}
