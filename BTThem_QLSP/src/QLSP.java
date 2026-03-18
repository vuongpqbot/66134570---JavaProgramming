import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class QLSP {
	public static void main(String[] args) {
	   Scanner user = new Scanner(System.in);
	   System.out.print("Nhap so luong san pham: ");
	   int n = user.nextInt();
	   user.nextLine();   //tránh bị lỗi 
	   try {
		   FileWriter writer = new FileWriter("sanpham.txt", true);
		   for(int i = 0; i < n; i++) {
			   System.out.println("\n--- NHAP SAN PHAM " + (i + 1) + " ---");
			   System.out.print("Ma san pham: ");
			   String maSP = user.nextLine();
			   System.out.print("Ten san pham: ");
			   String tenSP = user.nextLine();
			   System.out.print("Gia: ");
			   double gia = user.nextDouble();
			   System.out.print("So luong: ");
			   int soLuong = user.nextInt();
			   user.nextLine();
			   double tongTien = gia * soLuong;
			   //Phan loai gia
			   String loaiGia;
			   if(gia < 100) loaiGia = "Re";
			   else if(gia <= 500) loaiGia = "Trung binh";
			   else loaiGia = "Dat";
			   //Ghi file 
			   writer.write("--- SAN PHAM ---\n");
			   writer.write("Ma san pham: " + maSP + "\n");
			   writer.write("Ten san pham: " + tenSP + "\n");
			   writer.write(String.format("Gia: %.2f\n", gia));
			   writer.write("So luong: " + soLuong + "\n");
			   writer.write(String.format("Tong tien: %.2f\n", tongTien));
			   writer.write("Phan loai: " + loaiGia + "\n");
		   }
		   writer.close();
		   System.out.println("\nDa luu tat ca cac san pham vao file sanpham.txt");
	   }catch (IOException e) {
		   System.out.println("Loi ghi file: " + e.getMessage());
	   }
	   user.close();
	}
}
