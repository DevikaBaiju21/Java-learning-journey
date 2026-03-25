//Calculate the sum of even and odd numbers separately as well as the count
import java.util.Scanner;
public class EvenOddAnalysis {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements(N): ");
		int N = sc.nextInt();
		int evenCount = 0;
		int oddCount = 0;
		int evenSum = 0;
		int oddSum = 0;
		for (int i=0;i<N;i++) {
			System.out.print("Enter the "+(i+1)+" element: ");
			int element = sc.nextInt();
			if (element%2==0) {
				evenCount++;
				evenSum+=element;
			}else {
				oddCount++;
				oddSum+=element;
			}
		}
		System.out.println("The count of even numbers is " + evenCount);
		System.out.println("The count of odd numbers is " + oddCount);
		System.out.println("The sum of even numbers is " + evenSum);
		System.out.println("The sum of odd numbers is " + oddSum);
	}
}
