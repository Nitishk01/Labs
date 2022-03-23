package Lab_6;

import java.util.*;

public class Lab6Ex_7 {

	public static List<Integer> getSorted(int a[]) {
		List<Integer> list = new ArrayList<Integer>();
		int r = 0;
		for (int i = 0; i < 5; i++) {

			while (a[i] != 0) {
				int d = a[i] % 10;
				r = r * 10 + d;
				a[i] = a[i] / 10;
			}
			list.add(r);
			r = 0;
		}
		return list;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();

		}
		List<Integer> l = getSorted(a);
		Collections.sort(l);
		for (int i : l) {
			System.out.println(i);
		}

	}
}
