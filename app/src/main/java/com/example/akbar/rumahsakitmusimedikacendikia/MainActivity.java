package com.example.akbar.rumahsakitmusimedikacendikia;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    String phone = "111-111-1111";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarid);
        setSupportActionBar(toolbar);

        FloatingActionButton fabMenu = (FloatingActionButton) findViewById(R.id.floatingActionButton);
        FloatingActionButton fabTambahButton = (FloatingActionButton) findViewById(R.id.addButton);
        FloatingActionButton fabBantuanButton = (FloatingActionButton) findViewById(R.id.helpButton);
        final LinearLayout mAddLayout = (LinearLayout) findViewById(R.id.addLayout);
        final LinearLayout mHelpLayout = (LinearLayout) findViewById(R.id.helpLayout);
        fabMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mAddLayout.getVisibility() == View.VISIBLE && mHelpLayout.getVisibility()
                        == View.VISIBLE){
                    mAddLayout.setVisibility(View.GONE);
                    mHelpLayout.setVisibility(View.GONE);
                }else {
                    mAddLayout.setVisibility(View.VISIBLE);
                    mHelpLayout.setVisibility(View.VISIBLE);
                }
            }
        });

        fabTambahButton.setOnClickListener(new View.OnClickListener() {
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

        fabBantuanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW);
                mIntent.setData(Uri.parse("sms:" + phone));
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
            // Handle the camera action
        } else if (id == R.id.nav_history) {

        } else if (id == R.id.nav_jadwal) {

        } else if (id == R.id.nav_berita) {

        } else if (id == R.id.nav_bantuan) {

        } else if (id == R.id.nav_about) {

        } else if (id == R.id.nav_kontak) {

        } else if (id == R.id.nav_share) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
