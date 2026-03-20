package vuongpq.qlnhanvien;
public class NhanVien {
    //Thuoc tinh 
	private String maNV;
	private String hoTen;
	private double luongCoBan;
	//Ham tao
//	public NhanVien() {
//		
//	}
//	public NhanVien(String maNhanVien, String tenNhanVien, double luongCoBan) {
//		this.maNV = maNhanVien;
//		this.hoTen = tenNhanVien;
//		this.luongCoBan = luongCoBan;
//	}
	public NhanVien(String maNV, String hoTen, double luongCoBan) {
		super();
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.luongCoBan = luongCoBan;
	}
	public NhanVien() {
		super();
	}
    public double tinhLuong() {
    	return luongCoBan;
    }
	@Override
	public String toString() {
		String chuoiXuat = "";
		chuoiXuat = chuoiXuat + "Ma NV: " + this.maNV;
		chuoiXuat = chuoiXuat + "\nHo Ten: " + this.hoTen;
		chuoiXuat = chuoiXuat + "\nLuong co ban: " + this.luongCoBan;
		return chuoiXuat;
//		return "NhanVien [maNV=" + maNV + ", hoTen=" + hoTen + ", luongCoBan=" + luongCoBan + "]";
	}
    public void hienThiThongTin() {
    	System.out.println("Ma NV: " + maNV);
    	System.out.println("Ho ten: " + hoTen);
    	System.out.println("Luong co ban: " + luongCoBan);
    }
    //cac getter va setter
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public double getLuongCoBan() {
		return luongCoBan;
	}
	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}
    
}
