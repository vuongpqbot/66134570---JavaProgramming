import java.util.Scanner;
public class TinhTienLuong {
	public static void main(String[] args) {
		Scanner Nhap = new Scanner(System.in);
        System.out.print("Nhập số giờ làm: ");
        double GioLam = Nhap.nextDouble();
        System.out.print("Nhập lương theo giờ: ");
        double TienLuong = Nhap.nextDouble();
        double LuongTong;
        if(GioLam <= 40) {
        	LuongTong = GioLam * TienLuong;
        }else {
        	LuongTong = 40 * TienLuong + (GioLam - 40) * TienLuong * 1.5;
        }
        System.out.print("Tổng lương: "+ String.format("%,.0f", LuongTong) + "đ");
        Nhap.close();
	}
}
