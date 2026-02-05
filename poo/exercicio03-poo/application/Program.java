package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student stud = new Student();
		
		System.out.print("Name: ");
		stud.name = sc.nextLine();
		System.out.print("grade 1: ");
		stud.grade1 = sc.nextDouble();
		System.out.print("grade 2: ");
		stud.grade2 = sc.nextDouble();
		System.out.print("grade 3: ");
		stud.grade3 = sc.nextDouble();
		
		if (stud.finalGrade()>=60) {
			System.out.printf("FINAL GRADE = %.2f%n", stud.finalGrade());
			System.out.print("PASS");
		} else {
			System.out.printf("FINAL GRADE = %.2f%n", stud.finalGrade());
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f", stud.missingPoints()+" POINTS");
		}
		
		sc.close();

	}

}
