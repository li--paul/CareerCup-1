public class Main {
	public int recursiveFibo(int number) {
		if (number == 0)
			return 0;
		if (number == 1)
			return 1;
		else
			return recursiveFibo(number - 2) + recursiveFibo(number - 1);
	}

	public int iterativeFibo(int number) {
		if (number < 0)
			return -1;
		if (number == 0)
			return 0;
		int first, second, result;
		first = second = 1;
		result = 0;
		for (int i = 2; i < number; i++) {
			result = first + second;
			first = second;
			second = result;
		}
		return second; // if number is 1 or 2, it will be return directly
	}

	public static void main(String[] args) {
		Main test = new Main();
		System.out.println(test.recursiveFibo(10));
		System.out.println(test.iterativeFibo(10));
	}
}