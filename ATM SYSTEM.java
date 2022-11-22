
import java.util.Scanner;
public class aa
{
	public static Scanner gela;

	public static void main(String[] args) 
	{
	gela = new Scanner (System.in);
	int bal=100000, amt;
	char ans;

	do
	{
	System.out.println("");
	System.out.println("\tWELCOME TO ABC BANK\n");
	System.out.println("\tB - Check for Balance");
	System.out.println("\tD - Make Deposit");
	System.out.println("\tW - Make Withdrawal");
	System.out.println("\tQ - Quit\n");
	System.out.print("\tSelect an Option: ");
	ans = gela.next().charAt(0);
	ans = Character.toUpperCase(ans);
	
	switch (ans)
	{
		case 'B':
        System.out.println("\nYour current balance is "+bal);
		break;

		case 'D':
		System.out.print("\nEnter amount to Deposit: ");
		amt = gela.nextInt();
		if (amt<0) {
		System.out.println("\nDeposit Amount must be greater than zero");
		}
		else if (amt>500000) {
		System.out.println("\nDeposit Amount must not be greater than 500,000");
		} 
		else {
		bal = bal + amt;
		System.out.println("\nDeposit Transaction is successfully completed.");
		}
		break;

		case 'W':
		System.out.print("\nEnter amount to Withdraw: ");
		amt = gela.nextInt();
		if (amt<0) 
		{
		System.out.println("\nWithdrawal Amount must be greater than zero");	
		} 
		else if (amt>bal) 
		{
		System.out.println("\nWithdrawal Amount must not be greater than "+bal);
		} 
		else if (amt%100!=0) 
		{
		System.out.println("\nWithdrawal Amount must be divisible by 100");
		} 
		else 
		{
		bal = bal - amt;
		System.out.println("\nWithdrawal Transaction is successfully completed.");
		}
		break;


		case 'Q':
		System.out.println("\nThank you for using the program.");
		System.exit(0);
		break;

		default:
		System.out.println("\nInvalid entry, enter any valid option: B/D/W/Q");
		break;	
		}

	do
	{
	System.out.print("\nWant to Transact another (Y/N)? "); 
	ans = gela.next().charAt(0);
	ans = Character.toUpperCase(ans);
	if (ans != 'Y' && ans !='N' ) 
{
System.out.println("Invalid Entry. Enter Y or N only.");
}
}

while ( ans != 'Y' && ans !='N'); 
}

while (ans == 'Y'); 
System.out.println("\nThank you for using the program.");
}
}
