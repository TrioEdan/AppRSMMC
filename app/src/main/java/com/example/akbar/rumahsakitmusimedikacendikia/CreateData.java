package com.example.akbar.rumahsakitmusimedikacendikia;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

import static android.view.View.GONE;

public class CreateData extends AppCompatActivity {
    private static final int CODE_GET_REQUEST = 1024;
    private static final int CODE_POST_REQUEST = 1025;

    EditText etid, etnomed, ettgllhr, etnama, etalamat, etnohp, etbayar,
            etpoli, etdokter, ettglbook, etnamadaftar, etnorujuk;
    ProgressBar progressBar;
    Button mbtnDaftar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_data);
        etid = (EditText) findViewById(R.id.inp_id);
        etnomed = (EditText) findViewById(R.id.inp_nomed);
        ettgllhr = (EditText) findViewById(R.id.inp_tgllhr);
        etnama = (EditText) findViewById(R.id.inp_nama);
        etalamat = (EditText) findViewById(R.id.inp_alamat);
        etnohp = (EditText) findViewById(R.id.inp_nohp);
        etbayar = (EditText) findViewById(R.id.inp_bayar);
        etpoli = (EditText) findViewById(R.id.inp_poli);
        etdokter = (EditText) findViewById(R.id.inp_dokter);
        ettglbook = (EditText) findViewById(R.id.inp_tglbook);
        etnamadaftar = (EditText) findViewById(R.id.inp_namadaftar);
        etnorujuk = (EditText) findViewById(R.id.inp_norujuk);

        progressBar = (ProgressBar)findViewById(R.id.progressBar);

        mbtnDaftar = (Button)findViewById(R.id.btnDaftar);
        mbtnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createData();
            }
        });
    }

    private void createData() {
        String nomed = etnomed.getText().toString().trim();
        String tgllhr = ettgllhr.getText().toString().trim();
        String nama = etnama.getText().toString().trim();
        String alamat = etalamat.getText().toString().trim();
        String nohp = etnohp.getText().toString().trim();
        String bayar = etbayar.getText().toString().trim();
        String poli = etpoli.getText().toString().trim();
        String dokter = etdokter.getText().toString().trim();
        String tglbook = ettglbook.getText().toString().trim();
        String namadaftar = etnamadaftar.getText().toString().trim();
        String norujuk = etnorujuk.getText().toString().trim();

        HashMap<String, String> params = new HashMap<>();
        params.put("nomed",nomed);
        params.put("tgllhr",tgllhr);
        params.put("nama",nama);
        params.put("alamat",alamat);
        params.put("nohp",nohp);
        params.put("bayar",bayar);
        params.put("poli",poli);
        params.put("dokter",dokter);
        params.put("tglbook",tglbook);
        params.put("namadaftar",namadaftar);
        params.put("norujuk",norujuk);

        PerformNetworkRequest request = new PerformNetworkRequest(ServerAPI.URL_CREATE, params, CODE_POST_REQUEST);
        request.execute();
    }

    private class PerformNetworkRequest extends AsyncTask<Void, Void, String> {
        String url;
        HashMap<String, String> params;
        int requestCode;

        PerformNetworkRequest(String url, HashMap<String, String> params, int requestCode) {
            this.url = url;
            this.params = params;
            this.requestCode = requestCode;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressBar.setVisibility(View.VISIBLE);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            progressBar.setVisibility(GONE);
            try {
                JSONObject object = new JSONObject(s);
                if (!object.getBoolean("error")) {
                    Toast.makeText(getApplicationContext(), object.getString("message"), Toast.LENGTH_SHORT).show();
                    //refreshHeroList(object.getJSONArray("heroes"));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        @Override
        protected String doInBackground(Void... voids) {
            RequestHandler requestHandler = new RequestHandler();

            if (requestCode == CODE_POST_REQUEST)
                return requestHandler.sendPostRequest(url, params);


            if (requestCode == CODE_GET_REQUEST)
                return requestHandler.sendGetRequest(url);

            return null;
        }
    }
}
