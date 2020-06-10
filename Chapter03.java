// インクリメント a = a + 1
// a++ ++a
// デメクリメント a= a - 1
// a-- --a

// 代入演算子
// =
// a = b
// +=
// a = a + b
// -=
// *=
// /=
// %=

// 関係演算子
// <
// <=
// >
// >=
// ==
// !=

// 論理演算子
// && and
// || or
// ! not

// 文字列連結
// +

public class Chapter03{
	public static void main(String[] args) {
		int val = 2 + 5;
		System.out.println(val);
		val++;
		System.out.println(val);
		val *= 5;
		System.out.println(val);
		boolean bool;
		bool = (val == 50);
		System.out.println(bool);
		bool = (val < 50) && (val % 10 == 0);
		System.out.println(bool);
	}
}