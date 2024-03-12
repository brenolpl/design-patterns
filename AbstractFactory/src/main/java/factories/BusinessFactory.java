package factories;


import products.DevelopersDepartment;
import products.HrDepartment;

public interface BusinessFactory {
    HrDepartment createHrDepartment();
    DevelopersDepartment createDevelopersDepartment();

}
