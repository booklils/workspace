import java.util.*;
import java.io.*;

public class lectures {
	public static void main(String args[]){
		// lecture #8 do-while statements
		/**
		Scanner scanner = new Scanner(System.in);
		
		
		// this is the action done
		int value = 0;
		do {
			System.out.println("Enter a number");
			value = scanner.nextInt();
		}
		//this is the condition under which the action stops
		while(value != 5);
		System.out.println("Got 5!");
		
		
		// lecture #9 switch statements
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a command.");
		String text = input.nextLine();
		
		
		switch(text) {
		case "start":
			System.out.println("Machine started.");
			break;
		case "stop":
			System.out.println("Machine stopped.");
			break;
		default:
			System.out.println("That is not a valid command.");
			break;
		}
		
		
		// lecture #10 arrays
		
		int value = 7; // create enough memory, 32 bits, to hold one integer
		// int is a primitive variable, being lowercase. This is like a bucket
		// it is a value variable
		
		int[] values; // this is a REFERENCE variable, more like a label
		
		values = new int[3]; // now there is allocated memory, three spaces for integers
		
		System.out.println(values[0]);
		
		// all values in arrays have a default value of 0
		
		values[0] = 10;
		
		System.out.println(values[0]);
		
		for(int i=0;i<values.length;i++){
			System.out.println(values[i]);
		}
		
		//initializing a declaring at once
		
		int[] numbers = {5,6,7};
		
		for (int a = 0;a<values.length;a++) {
			System.out.println(numbers[a]);
		}
		
		
		// lecture #11 arrays of strings
		
		String [] words = new String[3];
		
		words[0] = "Hello";
		words[1] = "to";
		words[2] = "you";
		
		System.out.println(words[2]);
		
		String[] fruits = {"apple","banana","pear"};
		
		for(String hey: fruits){
			System.out.println(hey);
		}
		
		int value = 0;
		
		String text = null; //string is a class, b/c of the capital letter
		//null = nothing
		
		String[] texts = new String[2];
		System.out.println(texts[0]);
		
		texts[0] = "one";
		
		

		
		// lecture #12 multidimensional arrays
		
		int[] values = {3,5,6354}; // this is a single dimensional array
		
		//you can call a value from the array with a single dimension (0,1, or 2)
		
		int [][] grid = { 
				{2,5,6354}, //row 0
				{5,7}, //row 1
				{2,5,63,3,4} // row 2
		};
		 //to get the seven
		System.out.println(grid[1][1]); //format is [row][column]
		System.out.println(grid[0][2]);
		
		String[][] texts = new String[2][3]; // two rows, three columns
		
		texts[0][1] = "Hello there";
		
		System.out.println(texts[0][1]);
		
		//iterating an array with a multidimensional array requires a nested for loop
		int col;
		for(int row=0;row<grid.length;row++) {
			for(col=0;col<grid[row].length;col++)
			{
				System.out.print(grid[row][col] + "\t"); //adds a tab space
				// note no println, therefore no newline
			}
			
			System.out.println("");
		}
		
		String[][] words = new String[2][]; // does not set each column to anything
		
		words[0] = new String[3]; // sets the number of spaces in words row 0
		
		words[0][1] = "hi there"; // sets the first space in row 0 to the value "hi there"
		
		**/
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
