// クラスのメンバ＝フィールド、メソッド
// アクセス修飾子＝public, protected, package-private, private
// アクセス修飾子（クラス）＝public, package-private
// インスタンス生成時に呼び出すメソッド＝コンストラクタ
// ディレクトリ階層でクラスをグループ化する仕組み＝パッケージ
// クラスで定義された変数＝メンバ変数
// メソッド内で定義された変数＝ローカル変数
// クラスから直接呼び出しができるメソッド＝staticメソッド
// チェックする必要がない例外＝ランタイム例外（RuntimeException)
// オブジェクト指向はプログラムを何に見立てるか＝モノ（オブジェクト）
// Javaの型＝クラス
// クラスを実体化したのもの＝インスタンス
// インスタンス生成＝インスタンス化

// カプセル化（隠蔽）
// メソッドやフィールドアクセス修飾子を設定してアクセスを制限する事で変更禁止のフィールドの変更防止
// 一般的にフィールドはprivate

// getter,setter
// フィールドをprivateにする事で直接変更を禁止できるようになりますが同時に値の取得もできなくなります。
// getter,setterを必要に応じて作成し参照します。
// public 戻り値の型(フィールドの型) getフィールド名() {
// 	return this.フィールド名
// }

// public void setフィールド名(フィールドの型の引数) {
// 	this.フィールド名= フィールドの型の引数;
// }

package capsule;
import capsule.human.HumanCapsule;
import capsule.human.HumanNoCapsule;

public class capsule01 {
	public static void main(String[] args) {
		HumanNoCapsule human1 = new HumanCapsule("田中", 28);
		human1.name = "今田";
		human1.age = 70;
		System.out.println("名前は" + human1.name + "、年齢は" + human1.age + "です。");
		HumanCapsule human2 = new HumanCapsule("小林", 32);
		System.out.printl("名前は" + human2.getName() + "、年齢は" + human2.getage() + "です。");
		human2.setName("佐々木");
		System.out.println("変更した名前は" + human2.getName() + "です。");
	}
}


