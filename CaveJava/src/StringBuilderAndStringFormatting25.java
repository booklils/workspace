
public class StringBuilderAndStringFormatting25 {
	public static void main(String args[]){
		//INEFFICIENT METHOD***
		//once you made a string, you can never change it
		String info = "";
		//YOU ARE NOT CHANGING "info" BELOW
		//ALL YOU ARE DOING IS CREATING NEW STRINGS
		info += "My name is Bob,";
		System.out.println(info); //DIFFERENT OUTPUT	
		info += " ";
		info += "I am a builder";
		
		System.out.println(info); //this outputs 
		//something different than the above sysout
		//////////////////////////////////////////////////////////
		//MORE EFFICIENT***
		StringBuilder sb = new StringBuilder("");
		//this is just changing the same String
		sb.append("My name is Laurent");
		sb.append(" ");
		sb.append("I am a lion tamer.");
		
		System.out.println(sb.toString());
		
		StringBuilder s = new StringBuilder();
		
		s.append("My name is Boyd.")
		.append(" ")
		.append("I am a spy");
		
		System.out.println(s.toString());
		
		//STRINGBUILDER IS THE SAME THING AS STRINGBUFFER, BUT NOT THREAD SAFE
		
		///////Formatting//////////////////////////////////////
		
		System.out.print("Here is some text.\tThat was a tab.\nThat was a newline");
		
		//printf allows for FORMATTING SYMBOLS to be added into the print, like %d
		System.out.printf("Total cost is %10d, quantity is %d\n", 5, 120);
		//%10d means that this is output in a field that is ten characters wide
		
		
		//EXAMPLE USE////////////////////////////////
		//this aligns everything in the loop no matter what size of %d or String
		
		for(int i=0;i<20;i++){
			System.out.printf("%2d: Some text here\n", 8);
		}
		//%d is for number input
		//%s is for String inputs
		//%f is for float point values
		
		System.out.printf("Total value: %5.1f \n", 5.6);
		
		
	}

}
