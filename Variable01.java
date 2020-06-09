// public class Variable01 {
// 	public static void main(String[] args) {
// 		int num1;
// 		String str1;
// 		num1 = 10;
// 		str1 = "Hello World";
// 		System.out.println(num1);
// 		System.out.println(str1);

// 		num1 = 20;
// 		System.out.println(num1);

// 		int num2 = 30;
// 		System.out.println(num2);

// 		final int MIN_NUMBER = 10;
// 		System.out.println(MIN_NUMBER);
// 	}
// }

// 変数
// 型 変数名;

// 代入 変数を使用する為には変数に値を格納(代入)する必要がある

// 初期化 変数の初期化とは宣言した変数に初期値を代入する事
// 型 変数名 = 代入するデータ;

// 再代入 変数に何度でも値を代入できる 再代入すると値は失われて新しい値が格納されます

// 識別子 変数名、メソッド名、クラス名
// 予約後は禁止 例new,void,else
// 数字(先頭使用不可)、アルファベット(大文字、小文字区別)、＿、＄は使用可

// 定数 最初に代入した値を変更できない 全て大文字 複数後は＿で区切り
// final 定数型 定数名 = 初期値;

public class Variable01 {
	public static void main(String[] args) {
		String name = "suzu";
		System.out.println(name);
		name = "kabi";
		System.out.println(name);
		final int LUCKY_NUMBER = 8;
		System.out.println(LUCKY_NUMBER);
	}
}