public class HouseWithGarageDirector {
    protected HouseBuilder houseBuilder;

    public HouseWithGarageDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void buildHouse() {
        houseBuilder.buildRoof();
        houseBuilder.buildWalls();
        houseBuilder.buildDoors();
        houseBuilder.buildGarage();
    }

    public House getHouse() {
        return houseBuilder.getHouse();
    }
}
