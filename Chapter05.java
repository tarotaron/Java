public class Chapter05 {
	public static void main(String[] args) {
		int number = 1;

	//while=trueの間繰り返し処理
		while (number < 50) {
			number *= 2;
			System.out.println("Chapter = " + number);
		}

	// do-while=falseでも一度は必ず処理
		do {
			ブロック(繰り返し)
		} while(条件式);

	//for=指定した回数処理を繰り返す
		for(初期化式 int number = 1; 条件式 number <= 5; 変化式 number++) {
			System.out.println("For01 = " + number);
		}

	//拡張for=全要素に対しての繰り返し
		int[] array = {1, 2, 3, 4, 5};
		for(型 int 変数名 number : 配列の変数名 array) {
			System.out.println("For02 = " + number);
		}

	//break=処理を中断させる
		for(int count == 0; count < 5; count++) {
			if(count == 2) {
				break;
			}
			System.out.println("Break01 = " + count);
		}

	//continue=スキップして次の処理に
		for(int count = 0; count < 5; count++) {
			if(count == 2) {
				continue;
			}
			System.out.println("Continue01 =" + count);
		}

		int num = 1;
		while (num < 5) {
			System.out.println(num * num);
			num++;
		}

		int[] arr = {1, 2, 3, 4};
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		for(int num : arr) {
			if(num % 2 == 0)
				continue;
		}
		System.out.println(num);
	}
}