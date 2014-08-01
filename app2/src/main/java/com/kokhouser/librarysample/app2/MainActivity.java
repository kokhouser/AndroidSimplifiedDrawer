package com.kokhouser.librarysample.app2;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.kokhouser.simplifieddrawer.library.DrawerActivity;
import com.kokhouser.simplifieddrawer.library.DrawerManager;


public class MainActivity extends DrawerActivity {

    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toast = Toast.makeText(getApplicationContext(), null, Toast.LENGTH_SHORT);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        leftDrawerList = (ListView) findViewById(R.id.left_drawer);
        rightDrawerList = (ListView) findViewById(R.id.right_drawer);
        final String[] itemNames = new String[]{"Home", "Favourites", "Settings"};
        int[] iconNames = new int[]{R.drawable.dashboard_icon, R.drawable.favourite, R.drawable.settings_icon };
        class DrawerItemListener implements ListView.OnItemClickListener{
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    //Add outcomes of pressing nav drawer items
                    case 0:
                        toast.setText("Tapped on " + itemNames[0]);
                        toast.show();
                        break;
                    case 1:
                        toast.setText("Tapped on " + itemNames[1]);
                        toast.show();
                        break;
                    case 2:
                        toast.setText("Tapped on " + itemNames[2]);
                        toast.show();
                        break;

                }
            }
        }
        DrawerManager drawerManager = new DrawerManager();
        drawerManager.setlDrawerTitle("Navigation");
        drawerManager.setrDrawerTitle("Notifications");
        drawerManager.setMenuTitles(itemNames);
        drawerManager.setMenuIcons(iconNames);
        drawerManager.initializeLeftDrawer(this, new DrawerItemListener());
    }
}
