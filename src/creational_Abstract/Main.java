package creational_Abstract;

public class Main {

    public static void main(String[] args) {
        AbstractFactory profession = AbstractFactoryProducer.getProfession(true);
        Profession engineer = profession.getProfession("Engineer");
        engineer.print();
    }
}
