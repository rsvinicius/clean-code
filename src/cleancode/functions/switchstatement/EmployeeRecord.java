package cleancode.functions.switchstatement;

public class EmployeeRecord {
    private EmployeeTypeEnum employeeJobType;
    private int workedHoursPerMonth;
    private float hourlyWageInDollar;
    private float monthlySalaryInDollar;
    private int commissionTaxInPercentage;
    private float salesTotalPriceInDollar;

    public EmployeeRecord() {
    }

    public EmployeeTypeEnum getEmployeeJobType() {
        return employeeJobType;
    }

    public void setEmployeeJobType(EmployeeTypeEnum employeeJobType) {
        this.employeeJobType = employeeJobType;
    }

    public int getWorkedHoursPerMonth() {
        return workedHoursPerMonth;
    }

    public void setWorkedHoursPerMonth(int workedHoursPerMonth) {
        this.workedHoursPerMonth = workedHoursPerMonth;
    }

    public float getMonthlySalaryInDollar() {
        return monthlySalaryInDollar;
    }

    public void setMonthlySalaryInDollar(float monthlySalaryInDollar) {
        this.monthlySalaryInDollar = monthlySalaryInDollar;
    }

    public int getCommissionTaxInPercentage() {
        return commissionTaxInPercentage;
    }

    public void setCommissionTaxInPercentage(int commissionTaxInPercentage) {
        this.commissionTaxInPercentage = commissionTaxInPercentage;
    }

    public float getSalesTotalPriceInDollar() {
        return salesTotalPriceInDollar;
    }

    public void setSalesTotalPriceInDollar(float salesTotalPriceInDollar) {
        this.salesTotalPriceInDollar = salesTotalPriceInDollar;
    }

    public float getHourlyWageInDollar() {
        return hourlyWageInDollar;
    }

    public void setHourlyWageInDollar(float hourlyWageInDollar) {
        this.hourlyWageInDollar = hourlyWageInDollar;
    }
}
