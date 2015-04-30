package snackmachine;

public class Toast extends Food {

	@Override
	public int make(int count) {

		if (count <= 0)
			return 0;

		return count;
	}

}
