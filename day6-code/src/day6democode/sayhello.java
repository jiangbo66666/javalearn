package day6democode;

public class sayhello {
	public static void main(String[] args) {
		Person ys = new Person();
		ys.setAge(19);
		ys.setName("ÑÇÉª");
		Person hy = new Person();
		hy.setAge(30);
		hy.setName("ºóÒá");
		ys.say(hy.getName());
		hy.say(ys.getName());
	}
}
