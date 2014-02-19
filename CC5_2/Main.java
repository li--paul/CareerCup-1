public class Main {
	public String convertStringToBinary(String str) {
		int integerPart = Integer.parseInt(str.substring(0, str.indexOf('.')));
		double decimalPart = Double.parseDouble(str.substring(str.indexOf('.'), str.length()));

		String intPart = "";
		while (integerPart > 0) {
			int remainder = integerPart % 2; // get the number in the ones place
			integerPart = integerPart >> 1; // right shift one bit of the number
			intPart = remainder + intPart; // put the new digit in front of all previous string
		}

		StringBuffer decPart = new StringBuffer();
		while (decimalPart > 0) {
			if (decPart.length() > 32)
				return "ERROR";
			if (decimalPart == 1) { // when the last digit in the decimal part is shifted to the left
				decPart.append((int)decimalPart); // cast the double to integer
				break;
			} 
			double remainder = decimalPart * 2;
			if (remainder >= 1) { // the number after left shift is bigger than 1 which means the numer in the ones
								  // place is 1 and the decimal part is not 0
				decPart.append("1");
				decimalPart = remainder - 1; // delete 1 from the ones place
			} else {
				decPart.append("0"); // still have digits in decimal part but the ones place digit is 0 after left shifting
				decimalPart = remainder; // get the number after shifting
			}
				
		}
		return intPart + "." + decPart.toString(); // use toString() method from StringBuffer to output the result
	}

	public static void main(String[] args) {
		Main test = new Main();
		System.out.println(test.convertStringToBinary("1.5")); // should be 1.1
		System.out.println(test.convertStringToBinary("325.18")); // should be ERROR since 32 bits cannot represent 0.18
	}
	
}