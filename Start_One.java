package Frames;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * RMD Visitor Sign in Program
 * By: Lillian (Chenxin) Hong, 2016
 * Have fun editing this.
 */
public class Start_One {
	
//first page
	private JFrame frame_one;
	private JPanel pane_one;
	private JLabel title; //rmd logo

	
	
	public Start_One(){
		new RepaintScreensaver();
		setup();
		showStartOne();
		
	}
	
	public static void main(String args[]){
		Start_One startscreen = new Start_One();
		
	}
	
	private void setup(){
		frame_one = new JFrame();
		frame_one.setSize(1920,1080);
		GridLayout grid_one = new GridLayout(0,1);
		frame_one.setLayout(grid_one);
		
		////CHANGING IMAGEICON SIZE for the logo
		ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Frames/resources/bigrmdlogo.png")); // load the image to a imageIcon
		Image image = imageIcon.getImage(); // transform it 
		Image newimg = image.getScaledInstance(486, 146,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		imageIcon = new ImageIcon(newimg); 
		
		//setting background image to a JLabel, which becomes the frame's content pane.
		ImageIcon backgroundImage = new ImageIcon(getClass().getClassLoader().getResource("Frames/resources/rmdbg.jpg"));
		JLabel contentPane = new JLabel();
		contentPane.setIcon( backgroundImage );
		contentPane.setLayout( new GridLayout(0,1) );
		frame_one.setContentPane( contentPane );

		//initializing label of the logo.
		title = new JLabel("",imageIcon,JLabel.CENTER);
		title.setSize(700,100);
		title.setVerticalAlignment(JLabel.NORTH);
		title.setMinimumSize(new Dimension(400,200));
		title.setPreferredSize(new Dimension(400,200));
		title.setMaximumSize(new Dimension(400,200));
		
		pane_one = new JPanel();
		pane_one.setLayout(new GridLayout(0,1));
		pane_one.setOpaque(false);
		pane_one.setBorder(BorderFactory.createEmptyBorder(100, 10, 10, 10)); 
		
		contentPane.add(pane_one);
		frame_one.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame_one.setUndecorated(true);
		frame_one.setVisible(true);
		
	}
	
	private void showStartOne(){
		
		ImageIcon enterIcon = new ImageIcon(getClass().getClassLoader().getResource("Frames/resources/signin.jpg")); // load the image to a imageIcon
		Image image = enterIcon.getImage(); // transform it 
		Image newimg = image.getScaledInstance(400, 200,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		enterIcon = new ImageIcon(newimg);
		
		ImageIcon outIcon = new ImageIcon(getClass().getClassLoader().getResource("Frames/resources/signout.jpg")); // load the image to a imageIcon
		Image outimage = outIcon.getImage(); // transform it 
		Image outnewimg = outimage.getScaledInstance(400, 200,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		outIcon = new ImageIcon(outnewimg);
		
		JButton in = new JButton("",enterIcon);
		in.setActionCommand("signin");
		in.addActionListener(new buttonClicked());
		//so the button's default bkground doesn't show
		in.setOpaque(false); 
		in.setContentAreaFilled(false);
		in.setBorderPainted(false);
		
		JButton out = new JButton("",outIcon);
		out.setActionCommand("signout");
		out.addActionListener(new buttonClicked());
		out.setOpaque(false);
		out.setContentAreaFilled(false);
		out.setBorderPainted(false);
		
		ImageIcon adminicon = new ImageIcon(getClass().getClassLoader().getResource("Frames/resources/adminpadlock.png"));
		JButton admin = new JButton("admin",adminicon);
		admin.addActionListener(new AdminListener());
		admin.setOpaque(false); //making button transparent
		admin.setContentAreaFilled(false);
		admin.setBorderPainted(false);
		
		JPanel visoremp = new JPanel(); 
		visoremp.setLayout(new FlowLayout()); //this allows the two buttons to be next to each other
		visoremp.setSize(600,300);
		visoremp.setOpaque(false);
		visoremp.add(in);
		visoremp.add(out);
		
		JPanel small = new JPanel(); //just a panel for the small admin button. W/o it, the button would span the whole grid space
		small.setLayout(new FlowLayout());
		small.add(admin);
		small.setOpaque(false);
	
		pane_one.add(title);
		pane_one.add(visoremp);
		pane_one.add(small);

		frame_one.setVisible(true);
		
	}
	private class AdminListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			frame_one.dispose();
			new AdminLogin();
		}
	}
	private class buttonClicked implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			if(command.equals("signin")){
				frame_one.dispose();
				try {
					Visitor_Two vistwo = new Visitor_Two();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
			else if(command.equals("signout")){
				frame_one.dispose();
				new SignOut();
			}
			
		}
		
	}

}
