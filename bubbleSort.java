package datastructure.com;

import java.util.Scanner;

public class bubbleSort {
	int a[] = new int[10];

	void getdata() {

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {

			System.out.println("Enter the numbers: ");
			a[i] = sc.nextInt();

		}
	}

	void putData() {
		int i;
		for (i = 0; i < 10; i++)
			System.out.println(a[i]);
	}

	void sort() {

		int i, j, t;

		for (i = 0; i < 10; i++)
			for (j = 0; j < 9 - i; j++) {
				if (a[j] > a[j + 1]) {
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
	}

	public static void main(String ars[]) {
		bubbleSort bs = new bubbleSort();
		bs.getdata();
		System.out.println("Unsorted Array is: ");
		bs.putData();
		bs.sort();
		System.out.println("Sorted Array is: ");
		bs.putData();

	}
}