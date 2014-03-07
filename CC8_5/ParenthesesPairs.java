import java.util.ArrayList;

public class ParenthesesPairs {
	int pairNumber;
	ArrayList<String> result;

	public ParenthesesPairs(int pairNumber) {
		this.pairNumber = pairNumber;
	}

	public ArrayList<String> findAllPairs() {
		result = new ArrayList<String>();
		find("(", 1, 0, pairNumber);
		return result;

	}

	private void find(String temp, int leftNumber, int rightNumber, int pairNumber) {
		if (rightNumber == pairNumber) {
			result.add(temp);
		} else {
			if (leftNumber < pairNumber) {
				find(temp + "(", leftNumber + 1, rightNumber, pairNumber);
				if (leftNumber > rightNumber)
					find(temp + ")", leftNumber, rightNumber + 1, pairNumber);
			} else {
				find(temp + ")", leftNumber, rightNumber + 1, pairNumber);
			}
		}
	}

	public static void main(String[] args) {
		ParenthesesPairs test = new ParenthesesPairs(4);
		ArrayList<String>results = test.findAllPairs();
		for (String result : results)
			System.out.println(result);
	}



}