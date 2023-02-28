import java.util.Scanner;

public class BaiTap_5 {
	public static void main(String[] args) {
		int x = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số phần tử trong mảng: ");
		x = sc.nextInt();
		int[] m1 = new int[x];
		int sum = 0;
		for (int i = 0; i < x; i++) {
			System.out.println("Nhập vào giá trị của từng phần tử");
			m1[i] = sc.nextInt();
			if ((sum += m1[i]) > 100) {
				sum += m1[i];
				System.out.println("Giá trị= " + sum);
			}

		}

	}
}
