package factories;

import products.DevelopersDepartment;
import products.HrDepartment;
import products.HrSalesDepartment;
import products.ProjectXDepartment;

public class NewBusinessFactory implements BusinessFactory{
    @Override
    public HrDepartment createHrDepartment() {
        return new HrSalesDepartment();
    }

    @Override
    public DevelopersDepartment createDevelopersDepartment() {
        return new ProjectXDepartment();
    }
}
