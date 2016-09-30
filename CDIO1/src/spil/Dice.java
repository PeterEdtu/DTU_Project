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

public class Dice {

	private final int MAX_FACE_VALUE = 6;
	private int faceValue = 1;

	public int roll() {
		faceValue = (int) (Math.random() * MAX_FACE_VALUE) + 1;
		return getFaceValue();
	}

	public int getFaceValue() {
		if (faceValue >= 1 && faceValue <= MAX_FACE_VALUE) {
			return faceValue;
		} else {
			return -1;
		}
	}

	public String toString() {
		return ""+getFaceValue();
	}
	public void initiate(){
		faceValue=0;
	}

}
