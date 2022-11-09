public class ClockTest {

    public static void main(String[] args) {
        Clock c1 = new Clock();

        System.out.println("Hours is " + c1.getHours());

        System.out.println("Minutes is " + c1.getMinutes());

        System.out.print("Current time is ");
        c1.getTime();

        Clock c2 = new WorldClock(3);
        System.out.println("\n"+"Time in California");

        System.out.println("Hours is " + c2.getHours());

        System.out.println("Minutes is " + c2.getMinutes());

        System.out.print("Current time is ");
        c2.getTime();

        Clock c3 = new Clock();
        System.out.println("\n"+"Alarm test");

        c3.setAlarm(10,20);

        System.out.println("Hours is " + c3.getHours());

        System.out.println("Minutes is " + c3.getMinutes());

        System.out.print("Current time is ");
        c3.getTime();

        //no alarm
        System.out.print("Current time is ");
        c3.getTime();


    }
}