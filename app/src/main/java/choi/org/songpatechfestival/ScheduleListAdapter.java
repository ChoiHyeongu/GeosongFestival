package choi.org.songpatechfestival;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class ScheduleListAdapter extends BaseAdapter {

    private Context context;
    private String[] time = {"8:30"};
    private String[] event = {"등교"};
    private String[] who = {"학생"};

    public ScheduleListAdapter(Context context, String[] time, String[] event, String[] who) {
        this.context = context;
        this.time = time;
        this.event = event;
        this.who = who;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return time.length;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
