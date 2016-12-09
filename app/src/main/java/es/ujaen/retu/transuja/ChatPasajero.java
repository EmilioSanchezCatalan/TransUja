package es.ujaen.retu.transuja;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * Created by windic on 08/12/2016.
 */

public class ChatPasajero extends Fragment {

    public ChatPasajero(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View fragmento = inflater.inflate(R.layout.chat_pasajero, container, false);
        return fragmento;
    }
}
