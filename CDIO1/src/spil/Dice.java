package spil;

/**
 * @author Gruppe 40
 * CDIO del 1
 * @version 1.1
 *
 * @author Daniel Larsen (s151641)
 * @author Daniel Anusic (s155005)
 */

public class Dice {

	/**
	 * Indkapslede klasse variabler, "fields."
	 * 
	 * @param MAX_FACE_VALUE Maximumsværdi for faceValue
	 * @param faceValue      Den side terningen ligger på efter et kast. [1;6]
	 */
	private final int MAX_FACE_VALUE = 6;
	private int faceValue = 1;

	/**
	 * Giver faceValue en tilfældig værdi i intervallet [1;6]
	 * Bruger getFaceValue() metoden til at returnere faceValue
	 * for at sikre værdien af variable.
	 * 
	 * @return getFaceValue()
	 */
	public int roll() {
		faceValue = (int) (Math.random() * MAX_FACE_VALUE) + 1;
		return getFaceValue();
	}

	/**
	 * Getter metode for variable faceValue.
	 * Returnere faceValue kun og kun hvis faceValue er 
	 * inden for intervallet [1;6]
	 * Ellers, returneres der -1 for at indikere en fejl.
	 * 
	 * @return faceValue
	 * eller
	 * @return -1
	 */
	public int getFaceValue() {
		if (faceValue >= 1 && faceValue <= MAX_FACE_VALUE) {
			return faceValue;
		} else {
			return -1;
		}
	}

	/**
	 * Returnere en String, hvis der bliver kaldt
	 * System.out.println() på objektet.
	 * 
	 * @return String
	 */
	public String toString() {
		return "faceValue: " + getFaceValue();
	}
	
	public void initiate() {
		faceValue = 0;
	}

}
