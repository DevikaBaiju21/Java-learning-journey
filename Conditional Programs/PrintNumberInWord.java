import java.util.Scanner;
public class PrintNumberInWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number (1-9): ");
		int number = sc.nextInt();
		// Alternative approach using if-else (not used)
		/*if (number==1) {
			System.out.println("ONE");
		}else if (number==2) {
			System.out.println("TWO");
		}else if (number==3) {
			System.out.println("THREE");
		}else if (number==4) {
			System.out.println("FOUR");
		}else if (number==5) {
			System.out.println("FIVE");
		}else if (number==6) {
			System.out.println("SIX");
		}else if (number==7) {
			System.out.println("SEVEN");
		}else if (number==8) {
			System.out.println("EIGHT");
		}else if (number==9) {
			System.out.println("NINE");
		}else {
			System.out.println("OTHER");
		}*/
		String word = "";
		switch(number) {
		case 1:
			word = "ONE";
			break;
		case 2:
			word = "TWO";
			break;
		case 3:
			word = "THREE";
			break;
		case 4:
			word = "FOUR";
			break;
		case 5:
			word = "FIVE";
			break;
		case 6:
			word = "SIX";
			break;
		case 7:
			word = "SEVEN";
			break;
		case 8:
			word = "EIGHT";
			break;
		case 9:
			word = "NINE";
			break;
		default:
			word = "OTHER";
		}
		System.out.println(word);
		sc.close();
	}
}
