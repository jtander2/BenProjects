
public class AbilityScore {
	
	int[] Stats;
	
	public AbilityScore(int str, int con, int dex, int intel, int wis, int cha) {
		Stats[ABILITY_TYPE.STR.getIndex()] = str;
		Stats[ABILITY_TYPE.CON.getIndex()] = con;
		Stats[ABILITY_TYPE.DEX.getIndex()] = dex;
		Stats[ABILITY_TYPE.INT.getIndex()] = intel;
		Stats[ABILITY_TYPE.WIS.getIndex()] = wis;
		Stats[ABILITY_TYPE.CHA.getIndex()] = cha;

			
	}
	
	public int getAbilityModifier(ABILITY_TYPE type){
		
		return Stats[type.getIndex()]/2 - 5;
		
	}
}
