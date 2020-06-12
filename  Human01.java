package Chapter.human;

public class Human01{
	//フィールド宣言
	public String name;
	public int age;
	public String profession;

	//引数なしのコンストラクタ
	public Human01() {
		// フィールドに初期値設定
		this.name = "山田";
		this.age = 20;
		this.profession = "プログラマー";
	}

	public String getProfile() {
		return "年齢は" + this.age + "職業は" + this.profession;
	}

	// //引数ありのコンストラクタ
	// public void greet(String name, int age) {
	// 	// フィールドに初期値設定
	// 	// 引数の変数を自分自身のインスタンスのフィールドに代入
	// 	// *name=nameとするとインスタンスではなく、引数のnameに代入する意味になってしまう
	// 	this.name = name;
	// 	this.age = age;
	// }

	public void greet(String friend) {
		if(friend == null) {
			System.out.println("挨拶する友達がわかりません！");
			return;
		}
		System.out.println(friend + "さん、こんにちは！");
	}
}
