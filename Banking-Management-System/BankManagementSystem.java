import java.util.Scanner;
class BankAccount{
	public long accountNumber;
	public String accountHolder;
	private long balance;
	BankAccount(long accountNo,String holder, long bal){
		accountNumber = accountNo;
		accountHolder = holder;
		balance = bal;
	}
	void depositAmt(long amt) {
		balance+=amt;
		System.out.println("The entered amount has been deposited.");
		System.out.println("Net balance: " + balance);
	}
	void withdrawAmt(long amt) {
		if (balance>=amt) {
			balance-=amt;
			System.out.println("The requested  has been withdrawn.");
			System.out.println("Net balance: " + balance);
		}else {
			System.out.println("Insufficient balance! ");
		}
	}
	long displayBal() {
		return balance;
	}
}
public class BankManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noOfAccounts = 0;
		BankAccount[] Bank = new BankAccount[50];
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("Bank Management System");
			System.out.println("Menu");
			System.out.println("1.Create Account");
			System.out.println("2.Deposit");
			System.out.println("3.Withdraw");
			System.out.println("4.Check balance");
			System.out.println("5.Exit");
			System.out.print("Enter the choice(1/2/3/4/5): ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter the account number: ");
				long accountNo = sc.nextLong();
				sc.nextLine();
				System.out.print("Enter the account holder's name: ");
				String holder = sc.nextLine();
				System.out.print("Enter the balance: ");
				long bal = sc.nextLong();
				boolean duplicateAccount = false;
				if (noOfAccounts!=50) {
					for (int i = 0;i<(Bank.length);i++) {
						if (Bank[i]!=null) {
							if (Bank[i].accountNumber==accountNo) {
								System.out.println("Duplicate account number creation");
								duplicateAccount = true;
								break;
							}
						}
					}
					for (int i = 0;i<(Bank.length);i++) {
						if (Bank[i]==null) {
							if (duplicateAccount==false) {
								BankAccount b1 = new BankAccount(accountNo,holder,bal);
								Bank[i]=b1;
								noOfAccounts+=1;
								break;
							}
						}
					}
				}else {
					System.out.println("Bank is full.Account creation not possible");
				}
				break;
			case 2:
				System.out.print("Enter the account number: ");
				boolean depositDone = false;
				long accountNoD = sc.nextLong();
				for (int i = 0;i<Bank.length;i++) {
					if (Bank[i]!=null) {
						if (Bank[i].accountNumber==accountNoD) {
							System.out.print("Enter the amount for depositing: ");
							long amt = sc.nextLong();
							Bank[i].depositAmt(amt);
							depositDone = true;
							break;
						}
					}
				}
				if(depositDone==false) {
					System.out.println("Account Number not found. Deposit not done.");
				}
				break;
			case 3:
				System.out.print("Enter the account number: ");
				long accountNoW = sc.nextLong();
				boolean withdrawOK = false;
				for (int i = 0;i<Bank.length;i++) {
					if (Bank[i]!=null) {
						if (Bank[i].accountNumber==accountNoW) {
							System.out.print("Enter the amount for withdrawal: ");
							long amt = sc.nextLong();
							Bank[i].withdrawAmt(amt);
							withdrawOK = true;
							break;
						}
					}
				}
				if (withdrawOK==false) {
					System.out.println("Account Number not found.Withdrawal not possible.");
				}
				break;
			case 4:
				System.out.print("Enter the account number: ");
				long accountNoDi = sc.nextLong();
				boolean balanceDisplayed = false;
				for (int i = 0;i<Bank.length;i++) {
					if (Bank[i]!=null) {
						if (Bank[i].accountNumber==accountNoDi) {
							System.out.println("Balance: " + Bank[i].displayBal());
							balanceDisplayed = true;
							break;
						}
					}
				}
				if (balanceDisplayed==false) {
					System.out.println("Enter the right account number");
				}
				break;
			case 5:
				flag = false;
				break;
			}
		}
	}

}
