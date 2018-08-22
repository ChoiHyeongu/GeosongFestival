package choi.org.songpatechfestival;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class BoothListAdapter extends BaseAdapter{

    Context context;
    ArrayList<BoothItem> boothItemArrayList;

    ImageView boothImage;
    TextView bootName;
    TextView boothEvent;

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
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_booth, null);

            boothImage = (ImageView) convertView.findViewById(R.id.boothItem_boothImage);
            bootName = (TextView) convertView.findViewById(R.id.boothItem_boothName);
            boothEvent = (TextView) convertView.findViewById(R.id.boothItem_boothEvent);
        }

        boothImage.setImageResource(boothItemArrayList.get(position).getBoothImage());
        bootName.setText(boothItemArrayList.get(position).getBoothName());
        boothEvent.setText(boothItemArrayList.get(position).getBoothEvent());

        return convertView;
    }
}
