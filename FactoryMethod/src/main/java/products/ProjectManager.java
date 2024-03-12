package products;

public class ProjectManager extends Employee {
    public ProjectManager(String name, String description, int age, String address) {
        super(name, description, age, address);
    }

    @Override
    public void resume() {
        String textBlock = """
                Hi, my name is $name and I am a project manager with $age years old.
                I live in $address and this is my description:
                
                $description
                
                Thank you for reading :)
                """
                .replace("$name", name)
                .replace("$age", Integer.toString(age))
                .replace("$address", address)
                .replace("$description", description);
        System.out.printf(textBlock);
    }
}
