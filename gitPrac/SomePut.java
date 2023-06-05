
public class SomePut {
	static int mod = 1000000007;
	public static void main(String[] args) {
		long[][] ret = new long[2][2];
		long[][] o1 = new long[2][2];
		long[][] o2 = new long[2][2];
		
		ret[0][0] = ((o1[0][0] * o2[0][0]) + (o1[0][1] * o2[1][0])) % mod;
		ret[0][1] = ((o1[0][0] * o2[0][1]) + (o1[0][1] * o2[1][1])) % mod;
		ret[1][0] = ((o1[1][0] * o2[0][0]) + (o1[1][1] * o2[1][0])) % mod;
		ret[1][1] = ((o1[1][0] * o2[0][1]) + (o1[1][1] * o2[1][1])) % mod;
		
		return ret;
	}

}
