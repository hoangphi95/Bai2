import java.util.Scanner;

public class BaiTap_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		System.out.println("Nhập vào số phần tử của mảng;");
		x = sc.nextInt();
		int[] m1 = new int[x];
		int z = 0;

		for (int i = 0; i < x; i++) {
			{
				System.out.println("Nhập vào giá trị phân tử:");
				m1[i] = sc.nextInt();

			}
			System.out.println("Giá trị nhập vào là: " + m1[i]);
		}

	}
}
