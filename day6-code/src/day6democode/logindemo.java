package day6democode;
import java.util.Scanner;
public class logindemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String rightname = "qwerty";
		String rightpwd = "123456";
		for (int i = 0 ;i < 3; i++) {
			System.out.println("Ç×ÊäÈëÕËºÅÃû");
			String iptname = sc.next();
			System.out.println("Ç×ÊäÈëÃÜÂë");
			String iptpwd = sc.next();
			if(iptname.equalsIgnoreCase(rightname) && rightpwd.equals(iptpwd)) {
				System.out.println("µÇÂ½³É¹¦");
			}else if(i == 2){
				System.out.println("µÇÂ½Ê§°Ü,Äã×ß°É");
			}else {
				System.out.println("µÇÂ½Ê§°Ü£¬ÔÙÊÔÒ»´Î111");
			}
		}
		
	}
}
