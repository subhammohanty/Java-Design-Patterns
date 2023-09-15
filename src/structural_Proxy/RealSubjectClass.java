package structural_Proxy;

public class RealSubjectClass implements Subject{
    @Override
    public void method() {
        System.out.println("Hi I'm Real Subject Class");
    }
}
