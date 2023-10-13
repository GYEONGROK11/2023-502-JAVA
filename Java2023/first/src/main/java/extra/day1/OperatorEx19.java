package extra.day1;

public class OperatorEx19 {
    public static void main(String[] args) {
        int x = 10, y = 8;
        System.out.printf("x/y = %d, 나머지 %d\n", x / y, x % y);

        int val = (int)(Math.random()*10)+1;

        System.out.printf("%d은(는) %s수입니다",val,val % 2 == 0 ? "짝":"홀");
    }
}
