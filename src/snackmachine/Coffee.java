package snackmachine;

public class Coffee extends Drink {

	@Override
	public int make(int count) {

		if (count <= 0)
			return 0;

		return count;
	}

}
