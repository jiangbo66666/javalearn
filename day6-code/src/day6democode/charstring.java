package day6democode;

public class charstring {
	public static void main(String[] args) {
		char[] array= {'h','e','l','l','o'};
		String str1 = new String(array);
		System.out.println(str1);
		String str2 = new String(array,2,3);
		System.out.println(str2);
		String str3 = "hello";
		System.out.println(str3 == str1);
		boolean a = str1.equals(str3);
		System.out.println(a);
		String str4 = "Hello";
		System.out.println("=====================");
		System.out.println(str4.equals(str3));
		System.out.println(str4.equalsIgnoreCase(str3));
	}
}