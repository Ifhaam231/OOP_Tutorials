public class CreditCard extends Card{
    private int pinNumber;
    private int number;

    public CreditCard(String n, int pin, int num)
    {
        super(n);
        pinNumber = pin;
        number = num;
    }

    @Override
    public String format() {
        return super.format() + ", PIN Number: " + pinNumber + ", card number: " + number;
    }

    @Override
    public boolean isExpired() {
        return false;
    }
}
