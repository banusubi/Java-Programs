public class PassByValueEx {
    public static void main(String[] args) {
        int a = 50;
        modify(a);
        System.out.println(a);
    }
    public static void modify(int a){
        a=100;
    }
}
