import java.util.Random;


public class Ability_Check {
	
	static Random gen = new Random();
	
	/**
	 * 
	 * @return true if passed
	 */
	public static boolean performAbilityCheck(ABILITY_TYPE type, AbilityScore score, int threshold){
		
		int roll = gen.nextInt(20);
		
		return roll + score.getAbilityModifier(type) >= threshold;
		
	}

}
