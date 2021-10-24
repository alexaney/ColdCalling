package com.example.coldcalling;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class UncalledLogActivity extends AppCompatActivity {

    private ArrayList<String> uncalledList;
    private static final String EXTRA_UNCALLED_LIST = "com.example.coldcalling.ucl";
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

    public static Intent newIntent(Context packageContext, ArrayList<String> ucl) {
        Intent i = new Intent(packageContext, UncalledLogActivity.class);
        i.putExtra(EXTRA_UNCALLED_LIST, ucl);
        return i;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uncalled_log);
        uncalledList = getIntent().getStringArrayListExtra(EXTRA_UNCALLED_LIST);

        for (int x = 0; x < uncalledList.size(); x++) {
            if (x == 0) {
                name1 = (TextView) findViewById(R.id.uclog1);
                name1.setText(uncalledList.get(x));
            }
            if (x == 1) {
                name2 = (TextView) findViewById(R.id.uclog2);
                name2.setText(uncalledList.get(x));

            }
            if (x == 2) {
                name3 = (TextView) findViewById(R.id.uclog3);
                name3.setText(uncalledList.get(x));

            }
            if (x == 3) {
                name4 = (TextView) findViewById(R.id.uclog4);
                name4.setText(uncalledList.get(x));

            }
            if (x == 4) {
                name5 = (TextView) findViewById(R.id.uclog5);
                name5.setText(uncalledList.get(x));

            }
            if (x == 5) {
                name6 = (TextView) findViewById(R.id.uclog6);
                name6.setText(uncalledList.get(x));

            }
            if (x == 6) {
                name7 = (TextView) findViewById(R.id.uclog7);
                name7.setText(uncalledList.get(x));

            }
            if (x == 7) {
                name8 = (TextView) findViewById(R.id.uclog8);
                name8.setText(uncalledList.get(x));

            }
            if (x == 8) {
                name9 = (TextView) findViewById(R.id.uclog9);
                name9.setText(uncalledList.get(x));

            }
            if (x == 9) {
                name10 = (TextView) findViewById(R.id.uclog10);
                name10.setText(uncalledList.get(x));

            }
            if (x == 10) {
                name11 = (TextView) findViewById(R.id.uclog11);
                name11.setText(uncalledList.get(x));

            }
            if (x == 11) {
                name12 = (TextView) findViewById(R.id.uclog12);
                name12.setText(uncalledList.get(x));

            }
            if (x == 12) {
                name13 = (TextView) findViewById(R.id.uclog13);
                name13.setText(uncalledList.get(x));

            }
            if (x == 13) {
                name14 = (TextView) findViewById(R.id.uclog14);
                name14.setText(uncalledList.get(x));

            }
            if (x == 14) {
                name15 = (TextView) findViewById(R.id.uclog15);
                name15.setText(uncalledList.get(x));

            }
            if (x == 15) {
                name16 = (TextView) findViewById(R.id.uclog16);
                name16.setText(uncalledList.get(x));

            }
            if (x == 16) {
                name17 = (TextView) findViewById(R.id.uclog17);
                name17.setText(uncalledList.get(x));

            }
            if (x == 17) {
                name18 = (TextView) findViewById(R.id.uclog18);
                name18.setText(uncalledList.get(x));

            }
            if (x == 18) {
                name19 = (TextView) findViewById(R.id.uclog19);
                name19.setText(uncalledList.get(x));

            }
            if (x == 19) {
                name20 = (TextView) findViewById(R.id.uclog20);
                name20.setText(uncalledList.get(x));

            }
            if (x == 20) {
                name21 = (TextView) findViewById(R.id.uclog21);
                name21.setText(uncalledList.get(x));

            }
            if (x == 21) {
                name22 = (TextView) findViewById(R.id.uclog22);
                name22.setText(uncalledList.get(x));

            }
            if (x == 22) {
                name23 = (TextView) findViewById(R.id.uclog23);
                name23.setText(uncalledList.get(x));

            }
            if (x == 23) {
                name24 = (TextView) findViewById(R.id.uclog24);
                name24.setText(uncalledList.get(x));

            }
            if (x == 24) {
                name25 = (TextView) findViewById(R.id.uclog25);
                name25.setText(uncalledList.get(x));

            }
            if (x == 25) {
                name26 = (TextView) findViewById(R.id.uclog26);
                name26.setText(uncalledList.get(x));

            }
            if (x == 26) {
                name27 = (TextView) findViewById(R.id.uclog27);
                name27.setText(uncalledList.get(x));

            }
            if (x == 27) {
                name28 = (TextView) findViewById(R.id.uclog28);
                name28.setText(uncalledList.get(x));

            }
            if (x == 28) {
                name29 = (TextView) findViewById(R.id.uclog29);
                name29.setText(uncalledList.get(x));

            }
            if (x == 29) {
                name30 = (TextView) findViewById(R.id.uclog30);
                name30.setText(uncalledList.get(x));

            }
            if (x == 30) {
                name31 = (TextView) findViewById(R.id.uclog31);
                name31.setText(uncalledList.get(x));
            }
        }
    }

}