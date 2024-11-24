// Valores de cartas de jogo A)
public enum Rank{
	AS(11), REI(4), VALETE(3), DAMA(2), DEZ(0), NOVE(0), OITO(0), SETE(10), SEIS(0), CINCO(0), CUATRO(0), TRES(0), DOIS(0);
	
	private final int rankValue;

	private Rank(int rankValue){
    this.rankValue = rankValue;
	}
	
	public int getRankValue(){
		return rankValue;
	}  


	public String toString(){
		return "This card is: " + name() + " and it's value is: " + rankValue;
	}
}