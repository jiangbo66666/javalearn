package day6democode;

public class persondemo {
	public static void main(String[] args) {
		Person per1 = new Person();
		per1.setName("赵丽颖");
		per1.setAge(19);
		System.out.println("我叫"+per1.getName()+"今年"+per1.getAge());
		Person per2 = new Person("傻逼",24);
		System.out.println("我今年"+per2.getAge()+"我是"+per2.getName());
		per2.setAge(90);
		per2.setName("哈哈");
		System.out.println("我今年"+per2.getAge()+"我是"+per2.getName());
	}
}
