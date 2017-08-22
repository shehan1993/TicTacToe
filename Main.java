import javax.swing.JFrame;
import java.awt.GridLayout;
class Main{
	
	public static void main(String[] args){
		
		TicTacToe Tic = new TicTacToe();
		
		Tic.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		Tic.setSize(400,400);
		Tic.setResizable(false);
		Tic.setVisible(true);
		//Tic.setLayout(new GridLayout(3,3));
		
		
	}
	
}