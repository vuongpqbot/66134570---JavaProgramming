package vuongpqbot;

import java.util.ArrayList;
import java.util.Scanner;

public class runMain {
	public static void main(String[] args) {
		//khai báo biến danh sách, chứa các biến
		ArrayList<Integer> dsSoNguyen = new ArrayList<Integer>();
	    //a) Nhập 10 phần tử từ bàn phím
		Scanner Nhap = new Scanner(System.in);
		//Nhập n phần tử
		System.out.print("Nhập số phần tử: ");
		int n = Nhap.nextInt();
		for(int i = 0; i < n; i++) {
			//Nhập 1 phần tử
			 //Ỉn ra một hướng dẫn cho người dùng
//			System.out.print("Mời nhập phần tử thứ "  + i + ": ");
			System.out.print("a[" + i + "] = ");
				//Cho User nhập, cất vào biến tạm
				Integer tam = Nhap.nextInt();
			//Thêm vào cuối danh sách
			dsSoNguyen.add(tam);
		}
		//b) In ra danh sách vừa nhập
		System.out.print("DANH SÁCH VỪA NHẬP LÀ \n");
//		for(int i = 0; i < dsSoNguyen.size(); i++) {
//			//Lấy giá trị phần tử ở vị trí i, cất vào biến tạm
//			Integer tam = dsSoNguyen.get(i);
//			System.out.print(tam + " ");
//		}
		for(Integer x: dsSoNguyen) {
			System.out.print(x + " ");
		}
		//c) Đếm số phần tử chẵn
		int SLChan = 0;
		for(Integer x: dsSoNguyen) {
			if(x % 2 == 0) SLChan = SLChan + 1;
//		    if(x % 2 == 0) SLChan++;
		}
		System.out.println("\nSố phần tử chẵn: "+ SLChan);
//		for(int i = 0; i < dsSoNguyen.size(); i++) {
//		Integer tam = dsSoNguyen.get(i);
//		  if(tam % 2 == 0) SLChan = SLChan + 1;
//	}
		//d) Tính tổng các phần tử: Thuật toán cộng dồn
		int Tong = 0;
		for(Integer x: dsSoNguyen) {
			Tong += x;
		}
		System.out.println("Tổng tất cả các phần tử là: "+ Tong);
	}
}
