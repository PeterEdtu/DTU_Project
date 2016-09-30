/**
 * @author Gruppe 40
 * CDIO del 1
 * 
 * Daniel Anusic
 * Daniel Larsen
 * Peter Issam El-Habr
 * Loui Southwick
 * Nemanja Stefan Mitrovic
 */

package spil;

public class Player {

	private static Dice d1 = new Dice();
	private static Dice d2 = new Dice();

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
			showscore = this.name + "'s score is: " + this.score;
		else
			showscore = this.name + " wins with " + this.score;
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
		d1.roll();
		d2.roll();
		this.addToScore(d1.getFaceValue() + d2.getFaceValue());
	}
}
