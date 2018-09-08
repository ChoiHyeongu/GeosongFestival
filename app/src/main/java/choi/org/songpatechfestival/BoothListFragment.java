package choi.org.songpatechfestival;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class BoothListFragment extends Fragment {

    ListView boothList;
    ArrayList<BoothItem> boothItemArrayList;
    int i = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_booth, container, false);

        String[] boothName = {
                "운동장을 누벼라", "물풍선으로 날리는 스트레스", "자유투 대회", "종이공예작품전시", "생활공예품 전시 및 판매", "송파 노래방", "순발력테스트", "항공/드론 비행 시뮬레이션", "페활량 시합",
                "고무줄 총 사격", "탁구", "생리주기팔찌 및 대안생리대 제작", "활동사진 및 작품 전시", "나도 왕년에는", "디지털 액자 만들기", "3D 프린터 제품 전시 및 판매", "IT 기술 체험", "타투",
                "핀버튼 만들기", "보드게임", "영화 관람 및 비평", "크로스워드완성, 청구기호보물찾기"};

        String[] circleName = {
                "202학급", "304학급", "농구", "종이공예", "생활공예창업", "보컬", "실내클라이밍", "스마트항공", "배드민턴", "학생회", "탁구", "배드민턴", "해양소년단", "방과후창체부", "창업연구",
                "3D제품발명반", "알고리즘 연구", "보드게임", "디자인 기능", "보드게임", "영화감상", "도서"
        };

        String[] place = {
                "운동장", "운동장", "농구장", "위클래스", "위클래스", "음악실", "103교실", "104교실", "105교실", "106교실", "108교실", "보건교육실", "9반 복도",
                "거송관 복도", "물리실", "물리실", "306교실", "307교실", "308교실", "수학전용실", "국어전용실", "도서관"
        };

        boothList = (ListView) rootView.findViewById(R.id.boothFragment_boothList);
        boothItemArrayList = new ArrayList<BoothItem>();

        for (i = 0; i < boothName.length; i++) {
            boothItemArrayList.add(new BoothItem(R.mipmap.icon_home, boothName[i], circleName[i], place[i]));
        }

        boothList.setAdapter(new BoothListAdapter(getActivity(), boothItemArrayList));

        return rootView;
    }
}
