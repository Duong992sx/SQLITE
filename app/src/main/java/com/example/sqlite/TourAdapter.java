package com.example.sqlite;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class TourAdapter extends BaseAdapter {
    Context context;
    int Layout;
    ArrayList<Tour> listTour;

    public TourAdapter(Context context, int layout, ArrayList<Tour> listTour) {
        this.context = context;
        Layout = layout;
        this.listTour = listTour;
    }

    @Override
    public int getCount() {
        return listTour.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder {
        TextView TourName, gia;
        ImageView AnhTour;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(Layout, null);

            viewHolder.TourName = convertView.findViewById(R.id.TourName);
            viewHolder.AnhTour = convertView.findViewById(R.id.imageView_flag);
            viewHolder.gia = convertView.findViewById(R.id.fee);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.TourName.setText(listTour.get(position).TourName);
        viewHolder.AnhTour.setImageResource(listTour.get(position).hinhanh);
      //  viewHolder.gia.setText(listTour.get(position).Gia);



        return convertView;
    }
}
