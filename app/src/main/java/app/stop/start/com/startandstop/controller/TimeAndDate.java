package app.stop.start.com.startandstop.controller;


import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeAndDate {

    public static long getTime() {
        Date date;
		date = new Date();
        
        return date.getTime();
    }

    public static String getDate() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

        return dateFormat.format(date);
    }

    public static String differenceTime(long start, long stop) {
        long seconds = Math.abs(stop - start) / 1000;
        long hours = seconds / 3600;
        long minutes = seconds / 60 % 60;
        String m = "";
        if(minutes >= 0 && minutes <= 9){
            m = "0" + minutes;
        }else{
            m = "" + minutes;
        }

        return "" + hours + ":" + m;
    }

}
