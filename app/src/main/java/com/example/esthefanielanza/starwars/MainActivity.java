package com.example.esthefanielanza.starwars;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.esthefanielanza.starwars.adapters.charAdapter;
import com.example.esthefanielanza.starwars.data.JsonFromFile;
import com.example.esthefanielanza.starwars.model.Character;
import com.example.esthefanielanza.starwars.model.JsonResult;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initList();
    }

    private void initList() {

        mRecyclerView = (RecyclerView) findViewById(R.id.characters_list);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        JsonResult result = JsonFromFile.getResult(this);

        if(result != null) {
            List<Character> currentChars = result.getResults();
            charAdapter adapter = new charAdapter(currentChars, this);
            mRecyclerView.setAdapter(adapter);
        }
    }
}
