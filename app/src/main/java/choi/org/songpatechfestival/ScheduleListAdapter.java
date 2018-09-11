package choi.org.songpatechfestival;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ScheduleListAdapter extends BaseAdapter {

    Context context;
    ArrayList<ScheduleItem> scheduleItemArrayList;

    class ViewHolder{
        TextView date;
        TextView event;
        TextView detail;
    }

    ViewHolder viewHolder;

    public ScheduleListAdapter(Context context, ArrayList<ScheduleItem> scheduleItemArrayList) {
        this.context = context;
        this.scheduleItemArrayList = scheduleItemArrayList;
    }

    @Override
    public int getCount() {
        return this.scheduleItemArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return scheduleItemArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_schedule, null);

            viewHolder = new ViewHolder();

            viewHolder.date = (TextView) convertView.findViewById(R.id.scheduleItem_date);
            viewHolder.event = (TextView) convertView.findViewById(R.id.scheduleItem_event);
            viewHolder.detail = (TextView) convertView.findViewById(R.id.scheduleItem_detail);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.date.setText(scheduleItemArrayList.get(position).getDate());
        viewHolder.event.setText(scheduleItemArrayList.get(position).getEvent());
        viewHolder.detail.setText(scheduleItemArrayList.get(position).getDetail());

        return convertView;
    }
}
