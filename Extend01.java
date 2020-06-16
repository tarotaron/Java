package extend;

import extends.human.Employee;
import extends.human.Human;
import extends.human.Student;

public class Extend01 {
	public static void main(String[] args) {
		Human sugimoto = new Human("杉本", 16);
		System.out.println("Humanクラスのメソッド：名前は、" + sugimoto.getName());

		Student sato = new Student("佐藤", 17, 70);
		System.out.println("Humanクラスのメソッド：名前は、" + sato.getName());
		System.out.println("Studentクラスのメソッド：プロフィールは、" + sato.getStudentProfile());

		Human human = new Employee("田中", 28, "システム部");
		System.out.println("Humanクラスのメソッド：名前は、" + human.getName());

		Employee tanaka = (Employee) human;
		System.out.println("Employeeクラスのメソッド：プロフィールは、" + tanaka.getEmployeeProfile());

		Extend01.printName(sugimoto);
		Extend01.printName(sato);
		Extend01.printName(tanaka);
	}
	public static void printName(Human human) {
		System.out.println("Humanクラスのメソッド：名前は、" + human.getName());
	}
}

継承構文(継承を利用すると親元のメソッドやフィールドを利用して、追加したい文だけの記述のみにできる)
							//親クラス名
修飾子 class クラス名 extends スーパークラス名 {
	// サブクラスの処理
}
 ＊final修飾子が指定されたクラスは継承禁止

super(子インスタンスから親のメソッドやフィールドを呼び出す際に使う)
// 親インスタンスのフィールド参照
super.フィールド;
// 親インスタンスのメソッド呼び出し
super.メソッド();