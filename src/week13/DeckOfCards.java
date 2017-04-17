package week13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Card {
	public static enum Face {Ace, Deuce, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King};
	public static enum Suit {Clubs, Diamonds, Hearts, Spades};
	
	private final Face face;
	private final Suit suit;
	
	public Card(Face face, Suit suit) {
		this.face = face;
		this.suit = suit;
	}

	public Face getFace() {
		return face;
	}

	public Suit getSuit() {
		return suit;
	}
	
	public String toString() {
		return String.format("%s of %s", face, suit);
	}
}


public class DeckOfCards {

	private List<Card> list;
	
	public DeckOfCards() {
		Card[] deck = new Card[52]; // Creates an array of size 52
		int count = 0;
		
		// Generates entire deck //
		// Iterates through all suits
		for(Card.Suit suit : Card.Suit.values()) {
			
			// Iterates through all faces
			for(Card.Face face : Card.Face.values()) {
				deck[count] = new Card(face, suit);
				count++;
			}
		}
		
		list = Arrays.asList(deck);
		Collections.shuffle(list);
	}
	
	public void printCards() {
		for(int i = 0; i < list.size(); i++) {
			System.out.printf("%-19s%s", list.get(i), 
					((i + 1) % 4 == 0) ? "\n" : "");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeckOfCards cards = new DeckOfCards();
		cards.printCards();
	}

}

















