package com.kokhouser.simplifieddrawer.library;

import android.support.v4.app.ActionBarDrawerToggle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HZKok on 2/7/2014.
 */

public class DrawerManager {
    private CharSequence lDrawerTitle; //Left Drawer Title
    private CharSequence rDrawerTitle; //Right Drawer Title
    private CharSequence mTitle; //Action Bar Title when both drawers are closed
    private String [] menuTitles; //Array of names of entries in drawer
    private int[] menuIcons; // Array of entry icons drawable resources

    public CharSequence getlDrawerTitle() {
        return lDrawerTitle;
    }

    public void setlDrawerTitle(CharSequence lDrawerTitle) {
        this.lDrawerTitle = lDrawerTitle;
    }

    public CharSequence getmTitle() {
        return mTitle;
    }

    public void setmTitle(CharSequence mTitle) {
        this.mTitle = mTitle;
    }

    public CharSequence getrDrawerTitle() {
        return rDrawerTitle;
    }

    public void setrDrawerTitle(CharSequence rDrawerTitle) {
        this.rDrawerTitle = rDrawerTitle;
    }

    public String[] getMenuTitles() {
        return menuTitles;
    }

    public void setMenuTitles(String[] menuTitles) {
        this.menuTitles = menuTitles;
    }

    public int[] getMenuIcons() {
        return menuIcons;
    }

    public void setMenuIcons(int[] menuIcons) {
        this.menuIcons = menuIcons;
    }

    public void initializeLeftDrawer(final DrawerActivity root, ListView.OnItemClickListener LeftClickListener){
        if (mTitle == null){
            mTitle = root.getTitle();
        }
        List<Item> items = new ArrayList<Item>();
        LayoutInflater inflater = LayoutInflater.from(root);
        //Dummy data
        if (menuTitles != null && menuIcons != null) {
            for (int i = 0; i < menuTitles.length; i++) {
                items.add(new DrawerItem(menuTitles[i], menuIcons[i]));
            }
        }
        DrawerAdapter adapter = new DrawerAdapter(root, inflater,items);
        root.getLeftDrawerList().setAdapter(adapter);
        root.getLeftDrawerList().setOnItemClickListener(LeftClickListener);
        // enabling action bar app icon and behaving it as toggle button
        root.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        root.getSupportActionBar().setHomeButtonEnabled(true);
        root.setmDrawerToggle(new ActionBarDrawerToggle(root, root.getmDrawerLayout(),
                R.drawable.ic_drawer, R.string.app_name,R.string.app_name) {
            public void onDrawerClosed(View view) {
                root.getSupportActionBar().setTitle(mTitle);
                // calling onPrepareOptionsMenu() to show action bar icons
                root.invalidateOptionsMenu();
            }

            public void onDrawerOpened(View drawerView) {
                if (root.getmDrawerLayout().isDrawerOpen(root.getLeftDrawerList())) {
                    try {
                        root.getSupportActionBar().setTitle(lDrawerTitle);
                    } catch (Exception e){
                        e.printStackTrace();
                    }
                }
                // calling onPrepareOptionsMenu() to hide action bar icons
                else {
                    try {
                        root.getSupportActionBar().setTitle(rDrawerTitle);
                    } catch (Exception e){
                        e.printStackTrace();
                    }
                }
                root.invalidateOptionsMenu();
            }
        });
        root.getmDrawerLayout().setDrawerListener(root.getmDrawerToggle());
        //Drawer end
    }
}
