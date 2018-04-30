package pace.cs3892018team5.dev.chinesefortuneaide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.io.FileNotFoundException;

/**
 * Created by AmirEraiba on 3/27/18.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNoOfTabs;


    public PagerAdapter(FragmentManager fm, int NumberOfTabs) {

        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }


        @Override
         public Fragment getItem(int position) {
            switch(position)
            {
                case 0:
                    ProfileFragment pf = new ProfileFragment();
                    return pf;
                case 1:
                    Tab2 tab2 = new Tab2();
                    return tab2;

                case 2:
                    Tab3 tab3 = new Tab3();
                    return tab3;

                case 3:
                    Tab4 tab4 = new Tab4();
                    return tab4;

                case 4:
                    Tab5 tab5 = new Tab5();
                    return tab5;

                    default:
                    return null;
        }



    }
    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}
