package jp.mixi.practice.sharedpreferences.sharedpreferencespractice1;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private SharedPreferences mPrivatePreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // privatePreferencesに値が存在すればその値を表示をしてください。
        SharedPreferences sharedPreferences = getSharedPreferences("privatePreferences", MODE_PRIVATE);
        String text = sharedPreferences.getString("name", null);
        if (text != null) {
            TextView textView = (TextView)findViewById(R.id.text);
            textView.setText(text);
        }
        final SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("name", "aiue");
        editor.commit();
        // privatePreferencesにString,int,boolean,long,floatで何らかの値を保存してください。

        Button clearButton = (Button) findViewById(R.id.clear);
        clearButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // 内容をクリアする処理を書いてください。
                editor.clear();
                editor.commit();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
