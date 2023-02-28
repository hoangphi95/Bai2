
public class BaiTap_3 {
	public static void main(String[] args) {
		int[] m1 = { 22, 33, 55, 66, 88, 68, 25, 34 };
		int snChan = 0;
		int snLe = 0;
		for (int i = 0; i < m1.length; i++) {
			if (m1[i] % 2 == 0) {
				snChan++;
			} else {
				snLe++;
			}
		}
		System.out.println("Số lượng số chẵn trong mảng:" + snChan);
		System.out.println("Số lượng số le trong mảng:" + snLe);
	}
}
