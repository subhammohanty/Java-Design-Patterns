package creational_builder;

public class EarthQuakeResistanceBuilder implements Builder{

    private Home earthQuakeResistanceBuilder = new Home();
    @Override
    public void buildFloor() {
        this.earthQuakeResistanceBuilder.floor = "Wooden Floors";
    }

    @Override
    public void buildWalls() {
        this.earthQuakeResistanceBuilder.walls = "Wooden Walls";
    }

    @Override
    public void buildTerrace() {
        this.earthQuakeResistanceBuilder.terrace = "Wooden Terrace";
    }

    @Override
    public Home getComplexHomeObject() {
        return this.earthQuakeResistanceBuilder;
    }
}
