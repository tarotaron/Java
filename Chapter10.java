package practice;

public class Chapter10 {
	public static void main(String[] args) {
		NoCapsulMan man = new NoCapsulMan("小林", 32);
		System.out.println("名前は" + man.name + "です。");
		System.out.println("年齢は" + man.age + "です。");
		man.age = 33;
		System.out.println("誕生日を迎えたので、年齢が、" + man.age + "になりました。");

		CapsulMan = man1 = new CapsulMan("小林", 32);
		System.out.println("名前は" + man1.getName() + "です。");
		System.out.println("年齢は" + man1.getAge() + "です。");
		man1.setAge(33);
		System.out.println("誕生日を迎えたので、年齢が、" + man1.getAge() + "になりました。");
	}
}