
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int S = new java.util.Scanner(System.in).nextInt();
		int h = S / 3600;
		int m = S % 3600 / 60; 
		int s = S % 60;
		System.out.println(h + ":" + m + ":" + s);
	}

}
