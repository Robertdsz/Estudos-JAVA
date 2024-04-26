package entities;

public class student {
	public String name;
	public double note_1;
	public double note_2;
	public double note_3;
	
	public double finalGrade() {
		return note_1 + note_2 + note_3;
	}
	public double missingPoints() {
		if (finalGrade() < 60) {
			return 60.0 - finalGrade();
		}
		else {
			return 0.0;
		}
	}
}
