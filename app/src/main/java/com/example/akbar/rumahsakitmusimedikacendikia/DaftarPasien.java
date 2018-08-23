package com.example.akbar.rumahsakitmusimedikacendikia;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class DaftarPasien extends AppCompatActivity{

    private EditText date,dateberobat;
    DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_pasien);
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
                        String tgl=year+"-"+(month+1)+"-"+day;
                        date.setText(tgl);

                    }
                },year,month,day);
                datePickerDialog.show();
            }
        });

        dateberobat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar calendar=Calendar.getInstance();
                final int year=calendar.get(Calendar.YEAR);
                final int month=calendar.get(Calendar.MONTH);
                final int day=calendar.get(Calendar.DAY_OF_MONTH);
                datePickerDialog=new DatePickerDialog(DaftarPasien.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                        String tgl=year+"-"+(month+1)+"-"+day;
                        dateberobat.setText(tgl);

                    }
                },year,month,day);
                datePickerDialog.show();
            }
        });





    }



    @Override
    public void onBackPressed(){
        super.onBackPressed();
        overridePendingTransition(R.anim.go_up,R.anim.go_down);
    }


}
