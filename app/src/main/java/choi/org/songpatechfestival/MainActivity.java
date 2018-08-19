package choi.org.songpatechfestival;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    Fragment boothListFragment;
    Fragment scheduleFragment;
    Fragment informationFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boothListFragment = new BoothListFragment();
        scheduleFragment = new ScheduleListFragment();
        informationFragment = new InformationFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.main_container, scheduleFragment).commit();

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.main_bottomnavigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_schedule:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_container, scheduleFragment).commit();
                        break;

                    case R.id.action_boothList:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_container, boothListFragment).commit();
                        break;

                    case R.id.action_information:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_container, informationFragment).commit();
                        break;
                }
                return true;
            }
        });
    }
}
