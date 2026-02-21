import java.util.Scanner;
public class PhuongTrinhBac1 {
	public static void main(String[] args) {
		Scanner Nhap = new Scanner(System.in);
		System.out.print("Nhập a: ");
		double a = Nhap.nextDouble();
		System.out.print("Nhập b: ");
		double b = Nhap.nextDouble();
		if(a == 0) {
			if(b == 0) {
				System.out.println("Phương trình vô số nghiệm");
			}else {
				System.out.println("Phương trình vô nghiệm");
			}
		}else {
			double x = -b/a;
			System.out.println("Nghiệm x = " + x);
		}
		Nhap.close();
	}
}
