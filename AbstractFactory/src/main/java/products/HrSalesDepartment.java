package products;

public class HrSalesDepartment implements HrDepartment{
    @Override
    public void showDepartmentInfo() {
        System.out.println("""
                This department is designed to show information about the people responsible to hire salesmens.
                """);
    }
}
