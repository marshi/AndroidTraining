package jp.mixi.practice.resourcemanagement;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import java.util.Locale;

public class StringPractice1And2Activity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.string_practice1);
//        TextView view = (TextView)findViewById(R.id.text);
//        Locale.setDefault(Locale.JAPANESE);
        Configuration config = new Configuration();
        config.locale = Locale.JAPAN;
        Resources resources = getBaseContext().getResources();
        resources.updateConfiguration(config, null);
    }

}
