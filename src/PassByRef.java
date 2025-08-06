public class PassByRef {
    int value;
    public PassByRef(int value){
        this.value = value;
    }
}
class MainRef{
    public static void main(String[] args) {
        PassByRef p  = new PassByRef(10);
        modify(p);
        System.out.println(p.value);
    }
    public static void modify(PassByRef n){
        n.value = 100;
    }
}

