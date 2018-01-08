package com.ehb.tobias.werkstuk;

import com.google.gson.Gson;
import android.util.Log;

/**
 * Created by Tobias on 7/01/2018.
 */

public class ATMDeserializer {
    public static ATM[] deserialize(String json){
        upperJson output = new Gson().fromJson(json, upperJson.class);
        ATM[] atms = output.getRecords();
        return atms;
    }
}
