import java.util.*;
public class A1113306_0224_1{
	public static void main(String[] args){
		System.out.print("請輸入一數字:");
		Scanner sc=new Scanner(System.in);
		int number;
		number=sc.nextInt();
		if(number%2==0){
			System.out.println("是偶數");
		}
		else{
			System.out.println("是奇數");
		}
	}
}