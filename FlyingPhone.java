package practice;

import extend.phone.Phone;

public class FlyingPhone implements Phone, Flying {
	private int time;

	public FlyingPhone(int time) {
		this.time = time;
	}

	public void fly() {
		System.out.println(this.time + "分間、飛び続けます。");
	}

	public void call(String number) {
		System.out.println(number + "に電話します。通話できるのは飛んでいる間だけです。");
	}

	public void powerOff() {
		// Phone,Flyingどちらにもdefaultがある為Flyingをsuperで指定
		Flying.super.powerOff();
	}
}