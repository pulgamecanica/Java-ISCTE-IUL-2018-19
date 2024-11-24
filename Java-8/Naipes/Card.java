import java.util.*;
public final class Card {
	private final Suit suit;
	private final Rank rank;

	private static final Card[] cards;
	static {
		cards = new Card[Suit.values().length * Rank.values().length];
	

	 // preenchimento do vetor
	}
	public Card(Suit suit, Rank rank){
		this.suit = suit;
		this.rank = rank;

	}

	public String toString(){
		return "This card is: " + suit.name() + " " + rank.name();
	}


	public static Card getCard(Suit suit, Rank rank) { 
		int index = ((suit.ordinal() + 1) * 13) - (rank.ordinal() - 1);
		Card c = cards[index];
		if (c == null){
			c = new Card(suit, rank);
			cards[index] = c;
		}
		return c;
	}


	

	public static void main(String[] args){
		Suit s = Suit.SPADES;
		Rank r = Rank.SETE;
		System.out.println(getCard(s, r));

	}

}