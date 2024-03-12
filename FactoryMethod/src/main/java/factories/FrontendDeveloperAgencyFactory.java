package factories;

import products.Employee;
import products.FrontendDeveloper;

public class FrontendDeveloperAgencyFactory implements AgencyFactory {
    @Override
    public Employee getEmployee(String name, String description, int age, String address) {
        return new FrontendDeveloper(name, description, age, address);
    }
}
