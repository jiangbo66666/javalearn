package day6democode;

public class splitedemo {
	public static void main(String[] args) {
		String str1 = "aaa,bbb,ccc";
		String[] array1 = str1.split(",");
//		System.out.println(array1);
		for (int i = 0;i < array1.length; i++) {
			System.out.print(array1[i]);
		}
	}
}
