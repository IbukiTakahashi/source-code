import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in); // System.inに関連付けられたScannerのオブジェクトを作成
        int a = sc.nextInt();
        int b = sc.nextInt();
		System.out.print(a*b);
		System.out.print(" ");
		System.out.println(2*(a+b));
	}

}
