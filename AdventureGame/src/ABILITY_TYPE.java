
public enum ABILITY_TYPE {
	
	STR(0), CON(1), DEX(2), INT(3), WIS(4), CHA(5);
	
	private final int index;
	private ABILITY_TYPE(int index){
		this.index = index;
	}
	
	public int getIndex(){
		return index;
	}
}
