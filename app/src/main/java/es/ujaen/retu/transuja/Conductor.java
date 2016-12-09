package es.ujaen.retu.transuja;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by windic on 08/12/2016.
 */

public class Conductor extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View fragmento = inflater.inflate(R.layout.conductor, container, false);
        return fragmento;
    }
}
