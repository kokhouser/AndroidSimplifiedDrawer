package com.kokhouser.simplifieddrawer.library;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by HZKok on 7/7/2014.
 */

public class DrawerAdapter extends ArrayAdapter<Item> {
    private List<Item> items;
    private LayoutInflater inflater;

    public enum RowType {
        // Here we have two items types, you can have as many as you like though
        LIST_ITEM, PROFILE_ITEM, LIST_SUBITEM
    }

    public DrawerAdapter(Context context, LayoutInflater inflater, List<Item> items) {
        super(context, 0, items);
        this.items = items;
        this.inflater = inflater;
    }

    @Override
    public int getViewTypeCount() {
        // Get the number of items in the enum
        return RowType.values().length;

    }

    @Override
    public int getItemViewType(int position) {
        // Use getViewType from the Item interface
        return items.get(position).getViewType();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Use getView from the Item interface
        return items.get(position).getView(inflater, convertView);
    }
}