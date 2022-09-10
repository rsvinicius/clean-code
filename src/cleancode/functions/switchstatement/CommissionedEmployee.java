package cleancode;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class CommissionedEmployee extends Employee {
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
    public Double calculatePay() {
        return 0d;
    }

    @Override
    public void deliverPay(Double pay) {
        System.out.println("Payment sent for comissioned employee!");
    }
}
