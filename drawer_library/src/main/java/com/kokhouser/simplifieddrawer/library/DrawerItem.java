package com.kokhouser.simplifieddrawer.library;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by HZKok on 7/7/2014.
 */

public class DrawerItem implements Item {
    private final String name;
    private int icon;

    public DrawerItem(String name, int icon) {
        this.name = name;
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    @Override
    public int getViewType() {
        return DrawerAdapter.RowType.LIST_ITEM.ordinal();
    }

    @Override
    public View getView(LayoutInflater inflater, View convertView) {
        if (convertView == null) {
            // No views to reuse, need to inflate a new view
            convertView = inflater.inflate(R.layout.drawer_item_layout, null);
        }

        TextView text = (TextView) convertView.findViewById(R.id.textView);
        text.setText(name);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);
        imageView.setImageResource(icon);

        return convertView;
    }

}
