package jp.mixi.practice.messagingandnotification;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;

/**
 * Created by suino on 2015/02/26.
 */
public class NotificationActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

//        Intent intent = new Intent(this, );
//        intent.

        // TODO ここで通知を表示する
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        Notification noti = builder
                .setWhen(System.currentTimeMillis())
                .setContentTitle("タイトル")
                .setContentText("内容")
                .setSmallIcon(R.drawable.ic_launcher)
                .setTicker("通知だよ")
                .setOnlyAlertOnce(true)
                .setAutoCancel(true)
                .build();
        NotificationManager manager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        manager.notify(0, noti);
    }
}
