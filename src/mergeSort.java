
public class mergeSort {

	public static void main(String[] args) {
		int[] array1 = { 1, 5, 9, 11, 14, 20, 30 };
		int[] array2 = { 2, 4, 8, 10, 16, 30, 40, 50 };
		int a1C = 0;
		int a2C = 0;
		int mAC = 0;

		int[] mergedArray = new int[array1.length + array2.length];

		while (a1C < array1.length && a2C < array2.length) {
			if (array1[a1C] < array2[a2C]) {
				mergedArray[mAC] = array1[a1C];
				a1C++;
				mAC++;
			} else if (array1[a1C] > array2[a2C]) {
				mergedArray[mAC] = array2[a2C];
				a2C++;
				mAC++;
			} else if (array1[a1C] == array2[a2C]) {
				mergedArray[mAC] = array1[a1C];
				mAC++;
				mergedArray[mAC] = array2[a2C];
				mAC++;
				a1C++;
				a2C++;
			}
		}

		if (a1C < array1.length) {
			for (int i = a1C; i < array1.length; i++) {
				mergedArray[mAC] = array1[i];
				mAC++;
			}
		} else if (a2C < array2.length) {
			for (int i = a2C; i < array2.length; i++) {
				mergedArray[mAC] = array2[i];
				mAC++;
			}
		}

		for (int i = 0; i < mergedArray.length; i++) {
			System.out.print(mergedArray[i] + " ");
		}
	}
}
