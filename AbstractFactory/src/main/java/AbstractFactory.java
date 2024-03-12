import factories.NewBusinessFactory;
import products.DevelopersDepartment;
import products.HrDepartment;

public class AbstractFactory {
    public static void main(String... args) {
        NewBusinessFactory businessFactory = new NewBusinessFactory();
        HrDepartment hrDepartment = businessFactory.createHrDepartment();
        DevelopersDepartment developersDepartment = businessFactory.createDevelopersDepartment();

        hrDepartment.showDepartmentInfo();
        developersDepartment.showDepartmentInfo();
    }
}
