package Chapter.human;

public class Human02 {
	// static変数
	static public int humanCount = 0;
	// 定数フィールド
	public static final String GREETING = "こんにちは";

	public Human02(String name) {
		// インスタンス生成ごとにstatic変数インクリメント
		Human02.humanCount++;
	}

	static public void staticMethod() {
		// staticメソッドからインスタンス変数は使用できない（コンパイルエラー）
		// System.out.println("名前は" + name);

		// static変数humancount表示
		System.out.println("人の数は" + Human02.humanCount);
	}

	public void instanceMethod() {
		// インスタンス変数のnameを表示
		System.out.println("名前は" + name);
		// static変数のhumancountを表示
		System.out.println("人の数は" + Human02.humanCount);
	}
}