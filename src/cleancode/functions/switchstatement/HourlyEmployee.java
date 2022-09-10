package cleancode.functions.switchstatement;

import java.time.LocalDateTime;

public class HourlyEmployee extends Employee {
    private EmployeeRecord employeeRecord;

    public HourlyEmployee(EmployeeRecord employeeRecord) {
        this.employeeRecord = employeeRecord;
    }

    @Override
    public boolean isPayday() {
        int dayOfMonth = LocalDateTime.now().getDayOfMonth();
        return dayOfMonth == 2;
    }

    @Override
    public float calculatePay() {
        int workedHoursPerMonth = employeeRecord.getWorkedHoursPerMonth();
        float hourlyWageInDollar = employeeRecord.getHourlyWageInDollar();
        return workedHoursPerMonth * hourlyWageInDollar;
    }

    @Override
    public void deliverPay(double pay) {
        System.out.println("Payment sent for hourly employee!");
    }
}
