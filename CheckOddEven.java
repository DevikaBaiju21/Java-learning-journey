//Check whether a given number is even or odd
import java.util.Scanner;
public class CheckOddEven {
	public static void main(String[] args) {
		System.out.print("Enter the number for even-odd checking: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if (number%2==0){
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
		System.out.println("bye!");
	}
}
