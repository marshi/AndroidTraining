
package jp.mixi.assignment.controller.adv;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.Menu;

public class MainActivity extends FragmentActivity implements TitleFragment.OnFragmentInteractionListener, BodyFragment.OnFragmentInteractionListener {

    @Override
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.titleFragment, TitleFragment.newInstance("", "")).commit();
        fragmentManager.beginTransaction().replace(R.id.bodyFragment, BodyFragment.newInstance("", "")).commit();
        fragmentManager.beginTransaction().replace(R.id.buttonFragment, ButtonFragment.newInstance("", "")).commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

}
