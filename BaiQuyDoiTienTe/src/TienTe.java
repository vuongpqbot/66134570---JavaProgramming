import java.util.Scanner;
public class TienTe {
    public static void main(String[] args) {
        Scanner Nhap = new Scanner(System.in);
        // Nhập tiền USD
        System.out.print("Nhập số tiền USD: ");
        double USD = Nhap.nextDouble();
        // Nhập tiền EUR
        System.out.print("Nhập số tiền EUR: ");
        double EURO = Nhap.nextDouble();
        // Quy đổi
        double DoLa = USD * 23500;
        double BangAnh = EURO * 27000;
        // In kết quả
        System.out.println("USD -> VND: " + String.format("%,.0f", DoLa) + " đ");
        System.out.println("EURO -> VND: " + String.format("%,.0f", BangAnh) + " đ");
        Nhap.close();
    }
}