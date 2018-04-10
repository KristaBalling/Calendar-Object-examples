package com.theironyard;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();

        c.set(2004,0,7,15,40);
        //Set time to Jan. 7, 2004 at 15:40. (month is zero-based)

        long day1 = c.getTimeInMillis();
        //Convert this to milliseconds
        day1 += 1000 * 60 * 60;

        c.setTimeInMillis(day1);
        //Add an hour's worth of millis, then update the time.
        //the += is like day1 = day1 + ...

        System.out.println("new hour " + c.get(c.HOUR_OF_DAY));

        c.add(c.DATE, 35);
        //add 35 days to the date, which should move us into February

        System.out.println("add 35 days " + c.getTime());

        c.roll(c.DATE, 35);
        //"Roll 35 days onto this date. This "rolls" the date
        // ahead 35 days, but DOES NOT change the month.

        System.out.println("roll 35 days " + c.getTime());

        c.set(c.DATE, 1);
        //we're not incrementing here, just doing a "set" of the date.

        System.out.println("set to 1 " + c.getTime());

        //This output confirms how millis, add, roll, and set work.




    }
}
