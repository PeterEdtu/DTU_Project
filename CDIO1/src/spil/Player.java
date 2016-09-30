/**
 * @author Gruppe 40
 * CDIO del 1
 * @version 1.0
 * 
 * Daniel Anusic
 * Daniel Larsen
 * Peter Issam El-Habr s165202
 * Loui Southwick
 * Nemanja Stefan Mitrovic
 */

package spil;

import java.awt.List;
import java.util.ArrayList;

public class Player {

	private static Dice d1 = new Dice();
	private static Dice d2 = new Dice();

	private ArrayList<String> result = new ArrayList<String> ();
	public int id;
	private int score;
	private String name;
	private final int MAX_SCORE = 40;

	/**
	 * Create a player who can roll
	 * @author PeterElHabr
	 * @param name : Define the player's name
	 */
	public Player(String name) {
		this.score = 0;
		this.name = name;
	}

	public String toString() {
		String showscore;
		if (this.win() == false)
			showscore = "["+id+"]"+this.name + "'s score is: " + this.score+" {+"+result+"}";
		else
			showscore = "["+id+"]"+this.name + " wins with " + this.score+"\n-----------------------------------------";
		return showscore;
	}

	/**
	 * Add (amount>0) points to score
	 * Remove (amount<0)
	 * @param amount
	 */
	private void addToScore(int amount) {
		this.score = this.score + amount;
	}

	public boolean win() {
		if (this.score >= MAX_SCORE) {
			return true;
		} else {
			return false;
		}
	}

	public void play() {
		result.clear();
		d1.initiate();
		d2.initiate();
		while (d1.getFaceValue()==d2.getFaceValue()){
			d1.roll();
			d2.roll();
			result.add(""+d1);
			result.add(""+d2);
			this.addToScore(d1.getFaceValue() + d2.getFaceValue());
		}
	}
}
