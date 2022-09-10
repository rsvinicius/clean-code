package cleancode.functions.switchstatement;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class CommissionedEmployee extends Employee {
    public static final float ONE_HUNDRED_IN_FLOAT = 100f;
    private EmployeeRecord employeeRecord;

    public CommissionedEmployee(EmployeeRecord employeeRecord) {
        this.employeeRecord = employeeRecord;
    }

    @Override
    public boolean isPayday() {
        DayOfWeek dayOfWeek = LocalDateTime.now().getDayOfWeek();
        return dayOfWeek.equals(DayOfWeek.FRIDAY);
    }

    @Override
    public float calculatePay() {
        float salesTotalPriceInDollar = employeeRecord.getSalesTotalPriceInDollar();
        int commissionTaxInPercentage = employeeRecord.getCommissionTaxInPercentage();
        float commissionTaxInDecimal = commissionTaxInPercentage / ONE_HUNDRED_IN_FLOAT;
        return salesTotalPriceInDollar * commissionTaxInDecimal;
    }

    @Override
    public void deliverPay(double pay) {
        System.out.println("Payment sent for comissioned employee!");
    }
}
