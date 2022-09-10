package cleancode;

import java.time.LocalDateTime;

public class SalariedEmployee extends Employee {
    @Override
    public boolean isPayday() {
        int dayOfMonth = LocalDateTime.now().getDayOfMonth();
        return dayOfMonth == 28;
    }

    @Override
    public Double calculatePay() {
        return 0d;
    }

    @Override
    public void deliverPay(Double pay) {
        System.out.println("Payment sent for salaried employee!");
    }
}
