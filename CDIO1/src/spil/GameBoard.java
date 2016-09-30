/**
 * @author Gruppe 40
 * CDIO del 1
 * @version 1.1 
 * 
 * Peter Issam El-Habr s165202
 */

package spil;

import java.util.Scanner;

public class GameBoard {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String answer = "n";

		do {
			String name1 = "";
			String name2 = "";

			while (name1.length() < 1) {
				System.out.print("Player 1's name: ");
				name1 = input.nextLine();
			}

			while (name2.length() < 1) {
				System.out.print("Player 2's name: ");
				name2 = input.nextLine();
			}

			Player p1 = new Player(name1, 1);
			Player p2 = new Player(name2, 2);

			int p1Roll = 0;
			int p2Roll = 0;

			while (p1Roll == p2Roll) {
				p1Roll = p1.playOnce();
				p2Roll = p2.playOnce();
				System.out.println("\n" + p1.getName() + " rolled " + p1Roll + "!");
				System.out.println(p2.getName() + " rolled " + p2Roll + "!\n");
			}

			while (p1.win() == false && p2.win() == false && p1Roll > p2Roll) {
				System.out.println("--- [Player: " + p1.getId() + "] " + p1.getName() + ", please press enter ---");

				input.nextLine();
				p1.play();
				System.out.println(p1);
				if (p1.win() == true) break;
				System.out.println("--- [Player: " + p2.getId() + "] " + p2.getName() + ", please press enter ---");

				input.nextLine();
				p2.play();
				System.out.println(p2);
			}

			while (p1.win() == false && p2.win() == false && p1Roll < p2Roll) {
				System.out.println("--- [Player: " + p2.getId() + "] " + p2.getName() + ", please press enter ---");

				input.nextLine();
				p2.play();
				System.out.println(p2);
				if (p2.win() == true) break;
				System.out.println("--- [Player: " + p1.getId() + "] " + p1.getName() + ", please press enter ---");

				input.nextLine();
				p1.play();
				System.out.println(p1);
			}

			do {
				System.out.println("--- Do you want to play again? [y/n] ");
				answer = input.nextLine().toLowerCase();

				if (answer.equals("n")) break;

			} while (!(answer.equals("y")));

		} while ((answer.equals("y")));

		System.out.println("--- Thanks for playing!");

		input.close();
	}

}
