import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class Clock {

    LocalDateTime current = LocalDateTime.now();
    private int hours;
    private int minutes;

    public void setAlarm(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public void Alarm() {
        System.out.println("Alarm");
    }

    public int getHours() {
        return current.getHour();
    }

    public int getMinutes() {
        return current.getMinute();
    }

    public void getTime() {
        System.out.println(getHours()+"h"+getMinutes()+"m");
        //
        SimpleDateFormat form = new SimpleDateFormat("HH:mm");
        //Date d1 = form.parse(current.getHour());

        //
        if (hours < current.getHour()) {
            Alarm();
            setAlarm(99,99);
        }
    }


}
