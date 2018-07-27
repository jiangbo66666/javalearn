package cn.it.day4.demo2;
import java.util.Scanner;
public class hanshugetmax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数字");
		int a = sc.nextInt();
		System.out.println("请输入第二个数字");
		int b = sc.nextInt();
		System.out.println(getMax(a,b));
	}
	public static int getMax(int a ,int b) {
		int max;
		if(a>b) {
			max = a;
		}else {
			max = b;
		}
		return max;
	}
}
