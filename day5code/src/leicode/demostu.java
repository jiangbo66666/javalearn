package leicode;

public class demostu {
	public static void main(String[] args) {
		Person stu = new Person();
		stu.setName("赵丽颖");
		stu.setAge(19);
		System.out.println("我叫"+stu.getName()+"今年"+stu.getAge()+"岁");
		Person stu2 = new Person("柳岩",11);
		System.out.println("我叫"+stu2.getName()+"今年"+stu2.getAge()+"岁");
	}
}
