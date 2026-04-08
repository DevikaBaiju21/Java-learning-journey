package StudentPortal;

class Student {
	public String name;
	public int rollNo;
	public int[] marks;
	public int total;
	public double percentage;
	public char grade;
	Student(String name, int rollNo, int[] marks){
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
		calculateTotal();
		calculatePercentage();
		assignGrade();
	}
	void calculateTotal() {
		total = 0;
		for (int index = 0; index < (marks.length);index++) {
			total+=marks[index];
		}
	}
	void calculatePercentage() {
		percentage = (double) total/marks.length;
	}
	void assignGrade() {
		if (percentage>=90) {
			grade = 'A';
		}else if (percentage>=75) {
			 grade = 'B';
		}else if (percentage>=50) {
			grade = 'C';
		}else {
			grade = 'D';
		}
	}
	void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Roll no: " + rollNo);
		System.out.println("Total: " + total);
		System.out.println("Percentage: " + percentage);
		System.out.println("Grade: " + grade);
	}
}
