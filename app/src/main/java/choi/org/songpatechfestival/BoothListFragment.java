package choi.org.songpatechfestival;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class BoothListFragment extends Fragment {

    ListView boothList;
    ArrayList<BoothItem> boothItemArrayList;
    ImageView boothImage;

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_booth, container, false);

        boothList = (ListView) rootView.findViewById(R.id.boothFragment_boothList);
        boothItemArrayList = new ArrayList<BoothItem>();

        boothItemArrayList.add(new BoothItem(R.mipmap.icon_schedule, "Booth Name1", "What to do"));
        boothItemArrayList.add(new BoothItem(R.mipmap.icon_home, "Booth Name2", "What to do"));
        boothItemArrayList.add(new BoothItem(R.mipmap.icon_home, "Booth Name3", "What to do"));
        boothItemArrayList.add(new BoothItem(R.mipmap.icon_home, "Booth Name4", "What to do"));


        boothList.setAdapter(new BoothListAdapter(getActivity(), boothItemArrayList));

        return rootView;
    }
}
