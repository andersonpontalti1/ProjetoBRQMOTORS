package br.com.brq.ecc.brqmotors;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.viewpager.widget.ViewPager;
public class OnboardingActivity extends AppCompatActivity {
    View dotsindcator1;
    View dotsindcator2;
    View dotsindcator3;
    ViewPager viewPager;
    AppCompatImageButton next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);
        viewPager = findViewById(R.id.viewPager);
        dotsindcator1 = findViewById(R.id.view1);
        dotsindcator2 = findViewById(R.id.view2);
        dotsindcator3 = findViewById(R.id.view3);

        IntroAdapter adapter = new IntroAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        next = findViewById(R.id.slideOneNext);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int currentItem = viewPager.getCurrentItem();
                if (currentItem < viewPager.getAdapter().getCount()) {
                    viewPager.setCurrentItem(currentItem + 1);
                }
            }
        });
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }
            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        dotsindcator1.setBackgroundResource(R.drawable.dots_indicator_sim);
                        dotsindcator2.setBackgroundResource(R.drawable.dots_indicator_nao);
                        dotsindcator3.setBackgroundResource(R.drawable.dots_indicator_nao);
                        break;
                    case 1:
                        dotsindcator1.setBackgroundResource(R.drawable.dots_indicator_nao);
                        dotsindcator2.setBackgroundResource(R.drawable.dots_indicator_sim);
                        dotsindcator3.setBackgroundResource(R.drawable.dots_indicator_nao);
                        break;
                    case 2:
                        dotsindcator1.setBackgroundResource(R.drawable.dots_indicator_nao);
                        dotsindcator2.setBackgroundResource(R.drawable.dots_indicator_nao);
                        dotsindcator3.setBackgroundResource(R.drawable.dots_indicator_sim);
                        break;
                }
            }
            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
    }
}