import java.util.ArrayList;

public class ArrayListy {
  public static void main(String args[]) {
    ArrayList<Integer> bananaBread = new ArrayList<Integer>(5); //(5) is the initial size, which can be increased or decreased
    // later on
    bananaBread.add(8); //adding elements to arraylist.
    bananBread.add(7); //adding more
    
    for(Integer x : bananaBread)
      System.out.println(x); //printing out elements of the array.
    
    int c = bananaBread.size(); //returns current number of elements (2) NOT the initial amount stated during initialization. 
    
    //removing elements from the arraylist (using index!!):
    bananaBread.remove(1); //removes value 7, making the size 1, counting by index (first element is place 0)
    
    bananaBread.set(0, 98); //changes element at index 0 to 98 (it used to be 8) FIRST parameter is the index, second is value
    
     bananaBread.clear(); //used to clear ALL VALUES from the arraylist
    
    bananaBread.trimToSize(); 
    //trims the array to the amount of elements that it currently contains rather than the initial size
    
    //so many other methods just look at them
  }

}
