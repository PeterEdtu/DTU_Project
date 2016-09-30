/**
 * @author Gruppe 40
 * CDIO del 1
 * @version 1.1
 * 
 * Daniel Anusic
 * Daniel Larsen
 * Peter Issam El-Habr s165202
 * Loui Southwick
 * Nemanja Stefan Mitrovic
 */

package spil;

public class Player {

	private static Dice d1 = new Dice();
	private static Dice d2 = new Dice();

	private final int MAX_SCORE = 40;
	private int id;
	private int score;
	private String name;

	/**
	 * Create a player who can roll
	 * @author PeterElHabr
	 * @param name : Define the player's name
	 */
	public Player(String name, int id) {
		this.id = id;
		this.score = 0;
		this.name = name;
	}

	public String toString() {
		String showScore;
		if (this.win() == false) showScore = "[" + id + "] " + this.name + "'s score is now: " + this.score + "\n";
		else
			showScore = "[" + id + "] " + this.name + " wins with " + this.score + "!\n-----------------------------------------";
		return showScore;
	}

	/**
	 * Add (amount>0) points to score
	 * Remove (amount<0)
	 * @param amount
	 */
	private void addToScore(int amount) {
		this.score += amount;
	}

	public boolean win() {
		if (this.score >= MAX_SCORE) {
			return true;
		} else {
			return false;
		}
	}

	public int playOnce() {
		return d1.roll();
	}

	public void play() {
		d1.initiate();
		d2.initiate();
		while (d1.getFaceValue() == d2.getFaceValue()) {
			d1.roll();
			d2.roll();
			System.out.println("[" + id + "] " + name + " rolled " + d1 + " and " + d2 + "!");
			this.addToScore(d1.getFaceValue() + d2.getFaceValue());
		}
		System.out.println();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
