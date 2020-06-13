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
		// String型の戻り値を返す
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

	// メソッド内での宣言した変数はインスタンス変数と不別する為ローカル変数とよぶ
	public void greet(String friend) {
		if(friend == null) {
			// System.out.println("挨拶する友達がわかりません！");
			// 戻り値を戻すreturn文 returnの後ろに戻り値を指定
			// メソッド名の前に定義した戻り値型である必要がある。
			// 戻り値を返さない場合戻り値型にvoidを指定

			// nullの場合処理を終了する為returnをする
			return;
		}
		System.out.println(friend + "さん、こんにちは！");
	}
}
