package co.micab.mapboxtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        CardView mapExample = findViewById(R.id.cardViewMap);
        CardView navigationExample = findViewById(R.id.cardViewNavigation);
        CardView placesExample = findViewById(R.id.cardViewPlaces);


        mapExample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        navigationExample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListActivity.this, NavigationActivity.class);
                startActivity(intent);
            }
        });
        placesExample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListActivity.this, PlacesPluginActivity.class);
                startActivity(intent);
            }
        });
    }
}
