package factories;

import products.Employee;
import products.ProjectManager;

public class ProjectManagerAgencyFactory implements AgencyFactory {
    @Override
    public Employee getEmployee(String name, String description, int age, String address) {
        return new ProjectManager(name, description, age, address);
    }
}
