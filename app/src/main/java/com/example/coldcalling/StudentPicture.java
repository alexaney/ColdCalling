package com.example.coldcalling;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentPicture {
    private String imageName;
    private int timesCalledTime;
    private int timesCalled;
    private long lastTimeCalled;
    private boolean beenCalled;
    private int index;

    public StudentPicture(String iN) {
        imageName = iN;
        timesCalledTime = 0;
        lastTimeCalled = 0;
        beenCalled = false;
        index = -1;
    }

    public boolean getBeenCalled() {
        return beenCalled;
    }
    public int getTimesCalled() {
        return timesCalled;
    }
    public String getImageName() {
        return imageName;
    }
    public void setIndex(int in) {
        index = in;
    }
    public int getIndex() {
        return index;
    }
    public String getLastTimeCalledString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss");
        Date date = new Date(lastTimeCalled);
        String time = simpleDateFormat.format(date);
        return time;
    }
    public long getLastTimeCalled() {
        return lastTimeCalled;
    }

    public void resetTimesCalled() {
        timesCalledTime = 0;
    }
    public void gotCalled() {
        timesCalledTime++;
        timesCalled++;
        beenCalled = true;
    }
    public void setLastTimeCalled(long time) {
        lastTimeCalled = time;
    }
    public String getName() {
        int index = imageName.indexOf('_');
        if (index == -1) {
            return imageName;
        } else {
            return imageName.substring(0, index) + " " + imageName.substring(index+1);
        }
    }

}
