import java.io.*;
import java.util.*;

public class timeis {
	public static void main(String args[]){
		 Scanner scan = new Scanner(System.in);
		 int cases = scan.nextInt();
		 
		 for (int i=0;i<cases;i++){
			 int sec=scan.nextInt();
			 if(sec<60)
			 {
				 System.out.println(sec+" seconds");
			 }
			 else
			 {
				 
				 if(sec<3600)
				 {
					 int minutes=sec/60;
					 System.out.println(minutes+" minutes");
					 int secs=sec%60;
					 System.out.println(secs+" second(s)");
				 }
				 else
				 {
					 if(sec<86400)
					 {
						 int hours=sec/3600;
						 System.out.println(hours+" hours");
						 int minutes=(sec-(sec%3600))%60;
						 System.out.println(minutes+" minutes");
						 int secs=(sec-(minutes))%60;
						 System.out.println(secs+" second(s)");
					 }
					 else
					 {
						 if(sec<31536000)
						 {
							 int days= sec/86400;
							 System.out.println(days+" days");
							 int hours=(sec-(sec%86400))%24;
							 System.out.println(hours+" hours");
							 int minutes=(sec-hours)%60;
							 System.out.println(minutes+" minutes");
							 int secs=(sec-minutes)%60;
							 System.out.println(secs+" second(s)");
						 }
						
					 }
				 }
			 }
		 }
	}

}


