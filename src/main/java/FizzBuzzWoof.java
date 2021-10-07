public class FizzBuzzWoof {
	private static final int NUM_FOR_FIZZ = 3;
	private static final int NUM_FOR_BUZZ = 5;
	private static final int NUM_FOR_WOOF = 7;

	private static final String FIZZ = "Fizz";
	private static final String BUZZ = "Buzz";
	private static final String WOOF = "Woof";
	private static final char DELIMITER = ' ';

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i <= 105; i++) {
			if (isFizz(i)) {
				sb.append(FIZZ);
			}
			if (isBuzz(i)) {
				if (sb.length() > 0) sb.append(DELIMITER);
				sb.append(BUZZ);
			}
			if (isWoof(i)) {
				if (sb.length() > 0) sb.append(DELIMITER);
				sb.append(WOOF);
			}
			if (sb.length() == 0) {
				sb.append(i);
			}
			System.out.println(sb);
			sb.setLength(0);
		}
	}

	private static boolean isFizz(int i) {
		return i % NUM_FOR_FIZZ == 0;
	}

	private static boolean isBuzz(int i) {
		return i % NUM_FOR_BUZZ == 0;
	}

	private static boolean isWoof(int i) {
		return i % NUM_FOR_WOOF == 0;
	}
}
