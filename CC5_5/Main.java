public class Main {

	public int bitsNumberForConvert(int a, int b) {
		int count = 0;
		int result = a ^ b; // findout how many bits are different
		while (result != 0) {
			if ((result & 1) == 1)
				count++; // add 1 if there is a different ('1') between a and b
			result >>= 1;
		}
		return count;
	}


	public static void main(String[] args) {
		Main test = new Main();
		System.out.println(test.bitsNumberForConvert(31, 14)); // should be 2
	}
}