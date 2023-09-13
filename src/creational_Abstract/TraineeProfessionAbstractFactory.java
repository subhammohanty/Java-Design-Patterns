package creational_Abstract;

public class TraineeProfessionAbstractFactory extends AbstractFactory{
    @Override
    Profession getProfession(String type) {
        if(type == null){
            return null;
        }
        if(type == "Engineer"){
            return new TraineeEngineer();
        } else if (type == "Teacher") {
            return new TraineeTeacher();
        }
        return null;
    }
}
