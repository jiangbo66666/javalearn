package day5codedemo;
import java.util.Arrays;
import java.util.Scanner;
public class preparedemo {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		int array[] = {22,32,131,546};
		print(array);
	}
	public static void print(int arr[]) {
		System.out.println(Arrays.toString(arr));
	}
}
