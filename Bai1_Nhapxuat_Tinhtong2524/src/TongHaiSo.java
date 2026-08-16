import java.util.Scanner;

public class TongHaiSo {

	public static void main(String[] args) {
		//Khai báo
		double num1, num2, sum;
		//khai báo đối tương Scanner
		Scanner banPhim = new Scanner(System.in);
		//in ra thông tin, mời User nhập số thứ nhất
		System.out.print("mời nhập số thứ nhất: ");
		num1 = banPhim.nextDouble();
		
		System.out.print("mời nhập số thứ hai: ");
		num2 = banPhim.nextDouble();
		
		//tính toán
		sum= num1+num2;
		//xuất ra
		//System.out.print(" tổng của " + num1 + " và " + num2 + " là " + sum);
		
		//System.out.print(" tổng của ");
		//System.out.print(num1);
		//System.out.print(" + ");
		//System.out.print(num2);
		//System.out.print(" = ");
		//System.out.print(sum);
		
		System.out.printf(" tổng của %.2f và %.2f là %.2f", num1, num2, sum);

	}

}
