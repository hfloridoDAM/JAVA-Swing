package graphics;

import javax.swing.*;
import java.awt.*;

public class MyJFrame extends JFrame {
	
	public MyJFrame () {
		//setSize(500,500);
		//setLocation(100,100);
		setBounds(100,100,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setResizable(false);
		
		setTitle("SWING");
		
		
		
		MyJPanel panel = new MyJPanel();
		add(panel);
		
		setVisible(true);
	}
}
