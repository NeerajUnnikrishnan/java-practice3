package com.company;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateOfWeek {
    public  String[] getDate (){
        Calendar c = Calendar.getInstance();

        // Set the calendar to monday of the current week
        c.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);

        System.out.println();
        // Print dates of the current week starting on Monday
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        String startDate = df.format(c.getTime());

        for (int i = 0; i <6; i++) {
            c.add(Calendar.DATE, 1);
        }

        String endDate = df.format(c.getTime());

        String[] dateArray = {startDate, endDate};
        return dateArray;
    }
}

