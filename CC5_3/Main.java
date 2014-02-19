public class Main {

	/*  
		The solution for findNextSmallest is find out the first '0' after any '1' from right
		and set it to '1' then set the digit right to it to be 0. Finally setting all the '1's
		from the right to left.
	*/

	public int findNextSmallest(int number) {
		int digitCounter = 0; // count for checked digit
		int onesCounter = 0; // count for ones in the checked digits
		int checker = 1; // the check is used to '|' the last digit of number
		boolean zeroAfterOneFlag = false;

		while (number != 0) { // whether shifting makes the number to be zero
			digitCounter++;
			if ((checker & number) == 1) { // last digit now is 1
				onesCounter++;
				zeroAfterOneFlag = true; // find next 0
			} else if (zeroAfterOneFlag == true) { // found next 0
				number |= 1; // set it to be '1'
				number <<= (digitCounter - 1); // left shift the number back with all '0' as tail
				for (int i = 0; i < onesCounter - 1; i++) {
					number |= (1 << i); // give all the '1' back to the number from right
				}
				return number;
			}
			number >>= 1; // right shift number by 1 bit
		}
		return -1; // there is no number could satisfy the requirement

	}

	/*  
		The solution for findLastLargest is find out the first '1' after any '0' from right
		and set it to '0' then set the digit right to it to be 1. Finally setting all the '1's
		from the right of that 1.
	*/

	public int findLastLargest(int number) {
		int digitCounter = 0; // count for checked digit
		int onesCounter = 0; // count for ones in the checked digits
		int checker = 1; // the check is used to '|' the last digit of number
		boolean oneAfterZeroFlag = false;

		while (number != 0) {
			digitCounter++;
			if ((checker & number) == 1) { // last digit now is 1
				if (oneAfterZeroFlag == true) { // if it is the first '1' on the left of '0'
					int mask = ~1; // 1111.....11110 for set the last bit of number to be 0
					number &= mask; // set the last '1' to be '0'
					for (int i = 0; i <= onesCounter; i++) {
						number = (number << 1) | 1; // set the '1's back right after the '0' above
						digitCounter--;
					}
					number <<= digitCounter - 1; // set '0' to the rest of the bit
					return number;
				}
				onesCounter++;
			} else {
				oneAfterZeroFlag = true;
			}
			number >>= 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		Main test = new Main();
		System.out.println("Next Smallest is: " + test.findNextSmallest(46)); // should be 51
		System.out.println("Last Largest is: " + test.findLastLargest(103)); // should be 94
		System.out.println("Last Largest is: " + test.findLastLargest(3)); // should be -1
	}
}