import java.util.Scanner;

public class BaiTap_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a1 = new int[10];
		int[] a2 = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Nhập vào giá trị của của phần tử:" + i);
			a1[i] = sc.nextInt();
		}
		for (int i = 9; i >= 0; i--) {
			a2[i] = a1[i];
			System.out.println("Giá trị đảo ngược: " + a1[i]);
		}
	}
}
