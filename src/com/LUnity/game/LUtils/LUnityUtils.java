package com.LUnity.game.LUtils;

import java.io.InputStream;
import android.util.Log;
import com.unity3d.player.UnityPlayer;

public class LUnityUtils {

	/***
	 * 
	 * 得到文件的字节数组
	 * 
	 * @param path
	 *            文件路径
	 * @return 文件的字节数组
	 */
	public static byte[] getFileBytes(String filePath) {
		if (filePath.isEmpty()) {
			Log.e("Unity_Android", "获取文件字节流数组的路径为空 filePath = string.Empty()");
			return null;
		}
		try {
			InputStream myInput = UnityPlayer.currentActivity.getAssets().open(
					filePath);
			byte[] buffer = new byte[myInput.available()];
			myInput.read(buffer);
			return buffer;
		} catch (Exception e) {
			Log.e("Unity_Android", "in app: 文件错误或者不存在!! filePath =" + filePath);
			Log.e("Unity_Android", "in app: 文件错误或者不存在!! filePath =" + e.getMessage());
			return null;
		}
	}

}
