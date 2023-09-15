package structural_Proxy;

public class ProxySubjectClass extends RealSubjectClass{

    @Override
    public void method() {
        System.out.println("Hi I'm Proxy Class Method");

        //logic to check if eligible for Real Class
        System.out.println("Calling Real Method of Real Subject Class");
        super.method();
    }
}
