import java.io.*;
import java.util.*;

public class Problem1 {
	public static void main(String args[]){
		Scanner reader = new Scanner(System.in);
		System.out.println("Rules of the game: Only inputs 0 through 10 are allowed.");
		System.out.println("Input the best score so far:");
		int bestyet = reader.nextInt();
		
		int[] lastguy = new int[3];
		
		for(int i = 0; i<3;i++)
		{
			System.out.println("Input the three scores of the last contestant.");
			lastguy[i] = reader.nextInt();
		}
		
/**
		// fail safe in case someone decides to be an ass
		if(bestyet>10)
		{
			System.out.println("I told you that was an invalid score! Now everything is ruined!!!");
			System.exit(1);
		}
		
		if(lastguy[1]<0||lastguy[1]>10||lastguy[2]<0||lastguy[2]>10||lastguy[3]<0||lastguy[3]>10)
		{
			System.out.println("I told you that was an invalid score! Now everything is ruined!!!");
			System.exit(1);
		} **/
		// end of them 
		
		int valid,least,most;
		
		for(int j = 0; j<3;j++)
		{
			if(lastguy[1]<lastguy[2])
			{
				most = lastguy[2];
				if(lastguy[1]<lastguy[3])
				{
					least = lastguy[1];
					valid = lastguy[3];
				}
				else
				{
					least = lastguy[3];
					valid=lastguy[1];
				}
			}
			else
			{
				most = lastguy[1];
				if(lastguy[2]<lastguy[3])
				{
					least = lastguy[2];
					valid = lastguy[3];
				}
				else
				{
					least = lastguy[3];
					valid=lastguy[2];
				}
			}
			if(most<lastguy[3])
			{
				most=lastguy[3];
				if(lastguy[2]<lastguy[1])
				{
					least = lastguy[2];
					valid = lastguy[1];
				}
				else
				{
					least = lastguy[1];
					valid = lastguy[2];
				}
			}
			
			if(j==2)
			{
				if(valid<bestyet)
					System.out.println(valid + "IS NOT THE WINNER!");
				else
					System.out.println(valid + "IS THE WINNER!");
			}
		}
		
		
		
		
	}

}
