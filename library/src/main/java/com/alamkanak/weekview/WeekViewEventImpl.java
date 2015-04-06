package com.alamkanak.weekview;

import java.util.Calendar;

public class WeekViewEventImpl implements WeekViewEvent {

    private Calendar mStartTime;
    private Calendar mEndTime;
    private String mName;
    private int mColor;
    private long mId;

    public WeekViewEventImpl(Calendar startTime, Calendar endTime, String name, int color, long id) {
        mStartTime = startTime;
        mEndTime = endTime;
        mName = name;
        mColor = color;
        mId = id;
    }

    @Override
    public Calendar getStartTime() {
        return mStartTime;
    }

    @Override
    public Calendar getEndTime() {
        return mEndTime;
    }

    @Override
    public String getName() {
        return mName;
    }

    @Override
    public int getColor() {
        return mColor;
    }

    @Override
    public long getId() {
        return mId;
    }
}
