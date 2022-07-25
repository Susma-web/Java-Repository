import java.util.Scanner;
public class ATMProgram {
public static void main(String args[]) {
int balance = 200000, withdraw, deposit;
Scanner ATMInput = new Scanner(System.in);
while (true) {
System.out.println("ATM! Welcomes you!");
System.out.println("Select the number for the operation");
System.out.println("1 - Withdraw");
System.out.println("2 - Deposit");
System.out.println("3 - Balance Inquiry");
System.out.println("4 - Exit");
int operation = ATMInput.nextInt();
switch (operation) {
case 1:
System.out.println("Enter the money : ");
withdraw = ATMInput.nextInt();
if (balance >= withdraw) {
balance = balance-withdraw;
System.out.println("Please collect the money");
}
else {
System.out.println("Insufficient balance");
}
System.out.println("");
break;
case 2:
System.out.println("Enter the money : ");
deposit = ATMInput.nextInt();
balance = balance + deposit;
System.out.println("Money has been deposited succesfully");
System.out.println("");
break;
case 3:
System.out.println("Balance : " + balance);
System.out.println("");
break;
case 4:
System.exit(0);
}
}
}
}
