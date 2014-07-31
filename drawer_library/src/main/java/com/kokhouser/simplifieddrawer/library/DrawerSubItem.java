package com.kokhouser.simplifieddrawer.library;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

/**
 * Created by HZKok on 25/7/2014.
 */

public class DrawerSubItem implements Item {

    private String itemName;

    public DrawerSubItem(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public int getViewType() {
        return DrawerAdapter.RowType.LIST_SUBITEM.ordinal();
    }

    @Override
    public View getView(LayoutInflater inflater, View convertView) {

        if (convertView == null) {
            // No views to reuse, need to inflate a new view
            convertView = (View) inflater.inflate(R.layout.drawer_subitem_layout, null);
        }
        TextView text = (TextView) convertView.findViewById(R.id.textView);
        text.setText(itemName);

        return convertView;
    }
}
