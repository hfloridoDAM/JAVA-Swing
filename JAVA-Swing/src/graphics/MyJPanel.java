package graphics;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyJPanel extends JPanel{
	
	public MyJPanel () {
		setSize(500,500);
		setBackground(Color.red);
		
		JButton button = new JButton("push me");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				onPushButton();
				
			}
			
		});
		add(button);
	}
	
	private void onPushButton() {
		setBackground(Color.pink);
	}
}
