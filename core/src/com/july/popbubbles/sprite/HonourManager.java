package com.july.popbubbles.sprite;

import com.july.popbubbles.Assets;
import com.july.popbubbles.Constants;
import com.july.popbubbles.MusicManager;

public class HonourManager {
	public static HonourManager manager = new HonourManager();

	private HonourManager() {

	}

	/**
	 * 显示Honour称号
	 * 
	 * @param num
	 *            表示消除的豆豆个数
	 */
	public void show(int num) {
		if (num < 5)
			return;
		else if (num < 7) {
			Assets.instance.honours[Constants.HONOUR_GOOD].show();
			MusicManager.manager.playSound(MusicManager.GOOD);
		} else if (num < 9) {
			Assets.instance.honours[Constants.HONOUR_COOL].show();
			MusicManager.manager.playSound(MusicManager.COOL);
		} else if (num < 12) {
			Assets.instance.honours[Constants.HONOUR_GREAT].show();
			MusicManager.manager.playSound(MusicManager.GREAT);
		} else {
			Assets.instance.honours[Constants.HONOUR_AMAZING].show();
			MusicManager.manager.playSound(MusicManager.GREAT);
		}
	}
}
