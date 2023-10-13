package extra.day1;

public class StringEx {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        String s3 = new String("hello");

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s1));
        System.out.println(s2.equals(s3));
        System.out.println(s1==s2);
    }
}
