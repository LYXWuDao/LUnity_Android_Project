package com.LUnity.game.LUtils;

import java.io.InputStream;
import android.util.Log;
import com.unity3d.player.UnityPlayer;

public class LUnityUtils {

	/***
	 * 
	 * �õ��ļ����ֽ�����
	 * 
	 * @param path
	 *            �ļ�·��
	 * @return �ļ����ֽ�����
	 */
	public static byte[] getFileBytes(String filePath) {
		if (filePath.isEmpty()) {
			Log.e("Unity_Android", "��ȡ�ļ��ֽ��������·��Ϊ�� filePath = string.Empty()");
			return null;
		}
		try {
			InputStream myInput = UnityPlayer.currentActivity.getAssets().open(
					filePath);
			byte[] buffer = new byte[myInput.available()];
			myInput.read(buffer);
			return buffer;
		} catch (Exception e) {
			Log.e("Unity_Android", "in app: �ļ�������߲�����!! filePath =" + filePath);
			Log.e("Unity_Android", "in app: �ļ�������߲�����!! filePath =" + e.getMessage());
			return null;
		}
	}

}
