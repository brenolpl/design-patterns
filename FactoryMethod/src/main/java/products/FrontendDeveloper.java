package products;

public class FrontendDeveloper extends Employee {
    public FrontendDeveloper(String name, String description, int age, String address) {
        super(name, description, age, address);
    }

    @Override
    public void resume() {
        String textblock = """
        My name is $name, I am a frontend developer.
        I am $age years old and below are my experience:
        $description
        
        You may find me in $address
        Best Regards,
        $name
        """
                .replace("$name", name)
                .replace("$age", Integer.toString(age))
                .replace("$description", description)
                .replace("$address", address);
        System.out.println(textblock);
    }
}
