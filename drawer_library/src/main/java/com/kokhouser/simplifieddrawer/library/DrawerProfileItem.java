package com.kokhouser.simplifieddrawer.library;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by HZKok on 7/7/2014.
 */

public class DrawerProfileItem implements Item {
    private final String itemName;
    private Bitmap profilePic;

    public DrawerProfileItem(String itemName) {
        this.itemName = itemName;
        this.profilePic = null;
    }

    public DrawerProfileItem(String text1, Bitmap profilePic) {
        this.itemName = text1;
        this.profilePic = profilePic;
    }

    @Override
    public int getViewType() {
        return DrawerAdapter.RowType.PROFILE_ITEM.ordinal();
    }

    @Override
    public View getView(LayoutInflater inflater, View convertView) {
        if (convertView == null) {
            convertView = (View) inflater.inflate(R.layout.drawer_profile_item_layout, null);
        }

        TextView text1 = (TextView) convertView.findViewById(R.id.textView);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);
        text1.setText(itemName);
        if (profilePic != null) {
            imageView.setImageBitmap(profilePic);
        }

        return convertView;
    }

}
