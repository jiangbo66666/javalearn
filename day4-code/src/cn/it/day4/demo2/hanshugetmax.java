package cn.it.day4.demo2;
import java.util.Scanner;
public class hanshugetmax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������");
		int a = sc.nextInt();
		System.out.println("������ڶ�������");
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
