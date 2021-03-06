
class Robot {
	public void speak(String hey) { // the () is like a shoot, you can throw data into them
		System.out.println(hey); //hey is just a variable name
		// the above (String hey) is just like declaring a variable
	}
	public void jump(int height) {
		System.out.println("Jumping: "+height);
	}
	public void move(String direction, double distance) { //COMMAS!!
		System.out.println("Moving "+distance+" in direction "+ distance+" meters");
		
	}
}
public class MethodParameters {
	public static void main(String args[]){
		Robot hinata = new Robot();
		
		hinata.speak("Hi I'm Hinata."); //this will send this string up to the () next to speak().
		hinata.jump(7);
	
		hinata.move("West", 12.2); //these must be separated with commas
				
		String greeting = "Hello there.";
		
		hinata.speak(greeting); //it will give the value of this variable, greeting, 
		//to the speak() which will replace the 'label' of "Hello there." with 'text' instead of 'greeting'
		//this means that YOU DO NOT need to know the name of variables defined in methods of other classes, 
		//just the data type so you can submit the proper type for it to use
	
		int value = 15;
		hinata.jump(value);
	}

}
