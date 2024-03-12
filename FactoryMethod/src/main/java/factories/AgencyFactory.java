package factories;

import products.Employee;

@FunctionalInterface
public interface AgencyFactory {
    /**
     * The hireEmployee methods returns an products.Employee based on what the hiring agency needs.
     */
    Employee getEmployee(String name, String description, int age, String address);
}
