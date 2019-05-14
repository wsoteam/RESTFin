package com.wild.myapplication;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new AsyncLoad().execute();
        //checkSub();
    }

    private void checkSub() {
        String id = "basic_subscription_12m_trial";
        String token = "ncemekojkebejfggmbjnhmck.AO-J1Ow70Ssur09s96-vJCtIbz4R_-OdXCZDCAvlL0dzbJz-r8vc_i5h5-Lw6cLPHMFJBtanZbQhRhOZhkwXAGe3hm9YjwC2wD3nQlAmJ-z9rEl-LABz9pQN_-zHZAwK7YDRZHeiULHC";
        String pn = "com.vape.IQOS";

        PlayServices playServices = new PlayServices();
        try {
            Log.e("LOL", playServices.getSubscription(pn, id, token).getPriceCurrencyCode());
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("LOL", "KEK" + e.toString());
        }
    }

    private class AsyncLoad extends AsyncTask<Void, Void, Void>{
        @Override
        protected Void doInBackground(Void... voids) {
            String id = "ts";
            String token = "nfekjcfhmnboinjlalkanoci.AO-J1OxJtB5WraQ9p2nHlv1G35xobn5tL9Pbl3V3j_lGQOehbuCa4z3AyUR5Ls6dY6ITEV_nNG9lP-uAQ2OA3OyL06bzPZD1Yn8DQb6-b77NFKrARa0AwFo";
            String pn = "com.wild.diet";
            PlayServices playServices = new PlayServices();
            try {
                Log.e("LOL", playServices.getSubscription(pn, id, token).toString());
            } catch (Exception e) {
                e.printStackTrace();
                Log.e("LOL", "KEK" + e.toString());
            }
            return null;
        }
    }
}
