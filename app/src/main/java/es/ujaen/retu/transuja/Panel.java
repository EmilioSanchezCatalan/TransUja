package es.ujaen.retu.transuja;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by windic on 08/12/2016.
 */

public class Panel extends AppCompatActivity {
    ViewPager viewPager;
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.panel);
        SharedPreferences preferences = getSharedPreferences("MiPref", 0);
        String tipo = preferences.getString("Tipo", null);
        viewPager = (ViewPager) findViewById(R.id.activity_main_pager_viewpager);
        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());
        if (tipo.equals("Conductor")){
            adapter.addFragment(new Conductor(), "Conductor");
            adapter.addFragment(new Chat(), "Chat");
        }else {
            adapter.addFragment(new Pasajero(), "Pasajero");
            adapter.addFragment(new ChatPasajero(), "Chat");
        }
        viewPager.setAdapter(adapter);
        tabLayout = (TabLayout) findViewById(R.id.activity_main_tabs_tablayout);
        tabLayout.setupWithViewPager(viewPager);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id){
            case R.id.configuration:
                Intent intent = new Intent(this, Configuracion.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }
}
