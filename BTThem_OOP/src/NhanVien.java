import java.util.Scanner;
public class NhanVien {
    String maNV, ten;
    double luongCoBan, heSo;
    void nhap() {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Ma NV: ");
    	maNV = sc.nextLine();
    	System.out.print("Ten: ");
    	ten = sc.nextLine();
    	System.out.print("Luong co ban: ");
    	luongCoBan = sc.nextDouble();
    	System.out.print("He so: ");
    	heSo = sc.nextDouble();
    }
    double tinhLuong() {
    	return luongCoBan * heSo;
    }
    void xuat() {
    	System.out.println(maNV + "-" + ten + "- Luong: " + tinhLuong());
    }
}
