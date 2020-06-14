package exception;

// public class Chapter08{
// 	public static void main(String[] args) {
// 		System.out.println("100 ÷ 0は？");
// 		// 0で割り算するので例外が発生
// 		int result = 100 / 0;
// 		// 例外が発生した以降の処理は実行されない
// 		System.out.println("計算結果" + result);
// 		System.out.println("プログラム終了");
// 	}
// }

// 例外(Throwable)
// // Errorクラス(致命的なエラー)、RuntimeExceptionクラス(例外処理を記述しなくてもコンパイルエラーはでない)、それ以外のExceptionクラス(例外処理必須)
// try{
// 	例外が発生するかもしれない処理
// } catch(例外クラス 変数名) { //tryで発生した例外クラスとcatchに記述した例外クラスが一致した場合処理
// 	例外が発生したときの実行処理
// }finally {
// 	例外発生の有無にかかわらず実行される処理
// }

// public class Chapter08{
// 	public static void main(String[] args) {
// 		try {
// 			System.out.println("100 ÷ 0は？");
// 			int result = 100 / 0;
// 			System.out.println("計算結果" + result);
// 		} catch(ArithmeticException e) {
// 			System.out.println("例外が発生");
// 		} finally {
// 			System.out.println("プログラム終了");
// 		}
// 	}
// }

// throw = 意図的に例外を発生させる

// public class Chapter08{
// 	public static void main(String[] args) {
// 		try {
// 			// divisionメソッド呼び出し
// 			Exception.division(100, 0);
// 			// 例外クラス不一致
// 		} catch(ArithmeticException e) {
// 			System.out.println("IllegalArgumentException例外が発生");
// 		} catch (IllegalArgumentException e) {
// 			System.out.println("IllegalArgumentException例外が発生");
// 			// キャッチした例外インスタンスをスロー
// 			throw e;
// 		}
// 		// finallyではない為処理されない
// 		System.out.println("プログラム終了");
// 	}
// 	public static void division(int a, int b) {
// 		System.out.println(a + "÷" + b + "は？");
// 		if(b == 0) {
// 			// 割り算で例外が発生するので意図的に例外を発生（スロー）させる
// 			throw new IllegalArgumentException("引数が不正です");
// 		}
// 		int result = a / b;
// 		System.out.println("計算結果" + result);
// 	}
// }

// 修飾子 戻り値の型 メソッド名(引数) throws 例外クラスの型 {
//     // 処理
//     return 戻り値;
// }

// import java.io.FileNotFoundException;
// import java.io.FileReader;

// public class Chapter08{
// 	public static void main(String[] args) {
// 		try {
// 			Exception.readFile("exception.txt");
// 		} catch(FileNotFoundException e) {
// 			System.out.println("FileNotFoundException例外発生");
// 		}
// 		System.out.println("プログラム終了");
// 	}
// 	public static void readFile(String fileName) throws FileNotFoundException {
// 		System.out.println("ファイルの読み込み開始");
// 		FileReader fr = new FileReader(fileName);
// 		System.out.println(fileName + "の読み込み完了");
// 	}
// }



package practice;

import java.sql.SQLException;

public class Chapter08 {
	public static void main(String[] args) {
		try {
			int array[] = { 1, 3, 5 };
			Chapter8.validIndex(array, 2);
			Chapter8.validIndex(array, 3);

			System.out.println("validIndexの呼び出し終了");
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentExceptionが発生しました");
			e.printStackTrace();
		}

		// try-catch文を記述
		// ・throwSQLExceptionメソッドを呼び出し
		// ・SQLExceptionをキャッチして、メッセージとスタックトレースを出力
		// ・"throwSQLExceptionの呼び出し終了"のメッセージを出力
		try {
			Chapter08.throwSQLException();
		} catch() {
			System.out.println("SQLExceptionが発生しました");
			e.printStackTrace();
		} finally {
			System.out.println("throwSQLExceptionの呼び出し終了");
		}
		System.out.println("mainメソッド終了");
	}

	// validIndexメソッドを作成
	// ・indexがarrayのサイズの範囲内なら、インデックスの要素を出力
	// ・サイズの範囲外なら、IllegalArgumentExceptionをスロー

	public static void validIndex(int[] array, int index) {
		if(array.length <= index) {
			throw new IllegalArgumentException(index + "はサイズの範囲外です");
		}
		System.out.println("インデックス" + index + "の要素は" + array[index] + "です");
	}
	public static void throwSQLException() throws SQLException {
		throw new SQLException("SQLエラーです");
	}
}