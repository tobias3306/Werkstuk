package com.ehb.tobias.werkstuk;

/**
 * Created by Tobias on 29/11/2017.
 */
import android.util.Log;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

public class HttpURLConnectionAPI {
    private ATM[] ATMArray;
    private boolean done = false;
    public ATM[] sendGet() throws Exception {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try  {
                    String url = "https://opendata.brussel.be/api/records/1.0/search/?dataset=geldautomaten&rows=-1";

                    URL obj = new URL(url);
                    HttpURLConnection con = (HttpURLConnection) obj.openConnection();

                    // optional default is GET
                    con.setRequestMethod("GET");

                    //add request header
                    //con.setRequestProperty("User-Agent", USER_AGENT);

                    int responseCode = con.getResponseCode();
                    System.out.println("\nSending 'GET' request to URL : " + url);
                    System.out.println("Response Code : " + responseCode);

                    BufferedReader in = new BufferedReader(
                            new InputStreamReader(con.getInputStream()));
                    String inputLine;
                    StringBuffer response = new StringBuffer();

                    while ((inputLine = in.readLine()) != null) {
                        response.append(inputLine);
                    }
                    in.close();

                    //Log.d("Test", response.toString());

                    ATMArray = ATMDeserializer.deserialize(response.toString());
                    done = true;

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();

        while(done == false){

        }

        return ATMArray;
    }

}
