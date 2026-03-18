import java.util.ArrayList;
import java.util.Scanner;
public class ChayChuongTrinh {
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  ArrayList<Integer> list = new ArrayList<Integer>();
	  System.out.print("Nhap n: ");
	  int n = sc.nextInt();
	  System.out.println("Nhap cac so");
	  int sum = 0, demChan = 0;
	  for(int i = 0; i < n; i++) {
		  System.out.print("So thu " + (i + 1) + ": ");
		  int x = sc.nextInt();
		  list.add(x);
		  sum += x;
		  if(x % 2 == 0) demChan++;
	  }
	  System.out.print("Tong: " + sum);
	  System.out.print("\nSo chan: " + demChan);
	}
}
