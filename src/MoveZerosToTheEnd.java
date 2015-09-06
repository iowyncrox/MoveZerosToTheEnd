import java.util.Arrays;

public class MoveZerosToTheEnd {

	public static int[] moveZeroToTheEnd(int[] array) {
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				array[count++] = array[i];
			}
		}

		while (count < array.length) {
			array[count++] = 0;
		}

		return array;
	}

	public static void main(String[] args) {
		int[] array = { 0, 1, 2, 1, 2, 0, 1, 2 };
		array = moveZeroToTheEnd(array);
		System.out.println(Arrays.toString(array));
	}
}