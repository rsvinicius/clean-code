package cleancode.functions.switchstatement;

import java.time.LocalDateTime;

public class SalariedEmployee extends Employee {

    public static final float WORK_TIME_PER_WEEK_IN_HOURS = 40f;
    public static final float WORK_TIME_PER_MONTH_IN_HOURS = 160f;
    public static final int WEEKS_PER_YEAR = 52;
    public static final int MONTHS_PER_YEAR = 12;
    private EmployeeRecord employeeRecord;

    public SalariedEmployee(EmployeeRecord employeeRecord) {
        this.employeeRecord = employeeRecord;
    }

    @Override
    public boolean isPayday() {
        int dayOfMonth = LocalDateTime.now().getDayOfMonth();
        return dayOfMonth == 28;
    }

    @Override
    public float calculatePay() {
        float monthlySalary = employeeRecord.getMonthlySalaryInDollar();
        int workedHours = employeeRecord.getWorkedHoursPerMonth();
        float paymentRateWithCompTime = workedHours / WORK_TIME_PER_MONTH_IN_HOURS;
        return monthlySalary * paymentRateWithCompTime;
    }

    @Override
    public void deliverPay(double pay) {
        System.out.println("Payment sent for salaried employee!");
    }
}
