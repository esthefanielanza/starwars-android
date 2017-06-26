package com.example.esthefanielanza.starwars.data;

import android.content.Context;
import android.util.Log;

import com.example.esthefanielanza.starwars.model.JsonResult;
import com.google.gson.Gson;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Created by esthefanie-note on 25/06/17.
 */

public class JsonFromFile {
    private static Context context;

    public JsonFromFile(Context context) {
        this.context = context;
    }

    public static JsonResult getResult(Context currentContext){
        try {
            context = currentContext;
            InputStream in = context.getAssets().open("data.json");
            Gson gson = new Gson();
            Reader reader = new InputStreamReader(in);
            JsonResult result = gson.fromJson(reader, JsonResult.class);
            return result;
        } catch (IOException e) {
            Log.d("error", "Deu ruim!!");
            e.printStackTrace();
            return null;
        }
    }
}
