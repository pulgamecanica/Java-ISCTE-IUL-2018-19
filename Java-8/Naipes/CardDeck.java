import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class CardDeck {

	private List<Card> deck = new ArrayList<Card>();
	private int it = 0;
	
	public CardDeck() {

	}
	
	public int nCards() { 
		return deck.size(); 
	}
	
	public void add(Card c) { 
		deck.add(c); 
	}
	
	public boolean hasNext() {
		return it < deck.size(); 
	}
	
	public Card next() { 
		Card c = deck.get(it); 
		it++; 
		return c; 
	}

	public void remove(Card c) { 
		deck.remove(c); 
	} 
	
	public static CardDeck fullDeck(Predicate<Card> p) {
		CardDeck d = new CardDeck();
		for (Suit s: Suit.values())
			for (Rank r: Rank.values()) {
				Card c = new Card(s, r);
				if (p == null || p.test(c))
					d.add(c);
			}
		return d;
	}
	
	public void shuffle() { 
		Collections.shuffle(deck);
	}
	
	public void order(Comparator<Card> comparator) {
		deck.sort(comparator);
	}

	@Override
	public String toString() {
		return "CardDeck [deck=" + deck + "]";
	}

}
