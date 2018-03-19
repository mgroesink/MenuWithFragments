package nl.rocvantwente.rsk01.menuwithfragments;

import android.app.FragmentManager;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
            fm.beginTransaction().replace(R.id.fragmentMenu, new MenuFragment()).commit();
            fm.beginTransaction().replace(R.id.fragmentContent, new PurpleFragment()).commit();

    }
}
