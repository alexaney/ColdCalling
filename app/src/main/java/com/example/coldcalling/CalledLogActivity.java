package com.example.coldcalling;

import android.content.Intent;
import android.os.Bundle;
import android.content.Context;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.coldcalling.databinding.ActivityCalledLogBinding;

import java.util.ArrayList;

public class CalledLogActivity extends AppCompatActivity {

    private ArrayList<String> calledList;
    private static final String EXTRA_CALLED_LIST = "com.example.coldcalling.cl";
    private TextView name1;
    private TextView name2;
    private TextView name3;
    private TextView name4;
    private TextView name5;
    private TextView name6;
    private TextView name7;
    private TextView name8;
    private TextView name9;
    private TextView name10;
    private TextView name11;
    private TextView name12;
    private TextView name13;
    private TextView name14;
    private TextView name15;
    private TextView name16;
    private TextView name17;
    private TextView name18;
    private TextView name19;
    private TextView name20;
    private TextView name21;
    private TextView name22;
    private TextView name23;
    private TextView name24;
    private TextView name25;
    private TextView name26;
    private TextView name27;
    private TextView name28;
    private TextView name29;
    private TextView name30;
    private TextView name31;

    public static Intent newIntent(Context packageContext, ArrayList<String> cl) {
        Intent i = new Intent(packageContext, CalledLogActivity.class);
        i.putExtra(EXTRA_CALLED_LIST, cl);
        return i;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_called_log);
        calledList = getIntent().getStringArrayListExtra(EXTRA_CALLED_LIST);

        for (int x = 0; x < calledList.size(); x++) {
            if (x==0) {
                name1 = (TextView) findViewById(R.id.clog1);
                name1.setText(calledList.get(x));
            }
            if (x==1) {
                name2 = (TextView) findViewById(R.id.clog2);
                name2.setText(calledList.get(x));

            }if (x==2) {
                name3 = (TextView) findViewById(R.id.clog3);
                name3.setText(calledList.get(x));

            }if (x==3) {
                name4 = (TextView) findViewById(R.id.clog4);
                name4.setText(calledList.get(x));

            }if (x==4) {
                name5 = (TextView) findViewById(R.id.clog5);
                name5.setText(calledList.get(x));

            }if (x==5) {
                name6 = (TextView) findViewById(R.id.clog6);
                name6.setText(calledList.get(x));

            }if (x==6) {
                name7 = (TextView) findViewById(R.id.clog7);
                name7.setText(calledList.get(x));

            }if (x==7) {
                name8 = (TextView) findViewById(R.id.clog8);
                name8.setText(calledList.get(x));

            }if (x==8) {
                name9 = (TextView) findViewById(R.id.clog9);
                name9.setText(calledList.get(x));

            }if (x==9) {
                name10 = (TextView) findViewById(R.id.clog10);
                name10.setText(calledList.get(x));

            }if (x==10) {
                name11 = (TextView) findViewById(R.id.clog11);
                name11.setText(calledList.get(x));

            }if (x==11) {
                name12 = (TextView) findViewById(R.id.clog12);
                name12.setText(calledList.get(x));

            }if (x==12) {
                name13 = (TextView) findViewById(R.id.clog13);
                name13.setText(calledList.get(x));

            }if (x==13) {
                name14 = (TextView) findViewById(R.id.clog14);
                name14.setText(calledList.get(x));

            }if (x==14) {
                name15 = (TextView) findViewById(R.id.clog15);
                name15.setText(calledList.get(x));

            }if (x==15) {
                name16 = (TextView) findViewById(R.id.clog16);
                name16.setText(calledList.get(x));

            }if (x==16) {
                name17 = (TextView) findViewById(R.id.clog17);
                name17.setText(calledList.get(x));

            }if (x==17) {
                name18 = (TextView) findViewById(R.id.clog18);
                name18.setText(calledList.get(x));

            }if (x==18) {
                name19 = (TextView) findViewById(R.id.clog19);
                name19.setText(calledList.get(x));

            }if (x==19) {
                name20 = (TextView) findViewById(R.id.clog20);
                name20.setText(calledList.get(x));

            }if (x==20) {
                name21 = (TextView) findViewById(R.id.clog21);
                name21.setText(calledList.get(x));

            }if (x==21) {
                name22 = (TextView) findViewById(R.id.clog22);
                name22.setText(calledList.get(x));

            }if (x==22) {
                name23 = (TextView) findViewById(R.id.clog23);
                name23.setText(calledList.get(x));

            }if (x==23) {
                name24 = (TextView) findViewById(R.id.clog24);
                name24.setText(calledList.get(x));

            }if (x==24) {
                name25 = (TextView) findViewById(R.id.clog25);
                name25.setText(calledList.get(x));

            }if (x==25) {
                name26 = (TextView) findViewById(R.id.clog26);
                name26.setText(calledList.get(x));

            }if (x==26) {
                name27 = (TextView) findViewById(R.id.clog27);
                name27.setText(calledList.get(x));

            }if (x==27) {
                name28 = (TextView) findViewById(R.id.clog28);
                name28.setText(calledList.get(x));

            }if (x==28) {
                name29 = (TextView) findViewById(R.id.clog29);
                name29.setText(calledList.get(x));

            }if (x==29) {
                name30 = (TextView) findViewById(R.id.clog30);
                name30.setText(calledList.get(x));

            }if (x==30) {
                name31 = (TextView) findViewById(R.id.clog31);
                name31.setText(calledList.get(x));

            }
        }
    }
}