package choi.org.songpatechfestival;

import android.content.Context;
import android.media.Image;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class BoothListAdapter extends BaseAdapter {

    Context context;
    ArrayList<BoothItem> boothItemArrayList;

    class ViewHolder {
        ImageView boothImage;
        TextView circleName;
        TextView place;
        TextView boothName;
    }

    ViewHolder viewHolder;

    public BoothListAdapter(Context context, ArrayList<BoothItem> boothItemArrayList) {
        this.context = context;
        this.boothItemArrayList = boothItemArrayList;
    }

    @Override
    public int getCount() {
        return this.boothItemArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return boothItemArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            Log.d("convert == null", "Error");
            convertView = LayoutInflater.from(context).inflate(R.layout.item_booth, null);

            viewHolder = new ViewHolder();

            viewHolder.boothImage = (ImageView) convertView.findViewById(R.id.boothItem_boothImage);
            viewHolder.boothName = (TextView) convertView.findViewById(R.id.boothItem_boothName);
            viewHolder.circleName = (TextView) convertView.findViewById(R.id.boothItem_circleName);
            viewHolder.place = (TextView) convertView.findViewById(R.id.boothItem_place);
            convertView.setTag(viewHolder);
        } else {
            Log.d("convert != null", "Error");
            viewHolder = (ViewHolder)convertView.getTag();
        }

        viewHolder.boothImage.setImageResource(boothItemArrayList.get(position).getBoothImage());
        viewHolder.boothName.setText(boothItemArrayList.get(position).getBoothName());
        viewHolder.circleName.setText(boothItemArrayList.get(position).getCircleName());
        viewHolder.place.setText(boothItemArrayList.get(position).getPlace());

        return convertView;
    }
}
