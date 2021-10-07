public class FizzBuzz {

	private static final int NUM_FOR_FIZZ = 3;
	private static final int NUM_FOR_BUZZ = 5;

	private static final String FIZZ = "Fizz";
	private static final String BUZZ = "Buzz";
	private static final String FIZZ_BUZZ = FIZZ + " " + BUZZ;

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (isFizz(i) && isBuzz(i)) {
				System.out.println(FIZZ_BUZZ);
			} else if (isFizz(i)) {
				System.out.println(FIZZ);
			} else if (isBuzz(i)) {
				System.out.println(BUZZ);
			} else {
				System.out.println(i);
			}
		}
	}

	private static boolean isFizz(int i) {
		return i % NUM_FOR_FIZZ == 0;
	}

	private static boolean isBuzz(int i) {
		return i % NUM_FOR_BUZZ == 0;
	}
}
