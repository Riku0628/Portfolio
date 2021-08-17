package testApp;

import java.util.Scanner;

public class NumberHitS05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//正解数字の変数answerNumに5を代入
		int answerNum = 5;

		//ゲーム開始
		System.out.println("ゲーム開始(正解数字 : "+answerNum+")");

		while(true){
			//プレイヤーの予想数字の変数playerNumを代入
			System.out.println();
			System.out.print("  0から9までの予想の数字を入力>>");
			int playerNum = sc.nextInt();

			//999が入力されたときの判定
			if(playerNum == 999){
				System.out.println("   →999が入力されたためゲームを終了します。");
				break;

			}

			//範囲外の数字チェック
			if((0 > playerNum || playerNum > 9)){
				System.out.println("   →エラー！！0から9の数字ではありません。");
				continue;
			}

			//正解数字とプレイヤーの予想数字の判定
			if(answerNum > playerNum){
				System.out.println("   →正解数字は"+playerNum+"より大きいです。");

			}else if(answerNum < playerNum){
				System.out.println("   →正解数字は"+playerNum+"より小さいです。");

			}else{
				System.out.println("   →！！大当たり！！");
				break;
			}

		}

		//ゲーム終了
		System.out.println();
		System.out.println("ゲーム終了");

	}

}
