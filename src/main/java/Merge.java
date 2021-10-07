import java.util.Arrays;

public class Merge {

	public static void main(String[] args) {
		int[] list1 = new int[]{-2, 1, 7, 11, 17, 25, 48, 103};
		int[] list2 = new int[]{0, 3, 5, 13};
		int[] result = merge(list1, list2);

		System.out.println("list1 = " + Arrays.toString(list1));
		System.out.println("list2 = " + Arrays.toString(list2));
		System.out.println("result = " + Arrays.toString(result));
	}

	private static int[] merge(int[] first, int[] second) {
		int[] result = new int[first.length + second.length];
		int indexResult = 0;
		int indexFirst = 0;
		int indexSecond = 0;

		while (indexFirst < first.length && indexSecond < second.length) {
			if (first[indexFirst] <= second[indexSecond]) {
				result[indexResult++] = first[indexFirst++];
			} else {
				result[indexResult++] = second[indexSecond++];
			}
		}

		if (indexFirst == first.length) {
			System.arraycopy(second, indexSecond, result, indexResult, second.length - indexSecond);
		} else if (indexSecond == second.length) {
			System.arraycopy(first, indexFirst, result, indexResult, first.length - indexFirst);
		}
		return result;
	}
}
