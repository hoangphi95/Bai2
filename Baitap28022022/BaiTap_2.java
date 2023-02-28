import java.util.Scanner;

public class BaiTap_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		System.out.println("Nhập vào số phần tử trong mảng:");
		x = sc.nextInt();
		double[] mang1 = new double[x];
		for (int i = 0; i < x; i++) {
			System.out.println("Nhập vào các giá trị của mảng:" + i);
			mang1[i] = sc.nextDouble();
		}
		double max = mang1[0];
		for (int i = 0; i < mang1.length; i++) {
			if (mang1[i] > max) {
				max = mang1[i];
			}
		}
		System.out.println("GIá trị lớn nhất=" + max);
		double min = mang1[0];
		for (int i = 0; i < mang1.length; i++) {
			if (mang1[i] < min) {
				min = mang1[i];
			}
		}
		System.out.println("GIá trị nhỏ nhất=" + min);
	}
}
