package main;

import entity.Clock;
import entity.DayTimeLife;
import entity.MorningActivity;

public class SpendLife {

	public static void main(String[] args) {

		System.out.println("****************************************************");
		System.out.println("4月1日の生活が始まります。");

		//目覚ましを鳴らす
		Clock clock = new Clock();
		clock.ringAlarm();

		//着替える
		MorningActivity morningActivity = new MorningActivity();
		morningActivity.putOn("ヨレヨレのYシャツ", "ジーンズ", "クロックス");

		//朝食を食べる
		morningActivity.eatBreakfast();

		//家を出る
		morningActivity.leaveHome();

		//仕事を行う
		DayTimeLife dayTimeLife = new DayTimeLife();
		dayTimeLife.doJob();

		System.out.println("4月1日の生活が終わります。");
		System.out.println("****************************************************");

		System.out.println("****************************************************");
		System.out.println("4月2日の生活が始まります。");

		//目覚ましを鳴らす
		clock.ringAlarm();

		//着替える
		morningActivity.putOn("ヨレヨレのYシャツ", "ジーンズ", "クロックス");

		//朝食を食べる
		morningActivity.eatBreakfast();

		//家を出る
		morningActivity.leaveHome();

		//仕事を行う
		dayTimeLife.doHikeMountains();

		System.out.println("4月2日の生活が終わります。");
		System.out.println("****************************************************");

		System.out.println("****************************************************");
		System.out.println("4月3日の生活が始まります。");

		//目覚ましを鳴らす
		clock.ringAlarm();

		//着替える
		morningActivity.putOn("ヨレヨレのYシャツ", "ジーンズ", "クロックス");

		//朝食を食べる
		morningActivity.eatBreakfast();

		//家を出る
		morningActivity.leaveHome();

		//仕事を行う
		dayTimeLife.doWalk();

		System.out.println("4月3日の生活が終わります。");
		System.out.println("****************************************************");

	}

}
