package com.kokhouser.simplifieddrawer.library;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.widget.ListView;

/**
 * Created by HZKok on 2/7/2014.
 */

public class DrawerActivity extends ActionBarActivity {

    protected DrawerLayout mDrawerLayout;
    protected ListView leftDrawerList;
    protected ListView rightDrawerList;
    protected ActionBarDrawerToggle mDrawerToggle;

    public DrawerLayout getmDrawerLayout() {
        return mDrawerLayout;
    }

    public void setmDrawerLayout(DrawerLayout mDrawerLayout) {
        this.mDrawerLayout = mDrawerLayout;
    }

    public ListView getLeftDrawerList() {
        return  leftDrawerList;
    }

    public void setLeftDrawerList(ListView mDrawerList) {
        this. leftDrawerList = mDrawerList;
    }

    public ActionBarDrawerToggle getmDrawerToggle() {
        return mDrawerToggle;
    }

    public void setmDrawerToggle(ActionBarDrawerToggle mDrawerToggle) {
        this.mDrawerToggle = mDrawerToggle;
    }

    public void setRightDrawerList(ListView rightDrawerList) {
        this.rightDrawerList = rightDrawerList;
    }

    public ListView getRightDrawerList() {
        return rightDrawerList;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mDrawerToggle != null) {
            if (mDrawerToggle.onOptionsItemSelected(item)) {
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
        if(mDrawerToggle!=null){
            mDrawerToggle.syncState();
        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        // Pass any configuration change to the drawer toggles
        if (mDrawerToggle != null) {
            mDrawerToggle.onConfigurationChanged(newConfig);
        }
    }

}
