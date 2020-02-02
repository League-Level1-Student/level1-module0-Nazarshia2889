package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cuteness implements ActionListener {
	JButton one;
	JButton two;
	JButton three;
	
	public void showButton() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		one = new JButton();
		two = new JButton();
		three = new JButton();
		
		frame.setVisible(true);
		frame.add(panel);
		panel.add(one);
		panel.add(two);
		panel.add(three);
		one.setText("Ducks");
		two.setText("Frogs");
		three.setText("Fluffy Unicorns");
		
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		
		frame.pack();
		
	}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == one) {
			showDucks();
		}
		if(e.getSource() == two) {
			showFrog();
		}
		if(e.getSource() == three) {
			showFluffyUnicorns();
		}
			
	}

}
