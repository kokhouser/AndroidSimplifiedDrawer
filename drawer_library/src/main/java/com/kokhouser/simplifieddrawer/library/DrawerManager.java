package com.kokhouser.simplifieddrawer.library;

import android.content.res.TypedArray;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HZKok on 2/7/2014.
 */

public class DrawerManager {
    private CharSequence lDrawerTitle;
    private CharSequence mTitle;
    private CharSequence rDrawerTitle;

    public void initializeLeftDrawer(final DrawerActivity root, ListView.OnItemClickListener mClickListener){
        mTitle = root.getTitle();
        String[] menuTitles = root.getResources().getStringArray(R.array.drawer_titles);
        String[] workspaceSubItems = root.getResources().getStringArray(R.array.workspace_subitems);
        String[] exploreSubItems = root.getResources().getStringArray(R.array.explore_subitems);
        TypedArray menuIcons = root.getResources().obtainTypedArray(R.array.icons);
        lDrawerTitle = root.getResources().getString(R.string.action_bar_title);
        rDrawerTitle = root.getString(R.string.action_bar_right_title);
        List<Item> items = new ArrayList<Item>();
        LayoutInflater inflater = LayoutInflater.from(root);
        //Dummy data
        items.add(new DrawerProfileItem("Hao Zhe"));
        for (int i = 0; i <menuTitles.length; i++) {
            items.add(new DrawerItem(menuTitles[i], menuIcons.getResourceId(i, -1)));
            if (menuTitles[i].equals("Workspace")){
                for (int j = 0; j < workspaceSubItems.length; j++){
                    items.add(new DrawerSubItem(workspaceSubItems[j]));
                }
            }
            else if (menuTitles[i].equals("Explore")){
                for (int j = 0; j < exploreSubItems.length; j++){
                    items.add(new DrawerSubItem(exploreSubItems[j]));
                }
            }
        }
        root.setmDrawerLayout((DrawerLayout) root.findViewById(R.id.drawer_layout));
        root.setLeftDrawerList((ListView) root.findViewById(R.id.left_drawer));
        root.setRightDrawerList((ListView) root.findViewById(R.id.right_drawer));
        DrawerAdapter adapter = new DrawerAdapter(root, inflater,items);
        root.getLeftDrawerList().setAdapter(adapter);
        root.getLeftDrawerList().setOnItemClickListener(mClickListener);
        // enabling action bar app icon and behaving it as toggle button
        root.getActionBar().setDisplayHomeAsUpEnabled(true);
        root.getActionBar().setHomeButtonEnabled(true);
        root.setmDrawerToggle(new ActionBarDrawerToggle(root, root.getmDrawerLayout(),
                R.drawable.ic_drawer, R.string.app_name,R.string.app_name) {
            public void onDrawerClosed(View view) {
                root.getActionBar().setTitle(mTitle);
                // calling onPrepareOptionsMenu() to show action bar icons
                root.invalidateOptionsMenu();
            }

            public void onDrawerOpened(View drawerView) {
                if (root.getmDrawerLayout().isDrawerOpen(root.getLeftDrawerList())) {
                    root.getActionBar().setTitle(lDrawerTitle);
                }
                // calling onPrepareOptionsMenu() to hide action bar icons
                else {
                    root.getActionBar().setTitle(rDrawerTitle);
                }
                root.invalidateOptionsMenu();
            }
        });
        root.getmDrawerLayout().setDrawerListener(root.getmDrawerToggle());
        //Drawer end
    }
}
