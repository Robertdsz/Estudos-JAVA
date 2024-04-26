package application;

import java.util.Locale;
import java.util.Scanner;

import entities.student;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		student student;
		student = new student();
		
		System.out.print("Digite o nome do aluno: ");
		student.name = sc.nextLine();
		System.out.print("Digite a nota do primeiro semestre (0-30): ");
		student.note_1 = sc.nextDouble();
		System.out.print("Digite a nota do segundo semestre (0-35): ");
		student.note_2 = sc.nextDouble();
		System.out.print("Digite a nota do terceiro semestre (0-35): ");
		student.note_3 = sc.nextDouble();
		
		student.finalGrade();
		student.missingPoints();
		
		System.out.println();
		if (student.finalGrade() > 60.0) {
			System.out.printf("FINAL GRADE = %.2f%n"
							+ "PASS", student.finalGrade());
		}
		else {
			System.out.printf("FINAL GRADE = %.2f%n"
							+ "FAILED%n"
							+ "MISSING %.2f POINTS",student.finalGrade(), student.missingPoints());
		}
		sc.close();
	}

}
