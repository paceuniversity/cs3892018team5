package pace.cs3892018team5.dev.chinesefortuneaide;

import android.graphics.Color;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.TableLayout;

public class Main_Screen extends AppCompatActivity implements  Tab1.OnFragmentInteractionListener,Tab2.OnFragmentInteractionListener,Tab3.OnFragmentInteractionListener, Tab4.OnFragmentInteractionListener, Tab5.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__screen);


        TabLayout tabLayout = (TabLayout)findViewById(R.id.tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("MainScreen"));
        tabLayout.addTab(tabLayout.newTab().setText("Fortune"));
        tabLayout.addTab(tabLayout.newTab().setText("Words"));
        tabLayout.addTab(tabLayout.newTab().setText("Facts"));
        tabLayout.addTab(tabLayout.newTab().setText("Quiz"));


        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager)findViewById(R.id.pager);
        final PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }

        });


    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.m_setting,menu);
        return true;
    }
}
