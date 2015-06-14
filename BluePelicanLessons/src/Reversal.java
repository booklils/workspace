import java.io.*;
import java.util.*;

public class Reversal {
	public static void main(String args[])
	{
		Scanner name = new Scanner(System.in);
		System.out.println("Please enter your name:");
		String initial = name.nextLine();
		String proper = initial.toLowerCase();
		
		int num = initial.length();
		
		for(int j=num;j>0;j--)
		{
			//String hey = proper.substring(j-1, j);
			System.out.print(proper.substring(j-1, j));
		}
	}

}
