import java.util.Scanner;
class Student{
	public int rollNo;
	public String name;
	public double mark1,mark2,mark3,mark4,mark5;
	public double total;
	public double percentage;
	Student(int r, String n, double m1, double m2, double m3, double m4, double m5){
		rollNo = r;
		name = n;
		mark1 = m1;
		mark2 = m2;
		mark3 = m3;
		mark4 = m4;
		mark5 = m5;
	}
	double totalMarks() {
		total = mark1 + mark2 + mark3 + mark4 + mark5;
		return total;
	}
	double calculatePercentage() {
		total = mark1 + mark2 + mark3 + mark4 + mark5;
		percentage = ((double)total/500) *100;
		return percentage;
	}
	void displayDetails(){
		System.out.println("Roll No: " + rollNo);
		System.out.println("Name: " + name);
		System.out.println("Marks: " + mark1 + "," + mark2 + ","+ mark3 + ","+ mark4 + ","+ mark5);
		System.out.println("Total: " + total);
		System.out.println("Percentage: " + percentage);
	}
}
public class StudentManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int countOfStud = 0;
		Student[] Stud = new Student[50];
		boolean flag = true;
		while(flag) {
			System.out.println("Student Management System");
			System.out.println("1. Add Student");
			System.out.println("2. Display Student");
			System.out.println("3. Search Student");
			System.out.println("4. Find Topper");
			System.out.println("5. Exit");
			System.out.print("Enter the choice (1/2/3/4/5): ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				if (countOfStud<50) {
					boolean createStudent = true;
					System.out.print("Enter roll no: ");
					int r = sc.nextInt();
					sc.nextLine();
					System.out.print("Enter name: ");
					String n = sc.nextLine();
					System.out.print("Enter for the first subject: ");
					double m1 = sc.nextDouble();
					System.out.print("Enter for the second subject: ");
					double m2 = sc.nextDouble();
					System.out.print("Enter for the third subject: ");
					double m3 = sc.nextDouble();
					System.out.print("Enter for the fourth subject: ");
					double m4 = sc.nextDouble();
					System.out.print("Enter for the fifth subject: ");
					double m5 = sc.nextDouble();
					for (int i = 0;i<(Stud.length);i++) {
						if (Stud[i]!=null) {
							if (Stud[i].rollNo==r) {
								createStudent = false;
								System.out.println("Duplicate entry for roll no! Student not added!");
								break;
							}
						}
					}
					if (createStudent) {
						for (int i = 0;i<(Stud.length);i++) {
							if (Stud[i]==null) {
								Student s = new Student(r,n,m1,m2,m3,m4,m5);
								Stud[i] = s;
								System.out.println("Student added! ");
								countOfStud++;
								break;
							}
						}
					}
					break;
				}else {
					System.out.println("Slots fully filled! Registration not possible! ");
				}
				break;
			case 2:
				boolean studentsPresent = false;
				for (int i = 0; i<(Stud.length);i++) {
					if (Stud[i]!=null) {
						studentsPresent = true;
						break;
					}
				}
				if (studentsPresent) {
					System.out.println("Displaying details of all students");
					for (int i = 0;i<(Stud.length);i++) {
						if (Stud[i]!=null) {
							Stud[i].totalMarks();
							Stud[i].calculatePercentage();
							Stud[i].displayDetails();
						}
					}
				}else {
					System.out.println("No students yet!");
				}
				break;
			case 3:
				System.out.print("Enter the roll no: ");
				int r1 = sc.nextInt();
				boolean displayedDetails = false;
				for (int i = 0;i<(Stud.length);i++) {
					if (Stud[i]!=null) {
						if (Stud[i].rollNo==r1) {
							Stud[i].calculatePercentage();
							Stud[i].totalMarks();
							Stud[i].displayDetails();
							displayedDetails = true;
							break;
						}
					}
				}
				if (!displayedDetails) {
					System.out.println("Roll Number not found! ");
				}
				break;
			case 4:
				boolean students = false;
				for (int i = 0; i<(Stud.length);i++) {
					if (Stud[i]!=null) {
						students = true;
						break;
					}
				}
				if (students) {
					double highestPercentage = 0;
					for (int i = 0;i<(Stud.length);i++) {
						if (Stud[i]!=null) {
							if (highestPercentage<Stud[i].calculatePercentage()) {
								highestPercentage = Stud[i].calculatePercentage();
							}
						}
					}
					for (int i = 0;i<(Stud.length);i++) {
						if (Stud[i]!=null) {
							if (Stud[i].calculatePercentage()==highestPercentage) {
								Stud[i].totalMarks();
								Stud[i].calculatePercentage();
								Stud[i].displayDetails();
							}
						}
					}
				}else {
					System.out.println("No students yet!");
				}
				break;
			case 5:
				flag = false;
			}
		}
	}

}
