import java.util.Scanner;


public class roll {
	
	/**
	 * parseDiceRoll()
	 * <br><br>
	 * Accepts roll in the form of the following:<br>
	 *  	"#d#" ex: "1d6", "2d4"<br>
	 *  	"#d# +#" ex: "1d6 +4"<br>
	 *  <br>
	 *  Translates this into a dice roll with the given parameters:<br>
	 *  	diceNum - number of dice to roll<br>
	 *  	diceSize - size of the dice to roll<br>
	 *  	modifier - additional value to add to the result<br>
	 * 
	 * @param roll
	 * @return result of the roll that was parsed
	 */
	static int parseDiceRoll(String roll){
		int diceNum, diceSize, modifier;
		int result = 0;
		
		Scanner scan = new Scanner(roll);
		
		scan.useDelimiter("d");
		diceNum = scan.nextInt();
		
		scan.useDelimiter(" ");
		String dValue = scan.next();
		diceSize = Integer.parseInt(dValue.substring(1, dValue.length()));

		if(scan.hasNext()){
			modifier = scan.nextInt();
		} else {
			modifier = 0;
		}
		
		//DEBUG
		/**/
		System.out.println("For " + roll + ", parsed values are: " + "\n"
				+ "diceNum: " + diceNum + "\n"
				+ "diceSize: " + diceSize + "\n"
				+ "modifier: " + modifier + "\n");
		/**/
		
		scan.close();
		
		//Perform roll
		
		result = performRoll(diceNum, diceSize, modifier);
		return result;
		
	}
	
	/**
	 * performRoll()
	 * <br><br>
	 * 
	 * This function shall create a randomized result based on the input parameters.
	 * <br>
	 * First, add the modifier to the result.
	 * <br>
	 * Next, in a for loop, add a randomly generated number capped at diceSize
	 * to the result.  Continue this until your incrementer is equal to diceNum.
	 * <br>
	 * Return the result.
	 * 
	 * @param diceNum
	 * @param diceSize
	 * @param modifier
	 * @return
	 */
	static int performRoll(int diceNum, int diceSize, int modifier) {
		int result = 0;
		
		return result;
	}

	public static void main(String[] args){
		
		//Tester function
		
		parseDiceRoll("2d8");

		parseDiceRoll("1d4 +2");
		
		parseDiceRoll("3d10 +84");
	}

}
