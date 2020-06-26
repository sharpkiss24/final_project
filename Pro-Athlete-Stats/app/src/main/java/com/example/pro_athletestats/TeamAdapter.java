package com.example.pro_athletestats;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;

import java.util.ArrayList;

public class TeamAdapter extends ArrayAdapter<TeamItem> {
    public TeamAdapter(Context context, ArrayList list) {
        super(context, 0, list);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.team_list_item, parent, false);
        TeamItem currentTeamItem = getItem(position);
        ImageView TeamItemImageView = convertView.findViewById(R.id.team_item_badge);
        TextView TeamItemTextView = convertView.findViewById(R.id.team_item_name);
       // Picasso.get().loadImageResource(currentTeamItem.getTeamBadge());
        TeamItemImageView.setImageResource(currentTeamItem.getTeamBadge());
        TeamItemTextView.setText(currentTeamItem.getName());
        return convertView;
    }
}
