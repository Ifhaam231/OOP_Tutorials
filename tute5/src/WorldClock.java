public class WorldClock extends Clock{

    private int offset;

    public WorldClock (int offset) {
        this.offset = offset;
    }

    public int getHours() {
        return current.getHour() + offset;
    }

    public int getMinutes() {
        return current.getMinute() + offset;
    }
}
