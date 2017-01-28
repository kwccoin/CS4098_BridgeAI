
public class Contract {
	int number;
	Suit suit;		//null indicates no trumps
	int declarerPosition;
	
	public Contract(int number, Suit suit, int declarerPosition) {
		this.number = number;
		this.suit = suit;
		this.declarerPosition = declarerPosition;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Suit getSuit() {
		return suit;
	}
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	public int getDeclarerPosition() {
		return declarerPosition;
	}
	public void setDeclarerPosition(int declarerPosition) {
		this.declarerPosition = declarerPosition;
	}
}
