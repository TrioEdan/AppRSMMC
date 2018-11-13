package com.example.akbar.rumahsakitmusimedikacendikia;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.journeyapps.barcodescanner.BarcodeEncoder;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;

public class DaftarPasien extends AppCompatActivity{

    private EditText date,dateberobat;
    DatePickerDialog datePickerDialog;

    private static final int CODE_GET_REQUEST = 1024;
    private static final int CODE_POST_REQUEST = 1025;

    Spinner etpoli, etbayar, etdokter, spkerjasama;
    EditText etid, etnomed, etdate, ettgllhr, etnama, etalamat, etnohp, ettglbook, etnamadaftar, etnorujuk;
    ProgressBar progressBar;
    Button mbtnDaftar, mbtnCari;
    ProgressDialog pd;
    AdapterView adapter;
    int currentPos =0;

    private Button gen_btn;
    private EditText text1;
    String text2Qr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_pasien);

        Thread t = new Thread() {
            @Override
            public void run() {
                try {
                    while (!isInterrupted()) {
                        Thread.sleep(1000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                EditText tdate = (EditText) findViewById(R.id.tgl_hariini);
                                long date = System.currentTimeMillis();
                                SimpleDateFormat sdf = new SimpleDateFormat("MM dd yyyy hh:mm:ss");
                                String dateString = sdf.format(date);
                                tdate.setText(dateString);
                            }
                        });
                    }
                } catch (InterruptedException e) {
                }
            }
        };
        t.start();

        date=findViewById(R.id.editgl);
        dateberobat=findViewById(R.id.tgl_berobat);
        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar calendar=Calendar.getInstance();
                final int year=calendar.get(Calendar.YEAR);
                final int month=calendar.get(Calendar.MONTH);
                final int day=calendar.get(Calendar.DAY_OF_MONTH);
                datePickerDialog=new DatePickerDialog(DaftarPasien.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                        String tgl=day+"-"+(month+1)+"-"+year;
                        date.setText(tgl);

                    }
                },year,month,day);
                datePickerDialog.show();
            }
        });

        dateberobat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Calendar c = Calendar.getInstance();
                int mYear = c.get(Calendar.YEAR);
                int mMonth = c.get(Calendar.MONTH);
                int mDay = c.get(Calendar.DAY_OF_MONTH);

                c.set(Calendar.DAY_OF_MONTH,mDay);
                DatePickerDialog dpd = new DatePickerDialog(DaftarPasien.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {
                                Calendar cal = Calendar.getInstance();
                                cal.set(Calendar.MONTH, monthOfYear);
                                cal.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                                cal.set(Calendar.YEAR, year);
                                if (cal.before(c)){
                                    return;
                                }
                                StringBuilder Mdate = new StringBuilder();
                                //date.delete(0, date.length());
                                Mdate.append((dayOfMonth<10?"0":"")).append(dayOfMonth)
                                        .append("-").append((monthOfYear + 1) < 10 ? "0" : "")
                                        .append((monthOfYear+1)).append("-").append(year);
                                dateberobat.setText(Mdate);
                            }
                        }, mYear, mMonth, mDay);
                dpd.getDatePicker().setMinDate(c.getTimeInMillis());
                dpd.show();
            }
        });


        etid = (EditText) findViewById(R.id.inp_id);
        etnomed = (EditText) findViewById(R.id.no_rekam);
        ettgllhr = (EditText) findViewById(R.id.editgl);
        etnama = (EditText) findViewById(R.id.nama_pasien);
        etalamat = (EditText) findViewById(R.id.alamat_pasien);
        etnohp = (EditText) findViewById(R.id.nohp_pasien);
        ettglbook = (EditText) findViewById(R.id.tgl_berobat);
        etnamadaftar = (EditText) findViewById(R.id.nama_pendaftar);
        etnorujuk = (EditText) findViewById(R.id.nomor_rujukan);
        etbayar = (Spinner) findViewById(R.id.spinner_bayar);
        etdokter = findViewById(R.id.spinner_dokter);
        etpoli = findViewById(R.id.spinner_poli);
        etdate = findViewById(R.id.tgl_hariini);
        spkerjasama = findViewById(R.id.spinner_kerjasama);

        mbtnCari = findViewById(R.id.btn_cari);
        mbtnDaftar = findViewById(R.id.btn_daftar);

        progressBar = findViewById(R.id.progressBar);

        mbtnCari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getData();

            }
        });

        etbayar.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                if (currentPos==position){
                    spkerjasama.setVisibility(View.GONE);
                }else{
                    spkerjasama.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



//        mbtnDaftar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                createData();
//
//            }
//        });

        final  Context context = this;
        text1 = this.findViewById(R.id.tgl_hariini);
        gen_btn = this.findViewById(R.id.btn_daftar);

        gen_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text2Qr = text1 .getText().toString().trim();
                MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
                try{
                    BitMatrix bitMatrix = multiFormatWriter.encode(text2Qr, BarcodeFormat.QR_CODE, 200, 200);
                    BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
                    Bitmap bitmap = barcodeEncoder.createBitmap(bitMatrix);
                    Intent intent = new Intent(context, GeneratorActivity.class);
                    intent.putExtra("pict",bitmap);
                    context.startActivity(intent);
                } catch (WriterException e) {
                    e.printStackTrace();
                }
                createData();
                finish();
            }
        });



    }

