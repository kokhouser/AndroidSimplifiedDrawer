package com.kokhouser.simplifieddrawer.library;

import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by HZKok on 7/7/2014.
 */

public interface Item {
    public int getViewType();
    public View getView(LayoutInflater inflater, View convertView);
}
