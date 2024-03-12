package products;

public class ProjectXDepartment implements DevelopersDepartment{
    @Override
    public void showDepartmentInfo() {
        System.out.printf("""
                This department is about the Project X, that creates the super powerful girls.
                """);
    }
}
