package extend.animal;

public abstract class Animal {
	protected String name;

	public void eat() {
		System.out.println(name + "が食事をしました！");
	}
	// サブクラスごとに違う処理は、抽象メソッドにしてサブクラスに実装させる。
	// 上書きして実装されていないコンパイルエラーになる
	public abstract void cry();
}