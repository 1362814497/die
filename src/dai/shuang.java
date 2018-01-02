package dai;

import java.util.Scanner;

public class shuang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a];
		int b = 1;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = b;
			b++;
			System.out.println(arr[i]);

		}
	}

}
