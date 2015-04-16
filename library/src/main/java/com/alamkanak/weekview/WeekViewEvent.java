package com.alamkanak.weekview;

import android.support.annotation.IntDef;

import java.util.Calendar;

/**
 * Created by Raquib-ul-Alam Kanak on 7/21/2014.
 * Website: http://april-shower.com
 */
public interface WeekViewEvent {

    int STYLE_NORMAL = 1;
    int STYLE_DOTTED = 2;

    Calendar getStartTime();

    Calendar getEndTime();

    String getName();

    int getColor();

    long getId();

    int getStyle();

    int getTextColor();

}
