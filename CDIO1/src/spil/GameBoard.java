/**
 * @author Gruppe 40
 * @version 1.0 
 * CDIO del 1
 * 
 * Peter Issam El-Habr s165202
 */

package spil;

public class GameBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] inputname={"",""};
		java.util.Scanner input = new java.util.Scanner(System.in);
		while(inputname[0]=="" && inputname[1]==""){
			System.out.println("Player 1's name: ");
			inputname[0] = input.next();
			System.out.println("Player 2's name: ");
			inputname[1] = input.next();
		}
		Player p1 = new Player(inputname[0]);
		p1.id=1;
		Player p2 = new Player(inputname[1]);
		p2.id=2;

		while(p1.win()==false && p2.win()==false){
			System.out.println("--- Player"+p1.id+" Please enter anything ---");
			input.next();
			// TODO
			p1.play();
			System.out.println(p1);
			if (p1.win()==true)break;
			System.out.println("--- Player"+p2.id+" Please enter anything ---");
			input.next();
			p2.play();
			System.out.println(p2);
		}
		input.close();
	}
}
