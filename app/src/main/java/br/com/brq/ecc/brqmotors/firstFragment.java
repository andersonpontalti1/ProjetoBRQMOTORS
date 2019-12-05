package br.com.brq.ecc.brqmotors;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

public class firstFragment extends Fragment {

    TextView next;
    ViewPager viewPager;

    public firstFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_first, container, false);

        viewPager=getActivity().findViewById(R.id.viewPager);
        next=view.findViewById(R.id.slideOneNext);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             viewPager.setCurrentItem(1);
            }
        });

        return view;
    }

}
