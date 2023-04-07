package bit.basic.array;

import java.util.Arrays;
import java.util.TreeMap;

public class ArrayEx1 {

	public void arrayMethod1() {
		int[] m = new int[5]; // [][][][][]
		for (int i = 0; i < m.length; i++) {
			m[i] = (int) (Math.random() * 100);
		}

		System.out.println(Arrays.toString(m));
	}

	public void arrayMethod2() {
		int[][] m = { { 10, 20, 30 }, { 40, 50, 60, 70, 80 }, { 90, 91 } };

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("%5d", m[i][j]);
			}
			System.out.println();
		}
		
		for(int[] a:m) {
			System.out.println(Arrays.toString(a));
		}
		
	}

	public static void main(String[] args) {
		ArrayEx1 a = new ArrayEx1();
		a.arrayMethod1();
		a.arrayMethod2();
		
		byte b = 10;
		byte c = ++b;
		System.out.println(c);
	}

}
