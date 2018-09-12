package choi.org.songpatechfestival;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ScheduleListFragment extends Fragment {

    ListView scheduleList;
    ArrayList<ScheduleItem> scheduleItemArrayList;
    int i = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_schedule, container, false);

        String[] event = {
            "스마트 항공반", "가야금반", "김규리", "차동엽 외 7명", "김동환 외 5명", "방송반", "부스활동", "스마트항공반", "어머니 10명", "구휘 외 5명"
        };

        String[] detail = {
            "드론 시연", "가야금 합주", "25현 가야금 독주", "두드림 난타", "태권도 퍼포먼스", "동아리 활동 영상", "부스 활동", "드론시연", "어머니 가야금 합주", "댄스"
        };

        scheduleList = (ListView) rootView.findViewById(R.id.scheduleFragment_scheduleList);
        scheduleItemArrayList = new ArrayList<ScheduleItem>();

        for (i = 0; i < event.length; i++) {
            scheduleItemArrayList.add(new ScheduleItem(event[i], event[i], detail[i]));
        }

        scheduleList.setAdapter(new ScheduleListAdapter(getActivity(), scheduleItemArrayList));

        return rootView;
    }
}
