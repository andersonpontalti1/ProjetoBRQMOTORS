package br.com.brq.ecc.brqmotors;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager= findViewById(R.id.viewPager);

        IntroAdapter adapter= new IntroAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);







    }
}
