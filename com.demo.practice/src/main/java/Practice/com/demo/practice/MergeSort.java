package Practice.com.demo.practice;

public class MergeSort {
	public static void main(String[] args) {
		int a[] = { 11, 4, 12, 8, 17 };
		sort(a, 0, a.length - 1);
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

	public static void sort(int a[], int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;
			sort(a, l, m);
			sort(a, m + 1, r);
			merge(a, l, m, r);
		}
	}

	public static void merge(int[] a, int l, int m, int r) {

		int n1 = m - l + 1;
		int n2 = r - m;
		int L[] = new int[n1];
		int R[] = new int[n2];
		for (int i = 0; i < n1; i++) {
			L[i] = a[ l + i];
		}
		for (int j = 0; j < n2; j++) {
			R[j] = a[m + 1 + j];
		}

		int i = 0, j = 0;
		int k = l;

		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				a[k] = L[i];
				i++;
			} else {
				a[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			a[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			a[k] = R[j];
			j++;
			k++;
		}

	}
}
