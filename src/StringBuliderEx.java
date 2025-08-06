public class StringBuliderEx {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Hello");
        s.append(" World");
        System.out.println(s);

        s.insert(6,"java ");
        System.out.println(s);

        s.replace(6,10,"Phython");
        System.out.println(s);

        s.delete(6,13);
        System.out.println(s);

        s.reverse();
        System.out.println(s);
    }
}
