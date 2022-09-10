import cleancode.functions.switchstatement.Employee;
import cleancode.functions.switchstatement.EmployeeFactoryImpl;
import cleancode.functions.switchstatement.EmployeeRecord;
import cleancode.functions.switchstatement.EmployeeTypeEnum;

public class Playground {
    public static void main(String[] args) {
        EmployeeFactoryImpl employeeFactory = new EmployeeFactoryImpl();

        EmployeeRecord salariedEmployeeRecord = new EmployeeRecord();
        salariedEmployeeRecord.setEmployeeJobType(EmployeeTypeEnum.SALARIED);
        salariedEmployeeRecord.setMonthlySalaryInDollar(5000);
        salariedEmployeeRecord.setWorkedHoursPerMonth(170);
        Employee salariedEmployee = employeeFactory.makeEmployee(salariedEmployeeRecord);

        EmployeeRecord commissionedEmployeeRecord = new EmployeeRecord();
        commissionedEmployeeRecord.setEmployeeJobType(EmployeeTypeEnum.COMMISSIONED);
        commissionedEmployeeRecord.setCommissionTaxInPercentage(40);
        commissionedEmployeeRecord.setSalesTotalPriceInDollar(20000);
        Employee commissionedEmployee = employeeFactory.makeEmployee(commissionedEmployeeRecord);

        EmployeeRecord hourlyEmployeeRecord = new EmployeeRecord();
        hourlyEmployeeRecord.setEmployeeJobType(EmployeeTypeEnum.HOURLY);
        hourlyEmployeeRecord.setHourlyWageInDollar(60);
        hourlyEmployeeRecord.setWorkedHoursPerMonth(180);
        Employee hourlyEmployee = employeeFactory.makeEmployee(hourlyEmployeeRecord);

// ---------------------------------------------------------------------------------------

        Employee employee = hourlyEmployee;
        System.out.println("isPayday: " + employee.isPayday() +
                "\ncalculatePay: " + employee.calculatePay());
        employee.deliverPay(0);
    }
}
