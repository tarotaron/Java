package practice;

public class Chapter12 {
	public static void main(String[] args) {
		int a = 976;
		int b = 427;
		System.out.println(a + "と" + b "の最大公約数は、" + gcd(a, b) + "です。");
	}

	static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
}
1回目 a=976 b=427 if文=false 再帰呼び出し
2回目 a=427 b=122 if分=false 再帰呼び出し
3回目 a=122 b=61 if分=false 再帰呼び出し
4回目 a=61 b=0 if分=true 再帰処理を終了


