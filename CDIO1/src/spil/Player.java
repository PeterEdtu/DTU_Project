/*
 * Player Class
 * @author PeterElHabr
 * 40_CDIO1
 */
package spil;

public class Player {
	
	private int score;
	private String name;
	public static int Maxscore=40;
	
	/**
	 * Create a player who can roll
	 * @author PeterElHabr
	 * @param name : Define the player's name
	 */
	public Player(String name){
		this.score=0;
		this.name=name;
	}
	
	public String toString(){
		String showscore;
		if (this.Win()==false)
		showscore=this.name+"'s score is: "+this.score;
		else showscore=this.name + " wins with "+this.score;
		return showscore;
	}
	
	/**
	 * Add (amount>0) points to score
	 * Remove (amount<0)
	 * @param amount
	 */
	public void AddToScore(int amount){
		this.score=this.score+amount;
	}
	
	public boolean Win(){
		if (this.score>=Maxscore){
			return true;
		}else return false;
	}
}


