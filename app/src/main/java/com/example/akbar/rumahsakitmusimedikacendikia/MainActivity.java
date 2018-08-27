package com.example.akbar.rumahsakitmusimedikacendikia;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.ShareActionProvider;
import android.text.util.Linkify;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    FloatingActionButton fab_plus, fab_add, fab_help;
    Animation FabOpen, FabClose, FabRClockwise, FabRanticlockwise;
    boolean isOpen = false;
    String phone = "(0711)-446272";

    Intent goDaftar,goHistory;

    private ShareActionProvider shareActionProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarid);
        setSupportActionBar(toolbar);


        Thread t = new Thread() {
            @Override
            public void run() {
                try {
                    while (!isInterrupted()) {
                        Thread.sleep(1000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                TextView tdate = (TextView) findViewById(R.id.date);
                                long date = System.currentTimeMillis();
                                SimpleDateFormat sdf = new SimpleDateFormat("MMM dd yyyy\nhh-mm-ss a");
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


        fab_plus = findViewById(R.id.fab_plus);
        fab_add = findViewById(R.id.fab_add);
        fab_help = findViewById(R.id.fab_help);
        FabOpen = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_open);
        FabClose = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_close);
        FabRClockwise = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_clockwise);
        FabRanticlockwise = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_anticlockwise);
        fab_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isOpen)
                {
                    fab_add.startAnimation(FabClose);
                    fab_help.startAnimation(FabClose);
                    fab_plus.startAnimation(FabRanticlockwise);
                    fab_help.setClickable(false);
                    fab_add.setClickable(false);
                    isOpen=false;
                }
                else
                    {
                    fab_add.startAnimation(FabOpen);
                    fab_help.startAnimation(FabOpen);
                    fab_plus.startAnimation(FabRClockwise);
                    fab_help.setClickable(true);
                    fab_add.setClickable(true);
                    isOpen=true;

                }
            }
        });



        fab_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                GoOther();
            }
        });

        fab_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(Intent.ACTION_DIAL);
                mIntent.setData(Uri.parse("tel:" + phone));
                if (mIntent.resolveActivity(getPackageManager()) != null){
                    startActivity(mIntent);
                }else{
                    Toast.makeText(MainActivity.this, "There is no app that support this action"
                            , Toast.LENGTH_SHORT).show();
                }
            }
        });



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    public void GoOther(){
        goDaftar = new Intent(getApplicationContext(),CreateData.class);
        startActivity(goDaftar);
        overridePendingTransition(R.anim.go_up, R.anim.go_down);
    }

   public void GoHistory(){
       goHistory = new Intent(getApplicationContext(),HistoryPendaftar.class);
       startActivity(goHistory);
       overridePendingTransition(R.anim.go_up, R.anim.go_down);
   }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_daftar) {
            // Handle the add action
            GoOther();
            return true;


        } else if (id == R.id.nav_history) {
            GoHistory();
            return true;

        } else if (id == R.id.nav_jadwal) {

        } else if (id == R.id.nav_berita) {

        } else if (id == R.id.nav_bantuan) {
            Intent intent = new Intent(this, Bantuan.class);
            startActivity(intent);
        } else if (id == R.id.nav_about) {

        } else if (id == R.id.nav_kontak) {

        } else if (id == R.id.nav_share) {

            switch (item.getItemId()) {
                case R.id.nav_share:
                    Intent i = new Intent(Intent.ACTION_SEND);
                    i.setType("text/plain");
                    i.putExtra(
                            android.content.Intent.EXTRA_TEXT, "Test Share https://www.rsmmcpalembang.id");
                    startActivity(Intent.createChooser(i, "Share Via"));
                    break;
            }
            Toast.makeText(getApplicationContext(), "You click on menu share", Toast.LENGTH_SHORT).show();
            return super.onOptionsItemSelected(item);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;



    }
}
