package com.alamkanak.weekview;

import java.util.Calendar;

public class WeekViewEventImpl implements WeekViewEvent {

    private Calendar mStartTime;
    private Calendar mEndTime;
    private String mName;
    private int mColor;
    private long mId;
    private int mStyle;
    private int mTextColor;

    public WeekViewEventImpl(Calendar startTime, Calendar endTime, String name, int color, long id, int style, int textColor) {
        mStartTime = startTime;
        mEndTime = endTime;
        mName = name;
        mColor = color;
        mId = id;
        mStyle = style;
        mTextColor = textColor;
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

    @Override
    public int getStyle() {
        return mStyle;
    }

    @Override
    public int getTextColor() {
        return mTextColor;
    }
}
