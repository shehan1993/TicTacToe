import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.Random;

//this is main Frame TicTacToe
public class TicTacToe extends JFrame{
	
	//initialize panel and button
	private JPanel TicToePanel;
	private JButton button[] = new JButton[9];
	
	
int[] values = {0,0,0,0,0,0,0,0,0};//get count of clicking 
int[] winO = {0,0,0,0,0,0,0,0,0}; //get count  of 'O' generating
int[] winX = {0,0,0,0,0,0,0,0,0};//get count of 'X' clicking

int addValues; // get count of clicking 
	
	
	public TicTacToe(){
		
		super("Tic Tac Toe"); //title
		setLayout(new GridLayout(3,3)); //seting layout
		
		
		//Icon O = new ImageIcon(getClass().getResource("b.png")); //'O' image
		//Icon X = new ImageIcon(getClass().getResource("x.png")); //'X' image
		
		HandlerClass handler = new HandlerClass(); //this will handle the events
		for(int i= 0;i<button.length;i++){	// set the buttons
			
			button[i]= new JButton();
			
			
			//button[i].setIcon();
			add(button[i]);
				button[i].addActionListener(handler);
			
				
				
		}
			//give names to the buttons
			button[0].setActionCommand("0");		
			button[1].setActionCommand("1");			
			button[2].setActionCommand("2");			
			button[3].setActionCommand("3");			
			button[4].setActionCommand("4");			
			button[5].setActionCommand("5");			
			button[6].setActionCommand("6");			
			button[7].setActionCommand("7");			
			button[8].setActionCommand("8");			
			//button[6].setActionCommand("1");			
		
		
	}
	
	
	
