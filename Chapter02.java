// ・プリミティブ型(数字やdデータのみそのものを保持)
// long(大きい数字を使う場合 数字の最後にLをつける),int,short,byte,double,float(最後にf、Fをつける),boolean,char(''シングルコーテーションで囲む)
// ・参照型(データそのものではなく、参照先を保持)
// String(""ダブルコーテーションで囲む)
// ラッパークラス(プリミティブ型を参照型で使用 オートボクシング=プリミティブ型からラッパークラスに変換 アンボクシング=ラッパークラスからプリミティブ型に変換)
// 配列(同じ型の複数のデータを持つ一つの変数を扱える index番号は0からスタート)
// int[] array1 = new int[3];
// int array2[] = null;//[]は変数名の後ろでも可
// array1[0] = 60;
// array1[2] = 20;
// array1[1] = 20;
// int int2 = array1[2];

// int[] array3 = new int[] {10, 20, 50};
// int[] array4 = {10, 20, 50};//new int[]はなくても良い

// nullとは
// 参照型変数の中身が何もないことを表現する値 参照先を保持していない状態

// public class Chapter02{
// 	public static void main(String[] args) {
// 		String string1;
// 		string1 = "あいう";
// 		System.out.println(string1 + "の文字数：" + string1.length());
// 		string1 = "";
// 		System.out.println(string1 + "の文字数：" + string1.length());
// 		string1 = null;//コンパイルエラーにはならずにNullPointerExceptionというエラーが出力される
// 		System.out.println(string1 + "の文字数：" + string1.length());
// 	}
// }

public class Chapter02{
	public static void main(String[] args) {
		long l = 1234456789L;
		System.out.println(l);
		double d = 1223454.34;
		System.out.println(d);
		boolean b = true;
		System.out.println(b);
		Float f = 123.5f;
		System.out.println(f);
		Integer i = 2345;
		System.out.println(i);
		Character c = 'i';
		System.out.println(c);
		int[] array = {10,20,30,40,60};
		System.out.println(array[3]);
	}
}