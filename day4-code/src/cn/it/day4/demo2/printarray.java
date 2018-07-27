package cn.it.day4.demo2;

public class printarray {
	public static void main(String[] args) {
		int[] array = { 20, 20 ,11 ,345 ,32 ,54 };
		printArr(array);
	}
	public static void printArr(int[] array) {
		for(int i=0 ;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
}
