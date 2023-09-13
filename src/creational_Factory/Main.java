package creational_Factory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Profession engineer = factory.getInstance("Engineer");
        engineer.print();

    }
}
