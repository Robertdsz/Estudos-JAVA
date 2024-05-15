package candidacy;

import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SelectiveProcess {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		System.out.println("Selective Process");
		System.out.println();
		String [] candidates = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};

		for(String candidate: candidates) {
			gettingInTouch(candidate);
		}
	}
	static void gettingInTouch(String candidate) {
		int attemptsMade = 1;
		boolean keepTrying = true;
		boolean answered = false;
		do {
			answered = toMeet();
			keepTrying = !answered;
			if(keepTrying) {
				attemptsMade++;
			}
			else {
				System.out.println("Contact made successfully!");
			}
		}
		while(keepTrying && attemptsMade <3);
		
		if(answered) {
			System.out.printf("We managed to contact %s on the %d attempt!%n", candidate, attemptsMade);
		}
		else
			System.out.printf("We were unable to contact %s, a maximum number of %d attempts made!%n", candidate, attemptsMade);
	}
	static boolean toMeet() {
		return new Random().nextInt(3)==1;
	}
	static void printSelected() {
		String [] candidates = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
		for(String candidate: candidates) {
			System.out.printf("%s has been selected as a candidate!%n", candidate);
		}
	}
	static void candidateSelection () {
		String [] candidates = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
		
		int selectedCandidates = 0;
		int currentCandidate = 0;
		double baseSalary = 2000.0;
		
		while(selectedCandidates < 5 && currentCandidate < candidates.length) {
			String candidate = candidates[currentCandidate];
			double intendedSalary = intendedValue();
			
			System.out.printf("The Candidate %s requested thie salary amount $%.2f%n", candidate, intendedSalary);
			if(baseSalary >= intendedSalary) {
				System.out.printf("The candidate %s has been selected for the position!%n", candidate);
				selectedCandidates++;
			}
			currentCandidate++;
		}
	}
	static double intendedValue() {
	     return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	static void analizyCandidate (double intendedSalary) {
		double baseSalary = 2000.0;
		if (baseSalary > intendedSalary) {
			System.out.println("CALL TO CANDIDATE!");
		}
		else if (intendedSalary == baseSalary) {
			System.out.println("CALL THE CANDIDATE WITH A COUNTER PROPOSAL!");			
		}
		else {
			System.out.println("WAITING TO RESULT THE OTHER CANDIDATES!");			
		}
	}
}
