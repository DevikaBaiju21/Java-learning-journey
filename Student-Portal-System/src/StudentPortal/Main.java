package StudentPortal;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StudentManager sm  = new StudentManager();
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		System.out.print("Enter roll number: ");
		int rollNo = sc.nextInt();
		System.out.print("Enter marks for subject 1: ");
		int M1 = sc.nextInt();
		System.out.print("Enter marks for subject 2: ");
		int M2 = sc.nextInt();
		int[] M = {M1,M2};
		Student s = new Student(name,rollNo,M);
		sm.addStudent(s);
		s.displayDetails();
	}

}
