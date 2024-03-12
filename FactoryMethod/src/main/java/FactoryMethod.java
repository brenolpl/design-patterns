import factories.FrontendDeveloperAgencyFactory;
import factories.ProjectManagerAgencyFactory;
import products.Employee;

/**
 * FactoryMethod it is utilized when we want to define an Interface to create an Object, but let the subclasses
 * define wich class instantiate. The FactoryMethod allows to postpone the instantiation for subclasses.
 */
public class FactoryMethod {
    public static void main(String... args) {
        FrontendDeveloperAgencyFactory frontendFactory = new FrontendDeveloperAgencyFactory();
        Employee employee = frontendFactory.getEmployee("Breno Luiz Paulino Leal", "Angular Developer", 23, "Vitória, Espírito Santo, Brazil");
        employee.resume();

        ProjectManagerAgencyFactory managerFactory = new ProjectManagerAgencyFactory();
        Employee manager = managerFactory.getEmployee("Izabela Moreira Tiago", "PMBOK, MBA in Software Engineering at USP", 28, "São Paulo, Brazil");
        manager.resume();
    }
}
