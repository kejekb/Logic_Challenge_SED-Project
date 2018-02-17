package com.example.kevinbalauro.logicchallenge;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class LevelSelection extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_selection);

        GridView levelGrid = (GridView) findViewById(R.id.levelGrid);
        levelGrid.setAdapter(new LevelAdapter(this));
        levelGrid.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View v, int position, long id){
                Intent i = null;
                switch(position){
                    case 0:
                        i = new Intent(v.getContext(),Level1.class);
                        break;
                    case 1:
                        i = new Intent(v.getContext(),Level2.class);
                        break;
                    case 2:
                        i = new Intent(v.getContext(),Level3.class);
                        break;
                    case 3:
                        i = new Intent(v.getContext(),Level4.class);
                        break;
                    case 4:
                        i = new Intent(v.getContext(),Level5.class);
                        break;
                    case 5:
                        i = new Intent(v.getContext(),Level6.class);
                        break;
                    case 6:
                        i = new Intent(v.getContext(),Level7.class);
                        break;
                    case 7:
                        i = new Intent(v.getContext(),Level8.class);
                        break;
                    case 8:
                        i = new Intent(v.getContext(),Level9.class);
                        break;
                }
                i.putExtra("id", position);
                startActivity(i);
            }
        });
    }

    @Override
    public void onBackPressed(){
        startActivity(new Intent(this,MainMenu.class));
    }
}
