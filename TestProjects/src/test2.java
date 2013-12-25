import java.util.Scanner;


public class test2 {
	
	static int balance;
	
	public static void main(String[] args){
		
		char option = '\0';
		Scanner scan = new Scanner(System.in);
		
		//Initialize Balance
		balance = 0;
		
		printWelcomeMessage();
		
		do{
			
			printOptionMenu();
			
			//Collect first character of the user's input.
			// It is assumed that the first character is what the user
			// meant to input.  So an input of "Deposit" would collect 'd'
			option = scan.next().toLowerCase().charAt(0);
			
			switch(option){
			
			case 'v':
				//View Balance
				viewBalance();
				break;
			case 'd':
				//Deposit
				makeDeposit();
				break;
			case 'w':
				//Withdraw
				makeWithdrawal();
				break;
			case 'q':
				//Exit
				printExitMessage();
				break;
			
			}
			
		}while(option != 'q');
		scan.close();
		
	}
	
	static void printWelcomeMessage(){
		System.out.println("===============================\n"
						 + " Welcome to bank simulator 1.0\n"
						 + "===============================\n");
	}
	
	static void printOptionMenu(){
		System.out.println("Please pick your option:" + "\n"
				+ "v - view balance" + "\n"
				+ "d - make deposit" + "\n"
				+ "w - make withdrawal" + "\n"
				+ "q - exit program" + "\n");
	}

	static void printExitMessage(){
		System.out.println("\nExiting bank simulator...\n");
	}
	
	/**
	 * viewBalance()
	 * <br><br>
	 * The code shall display the balance of the user
	 */
	static void viewBalance(){
		
	}
	
	/**
	 * makeDeposit()
	 * <br><br>
	 * The code shall first prompt the user asking how much they would like to deposit.<br>
	 * Next, the amount should be added to the balance.
	 * 
	 *<br><br>
	 * <i>It is always assumed that the user has the proper amount on hand to deposit.</i>
	 */
	static void makeDeposit(){
		
	}
	
	/**
	 * makeWithdrawal()
	 * <br><br>
	 * The code shall first prompt the user asking how much they would like to withdraw.<br>
	 * Next, the amount should be subtracted from the user's balance.
	 * 
	 * <br><br>
	 * <i>There should be error checking here, as a negative balance is not allowed.</i>
	 */
	static void makeWithdrawal(){
		
	}
}