	//handler class
public class HandlerClass implements ActionListener{
		Icon O = new ImageIcon(getClass().getResource("b.png"));//'O' image
		Icon X = new ImageIcon(getClass().getResource("x.png"));//'X' image
		
		
		Random dice = new Random(); //random number for game random part
		int number; //for store random number
		
		
		public void actionPerformed(ActionEvent event){
			
			if("0".equals(event.getActionCommand())){
				
				/**
				
				below first if-else conditions check for stop the react for double choosing same button
				it will check by value array;
				
				all the while loops are set to chosee various buttons 
				
				second if-else also select new button for computer side
				
				for loop is use to calculate click times
				
				if addValues not equal 9 last button while loop run without stoping
				**/
				
				if(values[0] == 0 ){ //first if else
				button[0].setIcon(X);
				
				++values[0];
				++winX[0];
				//System.out.println(values[0]);
				
				number = 0;
				
				while(number == 0){  //while loop
					number = dice.nextInt(9);
					//System.out.println(number);
					
					if(values[number] == 0){ //second if else
					button[number].setIcon(O);
					++values[number];
					++winO[number];
					
					}else{number = 0; }
					
					addValues = 0;
						for(int y:values){
						
						addValues += values[y]; 
						}
						
					if(addValues == 9)
						number =10; 
					
				}
				}
				
			}else if("1".equals(event.getActionCommand())){
				
				if(values[1] == 0 ){ //first if else
				button[1].setIcon(X);
				++values[1];
				++winX[1];
				
				number = 1;
				
				while(number == 1){//while
					number = dice.nextInt(9);
					//System.out.println(number);
					
					if(values[number] == 0){//second if else
					button[number].setIcon(O);
					++values[number];
					++winO[number];
					
					}else{number = 1;}
					
					
					addValues = 0;
						for(int y:values){
						
						addValues += y; 
						}
						
					if(addValues == 9)
						number =10; 
				}
				}
			}else if("2".equals(event.getActionCommand())){
				
				if(values[2] == 0 ){ //first if else
				button[2].setIcon(X);
				++values[2];
				++winX[2];
				
				number = 2;
				
				while(number == 2){ // while
					number = dice.nextInt(9);
					//System.out.println(number);
					
					if(values[number] == 0){ // second if else ...
					button[number].setIcon(O);
					++values[number];
					++winO[number];
					
					}else{ number = 2; }
					
					addValues = 0;
						for(int y:values){
						
						addValues += y; 
						}
						
					if(addValues == 9)
						number =10; 
					
				}
				}
			}else if("3".equals(event.getActionCommand())){
				
				if(values[3] == 0 ){
				button[3].setIcon(X);
				++values[3];
				++winX[3];
				
				number = 3;
				
				while(number == 3){
					number = dice.nextInt(9);
					//System.out.println(number);
					
					if(values[number] == 0){
					button[number].setIcon(O);
					++values[number];
					++winO[number];
					
					}else{ number = 3; }
					
					
					addValues = 0;
						for(int y:values){
						
						addValues += y; 
						}
						
					if(addValues == 9)
						number =10; 
					
				}
				}
			}else if("4".equals(event.getActionCommand())){
				
				if(values[4] == 0 ){
				button[4].setIcon(X);
				++values[4];
				++winX[4];
				
				number = 4;
				
				while(number == 4){
					number = dice.nextInt(9);
					//System.out.println(number);
					
					if(values[number] == 0){
					button[number].setIcon(O);
					++values[number];
					++winO[number];
					 
					}else{ number = 4;}
					
					
					addValues = 0;
						for(int y:values){
						
						addValues += y; 
						}
						
					if(addValues == 9)
						number =10; 
					
					
				}
				}
			}else if("5".equals(event.getActionCommand())){
				
				if(values[5] == 0 ){
				button[5].setIcon(X);
				++values[5];
				++winX[5];
				
				number = 5;
				
				while(number == 5){
					number = dice.nextInt(9);
					//System.out.println(number);
					
					if(values[number] == 0){
					button[number].setIcon(O);
					++values[number];
					++winO[number];
					
					}else{ number = 5;}
					
					addValues = 0;
						for(int y:values){
						
						addValues += y; 
						}
						
					if(addValues == 9)
						number =10; 
					
					
				}
				}
			}else if("6".equals(event.getActionCommand())){
				
				if(values[6] == 0 ){
				button[6].setIcon(X);
				++values[6];
				++winX[6];
				
				number = 6;
				
				while(number == 6){
					number = dice.nextInt(9);
					//System.out.println(number);
					
					if(values[number] == 0){
					button[number].setIcon(O);
					++values[number];
					++winO[number];
					
					}else{ number = 6;}
					
					addValues = 0;
						for(int y:values){
						
						addValues += y; 
						}
						
					if(addValues == 9)
						number =10; 
					
				}
				}
			}else if("7".equals(event.getActionCommand())){
				
				if(values[7] == 0 ){
				button[7].setIcon(X);
				++values[7];
				++winX[7];
				
				number = 7;
				
				while(number == 7){
					number = dice.nextInt(9);
					//System.out.println(number);
					
					if(values[number] == 0){
					button[number].setIcon(O);
					++values[number];
					++winO[number];
					
					}else{ number = 7;}
					
					addValues = 0;
						for(int y:values){
						
						addValues += y; 
						}
						
					if(addValues == 9)
						number =10; 
					
					
				}
				}
			}else if("8".equals(event.getActionCommand())){
				
				if(values[8] == 0 ){
				button[8].setIcon(X);
				++values[8];
				++winX[8];
				
				number = 8;
				
				while(number == 8){
					number = dice.nextInt(9);
					//System.out.println(number);
					
					if(values[number] == 0){
					button[number].setIcon(O);
					++values[number];
					++winO[number];
					
					}else{ number = 8;}
					
					addValues = 0;
						for(int y:values){
						
						addValues += y; 
						}
						
					if(addValues == 9)
						number =10; 
					
				}
				}
			}
			
		
		
		int def = 0;
		
		JFrame frameX = new JFrame();//new frames for show winners of default 
		JFrame frameO = new JFrame();
		JFrame frameD = new JFrame();
		
		//checking the winning conditions
		if(winX[0] + winX[1] + winX[2] == 3){
			
		
			frameX.setVisible(true);//set frame visible
			frameX.setSize(400,400);//set size
			frameX.setContentPane(new JLabel(new ImageIcon("xx.png")));//set picture for winner
			def = 1;
		}else if(winX[3] + winX[4] + winX[5] == 3){
			
		
			frameX.setVisible(true);
			frameX.setSize(400,400);
			frameX.setContentPane(new JLabel(new ImageIcon("xx.png")));
			def = 1;
		}else if(winX[6] + winX[7] + winX[8] == 3){
			
		
			frameX.setVisible(true);
			frameX.setSize(400,400);
			frameX.setContentPane(new JLabel(new ImageIcon("xx.png")));
			def = 1;
		}else if(winX[0] + winX[3] + winX[6] == 3){
			
		
			frameX.setVisible(true);
			frameX.setSize(400,400);
			frameX.setContentPane(new JLabel(new ImageIcon("xx.png")));
			def = 1;
		}else if(winX[1] + winX[4] + winX[7] == 3){
			
		
			frameX.setVisible(true);
			frameX.setSize(400,400);
			frameX.setContentPane(new JLabel(new ImageIcon("xx.png")));
			def = 1;
		}else if(winX[2] + winX[5] + winX[8] == 3){
			
		
			frameX.setVisible(true);
			frameX.setSize(400,400);
			frameX.setContentPane(new JLabel(new ImageIcon("xx.png")));
			def = 1;
		}else if(winX[2] + winX[4] + winX[6] == 3){
			
		
			frameX.setVisible(true);
			frameX.setSize(400,400);
			frameX.setContentPane(new JLabel(new ImageIcon("xx.png")));
			def = 1;
		}else if(winX[0] + winX[4] + winX[8] == 3){
			
		
			frameX.setVisible(true);
			frameX.setSize(400,400);
			frameX.setContentPane(new JLabel(new ImageIcon("xx.png")));
			def = 1;
		}else if(winO[0] + winO[1] + winO[2] == 3){
			
		
			frameO.setVisible(true);
			frameO.setSize(400,400);
			frameO.setContentPane(new JLabel(new ImageIcon("oo.png")));
			def = 1;
		}else if(winO[3] + winO[4] + winO[5] == 3){
			
		
			frameO.setVisible(true);
			frameO.setSize(400,400);
			frameO.setContentPane(new JLabel(new ImageIcon("oo.png")));
			def = 1;
		}else if(winO[6] + winO[7] + winO[8] == 3){
			
		
			frameO.setVisible(true);
			frameO.setSize(400,400);
			frameO.setContentPane(new JLabel(new ImageIcon("oo.png")));
			def = 1;
		}else if(winO[0] + winO[3] + winO[6] == 3){
			
		
			frameO.setVisible(true);
			frameO.setSize(400,400);
			frameO.setContentPane(new JLabel(new ImageIcon("oo.png")));
			def = 1;
		}else if(winO[1] + winO[4] + winO[7] == 3){
			
		
			frameO.setVisible(true);
			frameO.setSize(400,400);
			frameO.setContentPane(new JLabel(new ImageIcon("oo.png")));
			def = 1;
		}else if(winO[2] + winO[5] + winO[8] == 3){
			
			
			frameO.setVisible(true);
			frameO.setSize(400,400);
			frameO.setContentPane(new JLabel(new ImageIcon("oo.png")));
			def = 1;
		}else if(winO[2] + winO[4] + winO[6] == 3){
			
		
			frameO.setVisible(true);
			frameO.setSize(400,400);
			frameO.setContentPane(new JLabel(new ImageIcon("oo.png")));
			def = 1;
		}else if(winO[0] + winO[4] + winO[8] == 3){
			
		
			frameO.setVisible(true);
			frameO.setSize(400,400);
			frameO.setContentPane(new JLabel(new ImageIcon("oo.png")));
			def = 1;
		}else if((def != 1) && (addValues == 9)){
			
			
			frameD.setVisible(true);
			frameD.setSize(400,400);
			frameD.setContentPane(new JLabel(new ImageIcon("d.png")));
			
				}
		
		
		
	}
	
	
	}	

}