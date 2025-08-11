package inheritance;

public class Parent {
    void ParentData(){
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    void ChildMethod(){
        System.out.println("child Method");
    }
}
class Main{
    public static void main(String[] args) {
        Child c = new Child();
        c.ParentData();
        c.ChildMethod();
    }
}
