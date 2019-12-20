package br.com.brq.ecc.brqmotors;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
public class IntroAdapter extends FragmentPagerAdapter {
    public IntroAdapter( FragmentManager fm) {
        super (fm);
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FirstFragment();
            case 1:
                return new TwoFragment();
            case 2:
                return new ThreeFragment();
            default:
                return null;
        }
    }
    @Override
    public int getCount(){
        return 3;
    }
}