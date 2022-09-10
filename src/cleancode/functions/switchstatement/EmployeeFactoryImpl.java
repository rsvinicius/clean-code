package cleancode;

public class EmployeeFactoryImpl implements EmployeeFactory {
    @Override
    public Employee makeEmployee(EmployeeRecord r) {
        switch (r.type){
            case COMMISSIONED:
                return new CommissionedEmployee(r);
        }
    }
}
