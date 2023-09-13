package creational_Factory;

public class Factory {

    public Profession getInstance(String instanceType) {
        if (instanceType == null) {
            return null;
        }
        if (instanceType == "Doctor") {
            return new Doctor();
        } else if (instanceType == "Engineer") {
            return new Engineer();
        } else if (instanceType == "Teacher") {
            return new Teacher();
        }
        return null;
    }
}