package kr.anima.xd.s.own.inventory;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kr.anima.xd.s.test.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MissionSettingFragment extends Fragment {


    public MissionSettingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mission_setting, container, false);
    }

}
