package products;

public abstract class Employee {
    protected String name;
    protected String description;
    protected int age;
    protected String address;

    public Employee(String name, String description, int age, String address) {
        this.name = name;
        this.description = description;
        this.age = age;
        this.address = address;
    }

    /**
     * The resume method that will be implemented should show the resume of the employee and show to the 'contractor'
     */
    public abstract void resume();
}
