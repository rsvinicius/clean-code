package cleancode;

public abstract class Employee {
    public abstract boolean isPayday();
    public abstract Double calculatePay();
    public abstract void deliverPay(Double pay);
}
