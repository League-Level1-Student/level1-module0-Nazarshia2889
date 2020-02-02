package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class soundeffects implements ActionListener {
	JButton one;
	JButton two;
	JButton three;
	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		
		one = new JButton();
		two = new JButton();
		three = new JButton();
		
		one.setText("Sound Effect 1");
		two.setText("Sound Effect 2");
		three.setText("Sound Effect 3");
		
		frame.add(panel);
		panel.add(one);
		panel.add(two);
		panel.add(three);
		
		frame.pack();
		
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
	
	}
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == one) {
			playSound("doorbell.wav");
		}
		if(e.getSource() == two) {
			playSound("bluezone.wav");
		}
		if(e.getSource() == three){
			playSound("beep.wav");
			}
		}
}
