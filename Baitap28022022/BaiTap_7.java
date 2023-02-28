import java.util.Scanner;

public class BaiTap_7 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int x;
	System.out.println("Nhập vào giá trị số cần xóa");
	x=sc.nextInt();
	int [] arr=new int [10];
	for (int i = 0; i < arr.length; i++) {
		System.out.println("Nhập vào giá trị phần tử"+i);
		arr[i]=sc.nextInt();
	}
	for (int i = x; i < arr.length-1; i++) {
		arr[i]=arr[i+1];
		
	}
	System.out.println("Sau khi xóa");
	for (int i : arr) {
		System.out.println(i+" ");
		
	}

}
}
