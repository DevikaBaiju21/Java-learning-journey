import java.util.Scanner;
public class CheckPassFail {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Write a program called CheckPassFail which prints "PASS" if the int variable "marks" is more than or equal to 50; or prints "FAIL" otherwise. The program shall always print “DONE” before exiting.
		System.out.print("Enter the marks of the student: ");
		int marks = sc.nextInt();
		if (marks<0||marks>100) {
			System.out.println("Invalid input! The marks should be between 0 and 100");
		}else if(marks>=50) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		System.out.println("DONE");
		sc.close();
	}

}
