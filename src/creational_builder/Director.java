package creational_builder;

public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public Home getComplexHomeObject(){
        return this.builder.getComplexHomeObject();
    }

    public void manageRequiredHomeConstructions(){
        this.builder.buildFloor();
        this.builder.buildWalls();
        this.builder.buildTerrace();
    }
}
