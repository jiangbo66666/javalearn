package day6democode;

public class persondemo {
	public static void main(String[] args) {
		Person per1 = new Person();
		per1.setName("����ӱ");
		per1.setAge(19);
		System.out.println("�ҽ�"+per1.getName()+"����"+per1.getAge());
		Person per2 = new Person("ɵ��",24);
		System.out.println("�ҽ���"+per2.getAge()+"����"+per2.getName());
		per2.setAge(90);
		per2.setName("����");
		System.out.println("�ҽ���"+per2.getAge()+"����"+per2.getName());
	}
}
