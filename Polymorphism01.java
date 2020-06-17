package ploymorphism;

import polymorphism.human.Employee;
import polymorphism.human.Human;
import polymorphism.human.Student;

public class polymorphism01 {
	public static void main(String[] args) {
		Human human1 = new Student("佐藤", 17, 70);
		System.out.println("Humanクラスのメソッド：プロフィールは、" + human1.getPofile());

		Human human2 = new Employee("田中", 28, "システム部");
		System.out.println("Humanクラスのメソッド：プロフィールは、" + human2.getPofile());
	}
}

ポリモーフィズム
中に入るものによって同じ関数でも違う処理が行えるプログラミング言語自体の特徴。

オーバーライド
スーパークラスのメソッドをサブクラスで上書きして再定義する事
インターフェースのメソッドの再定義でも同じです。
スーパークラスの処理を変更したい場合のみオーバーライドする事でソースコードの量が減る。