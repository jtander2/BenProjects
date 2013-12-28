import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class test2 {

	static ArrayList<Integer> balances;
	static Scanner scan = new Scanner(System.in);
	static int selectedAccount;

	public static void main(String[] args) {

		char option = '\0';

		// Initialize Balance
		balances = new ArrayList<Integer>();
		selectedAccount = 0;

		printWelcomeMessage();

		do {

			printOptionMenu();

			// Collect first character of the user's input.
			// It is assumed that the first character is what the user
			// meant to input. So an input of "Deposit" would collect 'd'
			option = scan.next().toLowerCase().charAt(0);

			switch (option) {
			case 'a':
				accountOptionsMenu();
				break;
			case 'v':
				// View Balance
				viewBalance();
				break;
			case 'd':
				// Deposit
				makeDeposit();
				break;
			case 'w':
				// Withdraw
				makeWithdrawal();
				break;
			case 'q':
				// Exit
				printExitMessage();
				break;
			default:
				printErrorMessage();

			}

		} while (option != 'q');
		scan.close();

	}

	static void printWelcomeMessage() {
		System.out.println("===============================\n"
				+ " Welcome to bank simulator 1.0\n"
				+ "===============================\n");
	}

	static void printOptionMenu() {
		System.out.println("Please pick your option:" + "\n"
				+ "a - account options" + "\n" + "v - view balance" + "\n"
				+ "d - make deposit" + "\n" + "w - make withdrawal" + "\n"
				+ "q - exit program" + "\n");
	}

	static void printExitMessage() {
		System.out.println("\nExiting bank simulator...\n");
	}

	static void printErrorMessage() {
		System.out.println("\nInvalid Selection.\n");
	}

	/**
	 * viewBalance() <br>
	 * <br>
	 * The code shall display the balance of the user
	 */
	static void viewBalance() {
		System.out.println("Current balance: " + balance);

	}

	/**
	 * makeDeposit() <br>
	 * <br>
	 * The code shall first prompt the user asking how much they would like to
	 * deposit.<br>
	 * Next, the amount should be added to the balance.
	 * 
	 * <br>
	 * <br>
	 * <i>It is always assumed that the user has the proper amount on hand to
	 * deposit.</i>
	 */
	static void makeDeposit() {
		System.out.println("How much would you like to deposit?");
		int deposit = scan.nextInt();
		if(deposit < 0){
			System.out.println("You can not deposit a negative amount...");
		}else{
			balance += deposit;
		}
		
	}
	
	/**
	 * makeWithdrawal()
	 * <br><br>
	 * The code shall first prompt the user asking how much they would like to withdraw.<br>
	 * Next, the amount should be subtracted from the user's balance.
	 * 
	 * <br>
	 * <br>
	 * <i>There should be error checking here, as a negative balance is not
	 * allowed.</i>
	 */
	static void makeWithdrawal() {

		System.out.println("How much would you like to withdrawal?");
		int withdraw = scan.nextInt();

		if (balance - withdraw < 0) {
			System.out.println("Insufficient funds...");

		} else {
			balance -= withdraw;
			System.out.println("You have withdrawn: " + withdraw);
		}

	}

	// -----------------
	// ACCOUNT SECTION
	// -----------------

	static void accountOptionsMenu() {
		char option = '\0';

		do {
			System.out.println("Account options: " + "\n"
					+ "s - select account" + "\n" + "v - view all account info"
					+ "\n" + "a - add new account" + "\n"
					+ "r - remove an account" + "\n"
					+ "x - remove ALL accounts" + "\n"
					+ "q - return to balance menu" + "\n");

			option = scan.next().toLowerCase().charAt(0);

			switch (option) {
			case 's':
				// select account
				selectAccount();
				break;
			case 'v':
				// view all account info
				viewAllBalances();
				break;
			case 'a':
				// add new account
				addAccount();
				break;
			case 'r':
				// remove an account
				removeAccount();
				break;
			case 'x':
				// remove ALL accounts
				removeAllAccounts();
			case 'q':
				// Exit
				break;
			default:
				printErrorMessage();
			}

		} while (option != 'q');

	}

	/**
	 * selectAccount() <br>
	 * <br>
	 * This code shall let the user switch which account they are modifying in
	 * the main/balance menu. <br>
	 * If an invalid index is selected, the user shall be notified that their
	 * selection was invalid and the code shall not switch to that index.
	 */
	static void selectAccount() {

	}

	/**
	 * viewAllBalances() <br>
	 * <br>
	 * This code shall display the account number and the balance of all
	 * existing accounts for this user. <br>
	 * If no accounts exist, let the user know.
	 */
	static void viewAllBalances() {

	}

	/**
	 * addAccount() <br>
	 * <br>
	 * This code shall create a new account for the user. <br>
	 * The new accounts index shall be the next successive index in the list. So
	 * if there are currently 4 accounts, the next account index shall be 5.
	 */
	static void addAccount() {

	}

	/**
	 * removeAccount() <br>
	 * <br>
	 * This code shall remove an account selected by the user. <br>
	 * The user shall be warned if the account's balance is not 0 that they will
	 * lose money and be asked to confirm the deletion.
	 */
	static void removeAccount() {

	}

	/**
	 * removeAllAccounts() <br>
	 * <br>
	 * This code shall remove all accounts under the user. <br>
	 * The user shall be warned if they have any accounts with a balance greater
	 * than 0 and be asked to confirm the delection.
	 */
	static void removeAllAccounts() {

	}
}
