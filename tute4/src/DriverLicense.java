public class DriverLicense extends Card{
    private int expirationYear;

    public DriverLicense(String n, int expirationYear) {
        super(n);
        this.expirationYear = expirationYear;
    }

    @Override
    public String format() {
        return super.format() + ", Expiration Year: " + expirationYear;
    }

    @Override
    public boolean isExpired() {
        return false;
    }
}
