package jp.mixi.practice.messagingandnotification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * @author mukai_masaki on 2015/07/25.
 *         Copyright: CYBER AGNET. INC
 */
public class Receiver extends BroadcastReceiver {
	private static final String TAG = Receiver.class.getSimpleName();

	@Override
	public void onReceive(Context context, Intent intent) {
		Log.v(TAG, intent.getAction());
	}
}
