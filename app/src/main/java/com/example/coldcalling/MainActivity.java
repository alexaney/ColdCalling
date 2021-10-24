package com.example.coldcalling;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.lang.System;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private TextView dateTimeDisplay;
    private Calendar calendar;
    private SimpleDateFormat dateFormat;
    private String date;
    private ArrayList<String> called;
    private ArrayList<StudentPicture> listCalled;
    private ArrayList<String> uncalled;
    private ArrayList<StudentPicture> images;
    private Button mRandomButton;
    private Button mCalledButton;
    private Button mUncalledButton;
    private ImageView calledStudent;
    private TextView nameStudent;
    private static int count2 = 1;
    private int incriment;
    private long startTime;
    private final static long time = (long) (2.4 * (Math.pow(10, 6)));
    private final static long time2 = (long) (8.64 * (Math.pow(10, 7)));
    private static int count = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startTime = System.currentTimeMillis();
        setContentView(R.layout.activity_main);
        dateTimeDisplay = (TextView)findViewById(R.id.date_and_time);
        calendar = Calendar.getInstance();
        dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        date = dateFormat.format(calendar.getTime());
        dateTimeDisplay.setText(date);

        images = new ArrayList<StudentPicture>();
        images.add(new StudentPicture("adrian_yan"));
        images.add(new StudentPicture("alex_aney"));
        images.add(new StudentPicture("bipra_dey"));
        images.add(new StudentPicture("daniel_dultsin"));
        images.add(new StudentPicture("darren_dong"));
        images.add(new StudentPicture("dhruv_amin"));
        images.add(new StudentPicture("eden_kogan"));
        images.add(new StudentPicture("eli_bui"));
        images.add(new StudentPicture("elie_belkin"));
        images.add(new StudentPicture("evelyn_paskhaver"));
        images.add(new StudentPicture("fardin_iqbal"));
        images.add(new StudentPicture("jerry_he"));
        images.add(new StudentPicture("kenny_cao"));
        images.add(new StudentPicture("marc_rosenberg"));
        images.add(new StudentPicture("matthew_chen"));
        images.add(new StudentPicture("michael"));
        images.add(new StudentPicture("ming_lin"));
        images.add(new StudentPicture("mohammed_ihtisham"));
        images.add(new StudentPicture("noam"));
        images.add(new StudentPicture("ralf_pacia"));
        images.add(new StudentPicture("samuel_iskhakov"));
        images.add(new StudentPicture("sean"));
        images.add(new StudentPicture("sebastian_marinescu"));
        images.add(new StudentPicture("selina_li"));
        images.add(new StudentPicture("shuyue_chen"));
        images.add(new StudentPicture("tanushri_sundaram"));
        images.add(new StudentPicture("vasu"));
        images.add(new StudentPicture("xinrui_ge"));
        images.add(new StudentPicture("zhian_maysoon"));

        incriment = 0;
        uncalled = new ArrayList<String>();
        called = new ArrayList<String>();
        listCalled = new ArrayList<StudentPicture>();
        for (int q = 0; q < images.size(); q++) {
            StudentPicture sp = images.get(q);
            uncalled.add(sp.getName());
        }

        mRandomButton = (Button) findViewById(R.id.random_button);
        mRandomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int z = pickStudent();
                String uri = "@drawable/" + images.get(z).getImageName();
                int imageResource = getResources().getIdentifier(uri, null, getPackageName());
                calledStudent = (ImageView) findViewById(R.id.btnSetDrawable);
                Drawable res = getResources().getDrawable(imageResource);
                calledStudent.setImageDrawable(res);
                nameStudent = (TextView) findViewById(R.id.name);
                nameStudent.setText(images.get(z).getName());
                images.get(z).setLastTimeCalled(System.currentTimeMillis());
                images.get(z).gotCalled();

                if (listCalled.indexOf(images.get(z)) == -1) {
                    called.add(images.get(z).getName() + "\n" + "Times Called: " + images.get(z).getTimesCalled() + "\n" + "Last Time Called: " + images.get(z).getLastTimeCalledString());
                    listCalled.add(images.get(z));
                    images.get(z).setIndex(incriment);
                    incriment++;
                    uncalled.remove(images.get(z).getName());
                } else {
                    called.set(images.get(z).getIndex(), images.get(z).getName() + "\n" + "Times Called: " + images.get(z).getTimesCalled() + "\n" + "Last Time Called: " + images.get(z).getLastTimeCalledString());
                }
            }
        });
        mCalledButton = (Button) findViewById(R.id.called_button);
        mCalledButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = CalledLogActivity.newIntent(MainActivity.this, called);
                startActivity(i);
            }
        });
        mUncalledButton = (Button) findViewById(R.id.uncalled_button);
        mUncalledButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = UncalledLogActivity.newIntent(MainActivity.this, uncalled);
                startActivity(intent);
            }
        });
    }
    public int pickStudent() {
        if ((System.currentTimeMillis() / count) - startTime > time) {
            count++;
            for (int i = 0; i < images.size(); i++) {
                images.get(i).resetTimesCalled();
            }
        }
        if ((System.currentTimeMillis() / count2) - startTime > time2) {
            count2++;
            while (!uncalled.isEmpty()) {
                uncalled.remove(0);
            }
            for (int i = 0; i < images.size(); i++) {
                uncalled.add(images.get(i).getName());
            }
        }
        int range = images.size() - 1;
        int index = (int)(Math.random() * range);
        while (images.get(index).getTimesCalled() > 1) {
            index = (int)(Math.random() * range);
        }
        return index;
    }
}