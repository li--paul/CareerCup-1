public class Main {

	/* 
		The idea here is using 101010....10 to '&'' the number to get the even bits
		and using 010101..01 to '&'' the number to get the odd bits, left shift the 
		odd digis and right shif the even numbers by 1 and finally '|' the two number

	*/

	public int swapEvenOdd(int number) {
		number = (((0xaaaaaaaa & number) >> 1) | ((0x55555555 & number) << 1)); // 0xaaaaaaaa is 1010 1010 1010 ... 1010 and 0x55555555 is 0101 0101 ... 0101
		return number;
	}

	public static void main(String[] args) {
		Main test = new Main();
		System.out.println(test.swapEvenOdd(5)); // 5 is 101 hence ouput shouldbe 1010 which is 10
	}
}