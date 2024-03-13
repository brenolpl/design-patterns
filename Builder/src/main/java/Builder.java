public class Builder {
    public static void main(String... args) {
        HouseWithGarageDirector houseDirector = new HouseWithGarageDirector(new HouseWithGarageBuilder());
        houseDirector.buildHouse();
    }
}
