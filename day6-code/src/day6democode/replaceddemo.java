package day6democode;

public class replaceddemo {
	public static void main(String[] args) {
		String str1 = "会不会做人啊，以后等死吧你，没教养，草泥马";
		String str2 = str1.replace("没教养", "***");
		System.out.println(str1);
		System.out.println(str2);
	}
}
