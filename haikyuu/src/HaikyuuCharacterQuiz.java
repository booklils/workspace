
//Lillian Hong
//What am I doing
//4.29.15
import javax.swing.*;

public class HaikyuuCharacterQuiz {
	public static void main(String args[]){
		new HaikyuuCharacterQuiz();
	}
	HaikyuuCharacterQuiz(){
		int hinata=0, suga=0, daichi=0, tsukki=0, nishinoya=0, asahi=0, yamaguchi=0, kageyama=0,tanaka=0;
		int countmost[] = new int[7];
		
		int first = JOptionPane.showConfirmDialog(null,"Do you want to know which Haikyuu character you are?");
		while(first == 1){
			JOptionPane.showMessageDialog(null, "Too bad sorry");
			break;
		}
		/////////////////////////////////////////////

		String one[] = {"below 5 ft","5 to 6 ft","above 6 ft"};
		int one1 = JOptionPane.showOptionDialog(null, "What is your height?","Help a man out",0,JOptionPane.QUESTION_MESSAGE,null,one,0);
		if(one1 == 0){
			hinata++;
			nishinoya++;
		}
		if(one1 == 1){
			daichi++;
			suga++;
			tanaka++;
		}
		if(one1 == 2){
			kageyama++;
			tsukki++;
			yamaguchi++;
			asahi++;
			//look up heights
		}
		////////////////////////////////////////
		String two[] = {"Practice for sports","Go to the movies","Read and Study at home","Run five hundred laps around the track field"};
		int two2 = JOptionPane.showOptionDialog(null, "It's the night before a test. What are you going to do?","Procrastination ftw",0,JOptionPane.QUESTION_MESSAGE,null,two,0);
		
		if(two2 == 0){
			kageyama++;
			hinata++;
		}
		if(two2 == 1){
			nishinoya++;
			
			tanaka++;
		}
		if(two2==2){
			daichi++;
			suga++;
			asahi++;
		}
		if(two2==3){
			hinata++;
			nishinoya++;
		}
		////////////////////////////////////////
		String three[]={"Shrink back and run away","Yell at them back","Lecture them on immaturity","Bully them in return"};
		int three3 = JOptionPane.showOptionDialog(null, "You're getting bullied. What do you do?","Bully free zone",0,JOptionPane.QUESTION_MESSAGE,null,three,0);
		if(three3==0){
			asahi++;
			nishinoya++;
		}
		if(three3==1){
			nishinoya++;
			hinata++;
			kageyama++;
			tanaka++;
		}
		if(three3==2){
			daichi++;
			suga++;
		}
		if(three3==3){
			tsukki++;
		}
		//////////////////////////////////////////////
		String four[]={"Curly","Straight","Somewhere in between"};
		int four4 = JOptionPane.showOptionDialog(null, "What kind of hair do you have?","Hair",0,JOptionPane.QUESTION_MESSAGE,null,four,0);
		if(four4==0){
			hinata++;
		}
		if(four4==1){
			kageyama++;
			daichi++;
			tsukki++;
			nishinoya++;
			tanaka++;
		}
		if(four4==2){
			yamaguchi++;
			suga++;
		}
		///////////////////////////////////////////////////////////////////////////
		String five[]={"black","brown","orange","blond","grey"};
		int five5=JOptionPane.showOptionDialog(null, "What is your hair color?","colouuurs",0,JOptionPane.QUESTION_MESSAGE,null,five,0);
		if(five5==0){
			kageyama++;
			nishinoya++;
			yamaguchi++;
			daichi++;
		}
		if(five5==1){
			asahi++;
		}
		if(five5==2){
			hinata+=2;
		}
		if(five5==3){
			tsukki++;
		}
		if(five5==4){
			tanaka++;
			suga++;
		}
		/////////////////////////////////////////////////////////
		String six[]={"Freshman","sophomore","junior","senior"};
		int six6 = JOptionPane.showOptionDialog(null, "What highschool grade are you in?","Karasuno",0,JOptionPane.QUESTION_MESSAGE,null,six,0);
		if(six6==0){
			kageyama++;
			hinata++;
			tsukki++;
			yamaguchi++;
		}
		if(six6==1){
			nishinoya++;
		}
		if(six6==2){
			tanaka++;
		}
		if(six6==3){
			daichi++;
			suga++;
			asahi++;
		}
		/////////////////////////////////////////////////////
		
		String seven[]={"yes","no"};
		int seven7=JOptionPane.showOptionDialog(null, "Have you ever had your head shaved?","personal question #51",0,JOptionPane.QUESTION_MESSAGE,null,seven,0);
		if(seven7==0){
			tanaka++;
		}
		////////////////////////////////////////////////////////////
		String eight[]={"Treasurer,","President","Secretary"};
		int eight8=JOptionPane.showOptionDialog(null, "What is your dream job within a club?","personal question #52",0,JOptionPane.QUESTION_MESSAGE,null,eight,0);
		if(eight8 == 1){
			daichi++;
		}
		//////////////////////////////////////////////////////////
		String nine[]={"Juice Box","Donut","Cookie","Taco"};
		int nine9=JOptionPane.showOptionDialog(null, "What is your most prefered snack on this list?","personal question #53",0,JOptionPane.QUESTION_MESSAGE,null,nine,0);
		if(nine9 == 0)
			kageyama++;
		///////////////////////////////////////////////////////////
		int team[]=new int[9];
		
		team[0]=hinata;
		team[1]=suga;
		team[2]=daichi;
		team[3]=asahi;
		team[4]=nishinoya;
		team[5]=tsukki;
		team[6]=yamaguchi;
	    team[7]=tanaka;
		team[8]=kageyama;
		
		int compare = 0;
		int num = 0;
	
		
		for(int b=0;b<9;b++){
			if(team[b] > compare){
				compare = team[b];
			}
		}
		if(compare == hinata)
			JOptionPane.showMessageDialog(null,"You are Hinata!");
		if(compare == suga)
			JOptionPane.showMessageDialog(null,"You are Sugawara!");
		if(compare == kageyama)
			JOptionPane.showMessageDialog(null,"You are Kageyama!");
		if(compare == asahi)
			JOptionPane.showMessageDialog(null,"You are Asahi!");
		if(compare == nishinoya)
			JOptionPane.showMessageDialog(null,"You are Nishinoya!");
	
	if(compare == daichi)
		JOptionPane.showMessageDialog(null,"You are Daichi!");
	if(compare == tsukki)
		JOptionPane.showMessageDialog(null,"You are Tsukki!");
	if(compare == yamaguchi)
		JOptionPane.showMessageDialog(null,"You are Yamaguchi!");
	}
		
	

}

