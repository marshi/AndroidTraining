package jp.mixi.assignment.messagingandnotification;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by suino on 2015/02/25.
 */
public class IntentActivity2 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_2);

        View button = findViewById(R.id.CallActivityForResult);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IntentActivity2.this, EditActivity.class);
                startActivityForResult(intent, 0);
                // TODO EditText と ボタンを 1 つずつ持つ新しい Activity を呼び出し、ボタンを押した時に結果を返すように実装する
                // TODO 返ってきた結果を Toast で表示するところも実装すること
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Toast.makeText(IntentActivity2.this, data.getStringExtra("res"), Toast.LENGTH_LONG).show();
    }
}
