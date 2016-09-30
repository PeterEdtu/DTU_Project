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
		return "faceValue: " + getFaceValue();
	}

}