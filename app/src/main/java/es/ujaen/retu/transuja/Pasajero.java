package es.ujaen.retu.transuja;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * Created by windic on 08/12/2016.
 */

public class Pasajero extends Fragment implements View.OnClickListener{
    ImageButton imagen;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View fragmento = inflater.inflate(R.layout.pasajero, container, false);
        imagen = (ImageButton)fragmento.findViewById(R.id.boton_mapa);
        imagen.setOnClickListener(this);
        return fragmento;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.boton_mapa:
                Intent intent = new Intent(getActivity(), EduGrande.class);
                startActivity(intent);
                break;
        }

    }
}