//    final DatePickerDialog.OnDateSetListener mdate = new DatePickerDialog.OnDateSetListener() {
//        @Override
//        public void onDateSet(DatePicker view, int year, int month, int day) {
//            view.setMinDate(System.currentTimeMillis() - 1000);
//        }
//    };




    private void getData(){
        pd = new ProgressDialog(DaftarPasien.this);
        pd.setMessage("Loading...");
        pd.setIndeterminate(false);
        pd.setCancelable(true);
        pd.show();
        StringRequest stringRequest = new StringRequest(Request.Method.GET, ServerAPI.URL_READ + etnomed.getText(),
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        pd.hide();

                        try {
                            JSONObject cekSuccess = new JSONObject(response);
                            Integer hasilJson = cekSuccess.getInt("success");

                            if (hasilJson == 0) {
                                Toast.makeText(getApplicationContext(), "Data Tidak Ditemukan !", Toast.LENGTH_LONG).show();
                            } else {
                                JSONObject jsonObject = new JSONObject(response);
                                JSONArray jsonArray = jsonObject.getJSONArray("product");

                                for (int i = 0; i < jsonArray.length(); i++) {
                                    JSONObject another_json_object = jsonArray.getJSONObject(i);

                                    String nama = another_json_object.getString("nama").trim();
                                    String alamat = another_json_object.getString("alamat").trim();
                                    etnama.setText(nama);
                                    etalamat.setText(alamat);
                                }
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        if (error !=null){

                            Toast.makeText(getApplicationContext(), "something when wrong!", Toast.LENGTH_LONG).show();
                        }
                    }
                });
        AppController.getInstance(getApplicationContext()).addToRequestqueue(stringRequest);
    }

    private void createData(){
        String nomed = etnomed.getText().toString().trim();
        String tgllhr = ettgllhr.getText().toString().trim();
        String nama = etnama.getText().toString().trim();
        String alamat = etalamat.getText().toString().trim();
        String nohp = etnohp.getText().toString().trim();
        String tglbook = ettglbook.getText().toString().trim();
        String namadaftar = etnamadaftar.getText().toString().trim();
        String norujuk = etnorujuk.getText().toString().trim();
        String bayar = etbayar.getSelectedItem().toString();
        String poli = etpoli.getSelectedItem().toString();
        String dokter = etdokter.getSelectedItem().toString();
        String kerjasama = spkerjasama.getSelectedItem().toString();
        String tglnow = etdate.getText().toString();

        HashMap<String, String > params = new HashMap<>();
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
        params.put("tglnow",tglnow);
        params.put("kerjasama",kerjasama);

        PerformNetworkRequest request = new PerformNetworkRequest(ServerAPI.URL_CREATE, params,CODE_POST_REQUEST);
        request.execute();
    }

    private class PerformNetworkRequest extends AsyncTask<Void,Void,String >{
        String url;
        HashMap<String ,String> params;
        int requestCode;

        PerformNetworkRequest(String url, HashMap<String,String> params, int requestCode){
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
            progressBar.setVisibility(View.GONE);

            try {
                JSONObject object = new JSONObject(s);
                if (!object.getBoolean("error")){
                    Toast.makeText(getApplicationContext(),object.getString("message"), Toast.LENGTH_SHORT).show();
                    //Intent intent = new Intent(getApplicationContext(),GeneratorActivity.class);
                    //startActivity(intent);

                }
            }catch (JSONException e){
                e.printStackTrace();
            }
        }

        @Override
        protected String doInBackground(Void... voids) {
            RequestHandler requestHandler = new RequestHandler();

            if (requestCode == CODE_POST_REQUEST)
                return requestHandler.sendPostRequest(url, params);

            if (requestCode == CODE_GET_REQUEST)
                return  requestHandler.sendGetRequest(url);

            return null;
        }
    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        overridePendingTransition(R.anim.go_up,R.anim.go_down);
    }


}
