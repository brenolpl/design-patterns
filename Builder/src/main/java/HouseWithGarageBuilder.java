public class HouseWithGarageBuilder extends HouseBuilder{
    @Override
    public void buildWalls() {
        house.setNumberOfWalls(4);
        System.out.println("Building the " + house.getNumberOfWalls() + " walls of a House with Garage");
    }

    @Override
    public void buildRoof() {
        house.setWidthInMeters(20);
        house.setHeightInMeters(2);
        System.out.println("Building the roof of a House with Garage of " + house.getHeightInMeters() * house.getWidthInMeters() + "m2");
    }

    @Override
    public void buildGarden() {
        System.out.println("Not implemented");
    }

    @Override
    public void buildPool() {
        System.out.println("Not implemented");
    }

    @Override
    public void buildDoors() {
        house.setNumberOfDoors(10);
        System.out.println("Building the " + house.getNumberOfDoors() + " doors of a House with Garage");
    }

    @Override
    public void buildGarage() {
        System.out.println("Building the garage of a House with Garage");
    }
}
