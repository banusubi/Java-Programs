public class StringEx {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new String("Java");
        String s3 = "Programming";

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s1==s3);
//        System.out.println(s1);
//        System.out.println(s2);
//
//        String s3 = s1.concat("Programming");
//        System.out.println(s3);
//        System.out.println(s1 + s2);
//        System.out.println(s1.charAt(0));
//        System.out.println(s1.length());
//        System.out.println(s3.substring(4,12));

    }
}
