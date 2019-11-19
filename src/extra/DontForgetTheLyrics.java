package extra;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class DontForgetTheLyrics {
	/*
	 * For this game, we'll play the start of a song, and the player has to guess the rest of the lyrics.
	 * 
	 * 1. To record a sound clip, open Audacity and record your song.
	 * 
	 * 2. Click File -> Export Audio, and save your file on the Desktop.
	 * 
	 * 3. Drag your file from the Desktop into the "default package" under "src".
	 */
	
	public static void main(String[] args) {
		// 4. Make a pop-up to explain the game.
		JOptionPane.showMessageDialog(null, "Here is where you try not to forget the lyrics");

		// 5. Use the playSound method to play your song.
		playSound("correct.wav");
		// 6. Make a pop-up for the player to type their answer.
		String answer = JOptionPane.showInputDialog(null, "What sound just occured");
		// 7. If they answered correctly, tell them that they were right.
		if(answer.equalsIgnoreCase("ding")) {
		JOptionPane.showMessageDialog(null, "congrats you somehow got the answer");
			
		}
		// 8. Otherwise, tell them they are wrong, and give them the answer.
		JOptionPane.showMessageDialog(null, "It is possible just figure it out again.");
			
		
		// 9. Record another sound and repeat steps 5-8.
		playSound("wrong.wav");
		String answerd = JOptionPane.showInputDialog("What sound just occured?");
			
		
	if(answerd.equalsIgnoreCase("ding")) {
		JOptionPane.showMessageDialog(null, "Congrats you somehow got it correct for the 2nd time you derserve a cookie.");
	}
		JOptionPane.showMessageDialog(null, "It is possible just figure it out again");
		// 10. [optional] Add a points variable that will calculate their final score.
	}

	public static void playSound(String fileName) {
		AudioClip audioClip = JApplet.newAudioClip(new DontForgetTheLyrics().getClass().getResource(fileName));
		audioClip.play();
	}
}


