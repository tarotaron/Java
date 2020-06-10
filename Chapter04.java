public class Chapter04 {
	public static void main(String[] args) {
		int number = 7;
		if (number < 5) {
			System.out.println(number + "は５未満です");
		} else if(number < 10) {
			System.out.println(number + "は５以上、１０未満です");
		} else if(number < 15) {
			System.out.println(number + "10以上、１５未満");
		} else {
			System.out.println(number + "１５未満ではないです");
		}

		int val = 2;
		switch(val) {
			case 3:
			System.out.println("よくできました");
			break;//caseの分岐処理を終了する 記述がないと次のcaseを実行してしまう
		case 2:
			System.out.println("普通でした");
			break;
		default://caseが一致しなかったときの処理 何も行わない場合は記述しなくて良い
			System.out.println("がんばろう");
		}
		
		int lunchMoney = 1000;
		if(lunchMoney >= 800) {
			System.out.println("チャーシューメン");
		} else if(lunchMoney > 600){
			System.out.println("ラーメン");
		} else {
			System.out.println("食べられません");
		}
	}
}
