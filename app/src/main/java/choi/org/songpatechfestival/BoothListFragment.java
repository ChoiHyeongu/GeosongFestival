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

public class BoothListFragment extends Fragment {

    ListView boothList;
    ArrayList<BoothItem> boothItemArrayList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_booth, container, false);

        boothList = (ListView) rootView.findViewById(R.id.boothFragment_boothList);
        boothItemArrayList = new ArrayList<BoothItem>();

        for (int i = 1; i < 10; i++) {
            boothItemArrayList.add(new BoothItem(R.mipmap.icon_home, "Booth Name" + i, "What to do"));
        }

        boothList.setAdapter(new BoothListAdapter(getActivity(), boothItemArrayList));

        return rootView;
    }
}
