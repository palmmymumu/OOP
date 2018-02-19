import java.util.ArrayList;

public class DiceBox {
	
	private ArrayList<Dice> diceList;

	public DiceBox() {
		diceList = new ArrayList<Dice>();
	}

	public void add(Dice dice) {
		this.diceList.add(dice);
	}

	public void shake() {
		for (int i = 0; i < this.diceList.size(); i++)
			this.diceList.get(i).roll();
	}

	public int getTotal() {
		int sum = 0;
		for (int i = 0; i < this.diceList.size(); i++)
			sum += this.diceList.get(i).getFace();
		return sum;
	}

	public void printDices() {
		for (int i = 0; i < this.diceList.size(); i++)
			System.out.println((i + 1) + ". " + this.diceList.get(i).toString());
	}

}