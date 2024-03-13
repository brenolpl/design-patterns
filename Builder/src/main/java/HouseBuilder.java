public abstract class HouseBuilder {

    protected House house;

    public HouseBuilder() {
        house = new House();
    }

    public abstract void buildWalls();
    public abstract void buildRoof();
    public abstract void buildGarden();
    public abstract void buildPool();
    public abstract void buildDoors();
    public abstract void buildGarage();

    public House getHouse() {
        return house;
    }
}
