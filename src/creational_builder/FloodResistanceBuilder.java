package creational_builder;

public class FloodResistanceBuilder implements Builder{

    private Home floodResistanceBuilder = new Home();
    @Override
    public void buildFloor() {
        this.floodResistanceBuilder.floor = "Above 10 Feet";
    }

    @Override
    public void buildWalls() {
        this.floodResistanceBuilder.walls = "Water Proof";
    }

    @Override
    public void buildTerrace() {
        this.floodResistanceBuilder.terrace = "Dr FixIt";
    }

    @Override
    public Home getComplexHomeObject() {
        return this.floodResistanceBuilder;
    }
}
