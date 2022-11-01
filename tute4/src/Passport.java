public class Passport extends Card{
    private String birthLocation;
    private int expirationYear;

    public Passport(String n, String birthLocation, int expirationYear) {
        super(n);
        this.birthLocation = birthLocation;
        this.expirationYear = expirationYear;
    }

    @Override
    public String format() {
        return super.format() + ", Birth Location: " + birthLocation + ", Expiration Year: " + expirationYear;
    }

    @Override
    public boolean isExpired() {
        return false;
    }
}
