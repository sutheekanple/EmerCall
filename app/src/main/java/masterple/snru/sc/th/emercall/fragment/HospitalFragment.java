package masterple.snru.sc.th.emercall.fragment;



import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import masterple.snru.sc.th.emercall.R;
import masterple.snru.sc.th.emercall.utility.HospitalAdapter;

/**
 * Created by Admin on 22/2/2561.
 */

public class HospitalFragment extends Fragment{

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

//        Create ListView
        ListView listView = getView().findViewById(R.id.listViewHopotal);

        int[] ints =new int[]{R.drawable.station1, R.drawable.station2, R.drawable.station3,
                R.drawable.station3, R.drawable.station4, R.drawable.station1,
                R.drawable.station2, R.drawable.station3, R.drawable.station4};

    String[] titleStrings = new String[]{"Hospital 1","Hospital 2",
                                        "Hospital 3","Hospital 4","Hospital 5",
                                        "Hospital 6","Hospital 7","Hospital 8"};

    String[] phonesStrings = new String[]{"1111","1112","1113","1114","1115","1116","1117","1118"};

    HospitalAdapter hospitalAdapter = new HospitalAdapter(getActivity(), ints, titleStrings, phonesStrings);
    listView.setAdapter(hospitalAdapter);


    } // Main Method



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.ftagment_hospital, container, false);
        return view;
    }
} // Maln class

