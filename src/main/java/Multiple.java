public class Multiple {

	private static final int[] MULTIPLES = new int[]{ 3, 5 };

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i < 1000; i++){
			for (int multiple: MULTIPLES) {
				if (i % multiple == 0){
					sum += i;
					break;
				}
			}
		}
		System.out.println("sum = " + sum);
	}
}
