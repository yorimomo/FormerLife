package entity;

/**
 * 	目覚ましのエンティティクラスです。
 * @author PCUser
 *
 */
public class Clock {

	/**
	 * アラームを3回鳴らします。
	 */
	public void ringAlarm() {
		
		for (int i = 0; i < 3; i++) {
			System.out.println("目覚まし時計のアラームが鳴りました(" + (i + 1) + "回目)");
		}
	}
	
}
