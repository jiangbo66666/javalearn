package cn.it.day4.demo2;

public class demomaxarray {
	public static void main(String[] args) {
		int[] array1= {28,343,678,123,7};
		int max = array1[0];
		for(int i= 0;i<array1.length;i++) {
			if(array1[i] > max) {
				max = array1[i];
			}
		}
		System.out.println(max);
	}
}
