package leicode;

public class demostu {
	public static void main(String[] args) {
		Person stu = new Person();
		stu.setName("����ӱ");
		stu.setAge(19);
		System.out.println("�ҽ�"+stu.getName()+"����"+stu.getAge()+"��");
		Person stu2 = new Person("����",11);
		System.out.println("�ҽ�"+stu2.getName()+"����"+stu2.getAge()+"��");
	}
}
