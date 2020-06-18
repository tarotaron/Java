Enum(定数を列挙する際に使用)一つ一つ数えて並べる

public static final String APPLE = "リンゴ";
public static final String ICE_CREAM = "アイスクリーム";
public static final String CAKE = "ケーキ";

public enum Dessert
classの代わりにenumにするだけ

public enum Dessert {
	//カンマで区切る
	APPLE, ICE_CREAM, CAKE
}

System.out.println(Dessert.APPLE);
System.out.println(Dessert.ICE_CREAM);
System.out.println(Dessert.CAKE);

Dessert apple = Dessert.APPLE;
Dessert icecream = Dessert.ICE_CREAM;
Dessert cake = Dessert.CAKE;

static void printDessertName(Dessert dessert) {
	System.out.println(dessert);
}

printDessertName(Dessert.APPLE);

列挙型を使用する事で意味の異なる別の引数を渡すことを防ぎやすくなります。
クラスとは違いインスタンスを生成する事ができない。

Dessert x = Dessert.APPLE;
Dessert y = Dessert.APPLE;
System.out.println(x == y);// trueを返す
System.out.println(x.equals(y));// trueを返す

Dessert.APPLEはstatic finalで宣言される
どこから参照しても同じインスタンスとなるため＝＝で比較しtrueを返す

列挙型メソッド
name() 列挙した定数名そのものをString型で返す
System.out.println(Dessert.APPLE.name());

valueOF(String name) name()とは逆にString型の名称から列挙型のインスタンスを取得した場合はvalueOf()
Dessert apple = Dessert.valueOf("APPLE");
System.out.println(apple);

ordinal() 列挙した順序をint型で返す
public enum Dessert {
	APPLE, ICE_CREAM, CAKE
}

System.out.println(Dessert.APPLE.ordinal()); //0
System.out.println(Dessert.ICE_CREAM.ordinal()); //1
System.out.println(Dessert.CAKE.ordinal()); //2



値の追加
public enum Dessert {
	APPLE(100), ICE_CREAM(200), CAKE(300);

	private int price;

	private Dessert(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
}

System.out.println(Dessert.APPLE.getPrice()); //100
System.out.println(Dessert.ICE_CREAM.getPrice()); //200
System.out.println(Dessert.CAKE.getPrice()); //300

public class Dessert {
	public static final Dessert APPLE     = new Dessert(100);
	public static final Dessert ICE_CREAM = new Dessert(200);
	public static final Dessert CAKE      = new Dessert(300);
}

メソッドの追加 インスタンスごとにメソッドを追記することができる。抽象メソッドを用意し、各インスタンスでそれを継承するとインスタンスごとに実行したいコードの内容を変えることができる。

public enum Dessert {
	APPLE(100) {
		void advertise() {
			System.out.println("真っ赤なリンゴが" + getPrice() + "円！");
		}
	},
	ICE_CREAM(200) {
		void advertise() {
			System.out.println("夏にぴったりアイスクリームが" getPrice() "円！");
		}
	}
	;
	public int price;

	private Dessert(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	abstract void advertise();
}

Dessert.APPLE.advertise(); // 「まっかなりんごが100円！」
Dessert.ICE_CREAM.advertise(); // 「夏にぴったりアイスクリームが200円！」