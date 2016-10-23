package closet.emirim.hs.packagekr.closet_1;

import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import static android.R.attr.colorAccent;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private FragmentPagerAdapter mPagerAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create the adapter that will return a fragment for each section
        mPagerAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            private final Fragment[] mFragments = new Fragment[] {
                    new HomeFragment(),
                    new TemaFragment(),
                    new ClosetFragment(),
                    new MakeupFragment(),
            };
            private final String[] mFragmentNames = new String[] {
                    "홈","테마별","옷장","화장대"
                    //getString(R.string.heading_recent),
                    //getString(R.string.heading_my_posts),
                    //getString(R.string.heading_my_top_posts)
            };
            @Override
            public Fragment getItem(int position) {
                return mFragments[position];
            }
            @Override
            public int getCount() {
                return mFragments.length;
            }
            @Override
            public CharSequence getPageTitle(int position) {
                return mFragmentNames[position];
            }
        };
        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mPagerAdapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setBackgroundColor(Color.WHITE);
        tabLayout.setupWithViewPager(mViewPager);
        //tabLayout.setTextAlignment();
        //tabLayout.setTextDirection();
      //  tabLayout.setTabTextColors(Color.BLACK,colorAccent); //선택했을때 색깔


        // Button launches NewPostActivity
//        findViewById(R.id.fab_new_post).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, NewPostActivity.class));
//            }
//        });

        //S.picasso.setIndicatorsEnabled(true);
    }

   // @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_tab_layout_demo, menu);
//        return true;
//    }

    //@Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        int i = item.getItemId();
//        if (i == R.id.action_logout) {
//            FirebaseAuth.getInstance().signOut();
//            startActivity(new Intent(this, SignInActivity.class));
//            finish();
//            return true;
//        } else if(i==R.id.action_settings)
//        {
//            startActivity(new Intent(this,SettingActivity.class));
//            return true;
//        }
//        else {
//            return super.onOptionsItemSelected(item);
//        }
//
//    }

}
