package Chapter;
import Chapter.human.Human01;
import Chapter.human.Human02;

public class Chapter06 {
	public static void main(String[] args) {
		// Human01クラスを引数なしコンストラクタでインスタンス生成
		Human01 yamada = new Human01();
		// 初期値は設定されたフィールドを参照して表示
		System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");
		String profile = yamada.getProfile();
		System.out.println(prifile + "です");

		// Human01クラスを引数ありコンストラクタでインスタンス生成
		Human01 sato = new Human01("佐藤", 25);
		// 初期値は設定されたフィールドを参照して表示
		System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。")
	
		yamada.greet("田辺");
		yamada.greet(null);


		Human02 yamada = new Human02("山田");
		Human02 sato = new Human02("佐藤");

		// 静的メンバはインスタンスを生成せずに直接使用できる
		Human02.staticMethod();
		System.out.println(Human02.humanCount);

		// staticなクラス定数もインスタンスを生成せずに参照できる
		System.out.println(Human02.GREETING);

		// インスタンスメンバは直接使用できない（コンパイルエラー）
		// Human02.instanceMethod();
		// System.out.println(Human02.name);

		// インスタンスメンバはインスタンス生成してから使用
		yamada.instanceMethod();
		System.out.println(yamada.name);
	}
}

// メンバ
// フィールド(変数、値の定義)＋メソッドをまとめた物

// コンストラクタ
// インスタンス生成時に呼び出し、フィールドの初期化や初期処理に使用。
// 初期処理を行わない場合、自動で引数なし処理でデフォルトコンストラクタが追加される。

// インスタンス
// クラスを記述しただけでは実行は不可能。インスタンス生成する必要あり。

// this変数
// 自分自身のインスタンスを表す変数。
// 自分自身のインスタンスのフィールドやメソッドである事を明示的にする場合使用。

// パッケージ
// ディレクトリ階層でクラスをグループ化して管理しやすくする。
// 指定なしの場合デフォルトパッケージ所属。
// クラス名は「パッケージ名、クラス名」で一意に特定。
// パッケージ別であれば同じクラス名を使用できる。
//package パッケージ名;

// インポート
// インポート分で宣言するとクラス名だけで使用可能
// import パッケージ名.クラス名;

// final修飾子
// クラス使用は継承禁止 メソッド使用はオーバーライド禁止 変数使用は変更禁止

// static修飾子
// メソッドの呼び出し、フィールドの参照をインスタンスからではなくクラスから直接できる


