import java.util.Scanner;

public class BaiTap_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số phần từ của mảng số nguyên:");
		int x = sc.nextInt();
		int[] m1 = new int[x];

		System.out.println("Nhập các giá trị trong mảng SỐ nguyên:");
		for (int i = 0; i < x; i++) {
			System.out.println("[i]" + i);
			m1[i] = sc.nextInt();

		}
		int max = m1[0];
		for (int i = 0; i < m1.length; i++) {
			if (m1[i] > max) {
				max = m1[i];
			}
		}
		System.out.println("Giá trị lớn nhất max=" + max);
		int min = m1[0];
		for (int i = 0; i < m1.length; i++) {
			if (min > m1[i]) {
				min = m1[i];
			}
		}
		System.out.println("Giá trị nhỏ nhất min=" + min);

	}
}
