package creational_Abstract;

public class ProfessionAbstractFactory extends AbstractFactory{
    @Override
    Profession getProfession(String type) {
        if(type == null){
            return null;
        }
        if(type == "Engineer"){
            return new Engineer();
        } else if (type == "Teacher") {
            return new Teacher();
        }
        return null;
    }
}
