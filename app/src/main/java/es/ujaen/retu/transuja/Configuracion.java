package es.ujaen.retu.transuja;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TableLayout;
import android.widget.TextView;

/**
 * Created by windic on 08/12/2016.
 */

public class Configuracion extends Activity implements View.OnClickListener {

    TableLayout tableLayout;
    RadioGroup radioGroup;
    RadioButton radio_pasajero, radio_conductor;
    TextView textView;
    Button enviar;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.configuracion);
        radio_pasajero = (RadioButton)findViewById(R.id.radio_pasajero);
        radio_conductor = (RadioButton)findViewById(R.id.radio_conductor);
        textView = (TextView)findViewById(R.id.datos_coche);
        textView.setVisibility(View.INVISIBLE);
        tableLayout = (TableLayout) findViewById(R.id.Tabla_coche);
        tableLayout.setVisibility(View.INVISIBLE);
        radioGroup = (RadioGroup)findViewById(R.id.radiog);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.radio_conductor) {
                    tableLayout.setVisibility(View.VISIBLE);
                    textView.setVisibility(View.VISIBLE);
                } else {
                    tableLayout.setVisibility(View.INVISIBLE);
                    textView.setVisibility(View.INVISIBLE);
                }

            }
        });
        enviar = (Button) findViewById(R.id.button_configuracion);
        enviar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        SharedPreferences preferences = getSharedPreferences("MiPref", 0);
        SharedPreferences.Editor editor = preferences.edit();
        switch (view.getId()){
            case R.id.button_configuracion:
                if (radio_conductor.isChecked()){
                    editor.putString("Tipo", "Conductor");
                }else if (radio_pasajero.isChecked()){
                    editor.putString("Tipo", "Pasajero");
                }
                editor.commit();
                Intent intent = new Intent(this, Panel.class);
                startActivity(intent);
                break;

        }
    }
}
