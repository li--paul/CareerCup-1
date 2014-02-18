public class Main {
	public int combineMN (int m, int n, int i, int j) {
		int tail = (1 << i) - 1; // left shift i bits for 1, then let bits from i to end be all 1's
		tail &= n; // store the last i bits
		return (n >> (j + 1)) << (j + 1) | (m << i) | tail; // first right shift n j+1 bits and left shift j+1 bits to let bits from j
															// to end be all 0's then add m from i bits, finally add tail
	}

	public static void main(String[] args) {
		Main test = new Main();
		System.out.println(test.combineMN(21, 1024, 2, 6)); // should be 1108
	}
}