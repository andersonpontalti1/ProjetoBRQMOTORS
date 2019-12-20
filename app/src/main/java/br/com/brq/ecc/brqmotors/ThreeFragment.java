package br.com.brq.ecc.brqmotors;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
public class ThreeFragment extends Fragment {
    TextView next;
    TextView back;
    ViewPager viewPager;
    public ThreeFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_three, container, false);
        viewPager=getActivity().findViewById(R.id.viewPager);
        return view;
    }
}