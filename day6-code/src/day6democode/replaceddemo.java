package day6democode;

public class replaceddemo {
	public static void main(String[] args) {
		String str1 = "�᲻�����˰����Ժ�������㣬û������������";
		String str2 = str1.replace("û����", "***");
		System.out.println(str1);
		System.out.println(str2);
	}
}
