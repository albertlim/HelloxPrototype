package co.helloxprototype.app;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.common.GooglePlayServicesUtil;

/**
 * Created by Lims on 6/5/2014.
 */
public class LocationMain extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.map_view, container, false);
        int googlePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable();
    }
}
