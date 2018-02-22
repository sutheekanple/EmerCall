package masterple.snru.sc.th.emercall.fragment;


import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import masterple.snru.sc.th.emercall.R;

/**
 * Created by Admin on 22/2/2561.
 */

public class HospitalFragment extends Fragment{

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.ftagment_hospital, container, false);
        return view;
    }
} // Maln class

