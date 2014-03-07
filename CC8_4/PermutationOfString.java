import java.util.ArrayList;

public class PermutationOfString {
	String string, temp;
	ArrayList<String> result;

	public PermutationOfString(String string) {
		this.string = string;
	}

	public ArrayList<String> getAllPermutations() {
		result = new ArrayList<String>();
		findAllPermutations(string, string.substring(0, 1), string.length());
		return result;
	}

	private void findAllPermutations(String string, String temp, int totalLength) {
		if (temp.length() == totalLength)
			result.add(temp);
		else {
			for (int i = 0; i < temp.length() + 1; i++) {
				findAllPermutations(string, temp.substring(0, i) + string.substring(temp.length(), temp.length() + 1) + temp.substring(i, temp.length()), totalLength);
			}
		}		
	}

	public static void main(String[] args) {
		PermutationOfString test = new PermutationOfString("abcd");
		ArrayList<String> results = test.getAllPermutations();
		for (String result : results) {
			System.out.println(result);
		}
	}
}