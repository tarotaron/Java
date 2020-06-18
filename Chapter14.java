package inner_class_sample;

非staticクラス＝外部クラスのインスタンスからのみインスタンス化できる
public class Outer {
	public class Inner {

	}
}

public class Example {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
	}
}

クラスOuterは外部クラスのため Outer outer = new Outer(); でインスタンス化
クラスInnerは非staticの内部クラスのため、外部クラスのouterのインスタンスを使って Outer.Inner inner = outer.new Inner(); でインスタンス化
もしくわ import inner_class_sample.Outer.Inner;


staticクラス＝クラス外から直接インスタンス化できる
public class Outer {
	public static class Inner {

	}
}

public class Example {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = new Outer.Inner();
	}
}

staticな内部クラスのため new.Outer.Inner(); でインスタンス化
もしくは import inner_class_sample.Outer.Inner; で new Inner()のみで生成

public class Outer {
	private String greeting = "こんにちは";

	public class Inner {
		public String hello() {
			return greeting;
		}
	}
}

public class Human {
	public class HumanLeg {
		public void kick() {
			System.out.println("蹴る");
		}
	}
}

public class practice {
	public static void main(String[] args) {
		Human human = new Human();
		Human.HumanLeg leg = human.new HumanLeg();
		leg.kick();
	}
}