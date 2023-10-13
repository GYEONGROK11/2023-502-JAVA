package extra.day1;

public class Casting {
    public static void main(String[] args) {
        int n1 = 10, n2 = 3;
        System.out.printf("%.3f\n", (float) n1 / n2);



        int a = n1 *1000;
        float b = (float) (a/n2) /1000;
        System.out.println(b);
    }
}
