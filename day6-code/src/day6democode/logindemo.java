package day6democode;
import java.util.Scanner;
public class logindemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String rightname = "qwerty";
		String rightpwd = "123456";
		for (int i = 0 ;i < 3; i++) {
			System.out.println("�������˺���");
			String iptname = sc.next();
			System.out.println("����������");
			String iptpwd = sc.next();
			if(iptname.equalsIgnoreCase(rightname) && rightpwd.equals(iptpwd)) {
				System.out.println("��½�ɹ�");
			}else if(i == 2){
				System.out.println("��½ʧ��,���߰�");
			}else {
				System.out.println("��½ʧ�ܣ�����һ��111");
			}
		}
		
	}
}
