package newPongProject;
import java.awt.Color;

import javax.swing.JFrame;



public class Pong extends JFrame {
	
	   private final static String WINDOW_TITLE = "Pong";
       private final static int WINDOW_WIDTH = 800;
       private final static int WINDOW_HEIGHT = 600;
       private final static Color BACKGROUND_COLOUR = Color.BLACK;
       
	public Pong() {
        	setTitle("Pong");
        	setSize(800, 600);
        	setResizable(false);
        	add(new pongPanel());
        	setVisible(true);
        	setDefaultCloseOperation(EXIT_ON_CLOSE);
        	setBackground(Color.BLACK);
	}
 
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
	    public void run() {
		new Pong();
		
	    }
        });
	}
}

