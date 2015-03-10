package com.alamkanak.weekview;

import java.util.Calendar;

/**
 * Created by Raquib-ul-Alam Kanak on 7/21/2014.
 * Website: http://april-shower.com
 */
public interface WeekViewEvent {

    public Calendar getStartTime();

    public Calendar getEndTime();

    public String getName();

    public int getColor();

    public long getId();

}
