public class NhanVienOOP {
	public static void main(String[] args) {
		NhanVien nv1 = new NhanVien();
		NhanVien nv2 = new NhanVien();
		System.out.println("Nhap NV1");
		nv1.nhap();
		System.out.println("Nhap NV2");
		nv2.nhap();
		System.out.println("\nNhan vien luong cao hon: ");
		if(nv1.tinhLuong() > nv2.tinhLuong())
			nv1.xuat();
		else
			nv2.xuat();
	}
}
