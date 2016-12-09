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

public class Chat extends Fragment {

    TextView salida;
    EditText entrada;
    Button enviar;

    public Chat(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View fragmento = inflater.inflate(R.layout.chat, container, false);
        salida = (TextView) fragmento.findViewById(R.id.contestacion);
        entrada = (EditText) fragmento.findViewById(R.id.entrada);
        enviar = (Button) fragmento.findViewById(R.id.enviar_chat);
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                salida.setText(entrada.getText().toString());
                entrada.setText("");

            }
        });
        return fragmento;
    }
}
