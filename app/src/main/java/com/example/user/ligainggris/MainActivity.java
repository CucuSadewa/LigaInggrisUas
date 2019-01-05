package com.example.user.ligainggris;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.MySSLSocketFactory;
import com.loopj.android.http.SyncHttpClient;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import cz.msebera.android.httpclient.Header;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.rv_category)
    RecyclerView rv_category;
    LigaInggrisAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        adapter = new LigaInggrisAdapter(this);
        String url = "https://www.thesportsdb.com/api/v1/json/1/search_all_teams.php?l=English%20Premier%20League";
        DemoAsync demoAsync = new DemoAsync();
        demoAsync.execute(url);
    }

    private class DemoAsync extends AsyncTask<String, Void, ArrayList<LigaInggris>> {


        @Override
        protected ArrayList<LigaInggris> doInBackground(String... strings) {
            String uri = strings[0];
            final ArrayList<LigaInggris> ligaInggrises = new ArrayList<>();
            SyncHttpClient client = new SyncHttpClient();

            client.setSSLSocketFactory(MySSLSocketFactory.getFixedSocketFactory());
            client.get(uri, new AsyncHttpResponseHandler() {
                @Override
                public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                    try {
                        String hasil = new String(responseBody);
                        JSONObject jsonTeam = new JSONObject(hasil);
                        JSONArray jsonArray = jsonTeam.getJSONArray("teams");
                        //Log.d("string", "onSuccess : "+ hasil);
                        for (int i = 0; i < jsonArray.length(); i++) {
                            JSONObject ligainggrisObj = jsonArray.getJSONObject(i);
                            LigaInggris ligaInggris = new LigaInggris(ligainggrisObj);
                            //Log.d("teams", "onSuccess : "+ligaInggris.getNamaTeam());
                            ligaInggrises.add(ligaInggris);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                @Override
                public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                    Log.d("Tag", "onFailure" + statusCode);

                }
            });
            return ligaInggrises;
        }

        @Override
        protected void onPostExecute(final ArrayList<LigaInggris> ligaInggris) {
            super.onPostExecute(ligaInggris);
            //for (int i = 0; i < ligaInggris.size(); i++){
            //Log.d("teams2", "onPostExecut :"+ ligaInggris.get(i).getNamaTeam());
            //  }

            rv_category.setLayoutManager(new LinearLayoutManager(MainActivity.this));
            adapter.setListligainggris(ligaInggris);
            rv_category.setAdapter(adapter);
            OnClickItem.addTo(rv_category).setOnItemClickListener(new OnClickItem.OnItemClickListener() {
                @Override
                public void onItemClicked(RecyclerView recyclerView, int position, View v) {


                   LigaInggris liga = new LigaInggris();
                   liga.setNamaTeam(ligaInggris.get(position).getNamaTeam());
                   liga.setGambarTeam(ligaInggris.get(position).getGambarTeam());
                   liga.setNamaPelatih(ligaInggris.get(position).getNamaPelatih());
                   liga.setNamaStadion(ligaInggris.get(position).getNamaStadion());
                   liga.setKapsitasStadion(ligaInggris.get(position).getKapsitasStadion());


                    Intent intent = new Intent(MainActivity.this,Detail.class);
                    intent.putExtra("data",liga);
                    startActivity(intent);
                }
            });
        }


    }

    void toast(String pesan) {
        Toast.makeText(MainActivity.this, pesan, Toast.LENGTH_SHORT).show();
    }
}
