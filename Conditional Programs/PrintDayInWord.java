import java.util.Scanner;
public class PrintDayInWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		System.out.print("Enter the day number(0-6): ");
		if (sc.hasNextInt()) {
			int dayNumber = sc.nextInt();
			if (dayNumber>=0 && dayNumber<7) {
				System.out.println(days[dayNumber]);
			}else {
				System.out.println("Invalid day number! Please enter a value between 0 and 6.");
			}
		}else {
			System.out.println("Invalid input! Please enter an integer value.");
		}
		// Alternative approaches: if-else and switch-case can also be used
		/*if (dayNumber==0) {
			System.out.println("Sunday");
		}else if (dayNumber==1) {
			System.out.println("Monday");
		}else if (dayNumber==2) {
			System.out.println("Tuesday");
		}else if (dayNumber==3) {
			System.out.println("Wednesday");
		}else if (dayNumber==4) {
			System.out.println("Thursday");
		}else if (dayNumber==5) {
			System.out.println("Friday");
		}else if (dayNumber==6) {
			System.out.println("Saturday");
		}else {
			System.out.println("Not a valid day");
		}
		
		switch(dayNumber) {
		case 0:
			System.out.println("Sunday");break;
		case 1:
			System.out.println("Monday");break;
		case 2:
			System.out.println("Tuesday");break;
		case 3:
			System.out.println("Wednesday");break;
		case 4:
			System.out.println("Thursday");break;
		case 5:
			System.out.println("Friday");break;
		case 6:
			System.out.println("Saturday");break;
		default:
			System.out.println("Not a valid day");
		}*/
		sc.close();
	}
}
