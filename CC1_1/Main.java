public class Main {
	public boolean isUnique(String str) {
		if (str == null)
			return false;
		boolean[] check = new boolean[128]; // Checker array to compare ASCII code of the character
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (check[(int)c]) // Convert char to the ASCII code
				return false;
			check[(int)c] = true;
		}
		return true;
	}

	public static void main(String[] args) {
		String dupStr = "abcbbc";
		String uniStr = "abcde";

		Main main = new Main();
		if (!main.isUnique(dupStr))
			System.out.println("Duplicate");
		else
			System.out.println("Wrong result");
		if (main.isUnique(uniStr))
			System.out.println("Unique");
		else
			System.out.println("Wrong result");
	}
}