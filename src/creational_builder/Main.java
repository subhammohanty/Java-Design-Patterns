package creational_builder;

public class Main {

    public static void main(String[] args) {
        EarthQuakeResistanceBuilder earthQuakeResistanceBuilder = new EarthQuakeResistanceBuilder();
        Director director = new Director(earthQuakeResistanceBuilder);
        director.manageRequiredHomeConstructions();
        Home complexHomeObject = director.getComplexHomeObject();
        System.out.println(complexHomeObject);
        System.out.println(complexHomeObject.floor);
    }
}
