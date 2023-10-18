package extra.honjahaebogy;

import java.util.Scanner;

public class Q2 {
    /*
    12345 > 15 처럼 각자 자리 수를 다 더하기
    */
    public static void main(String[] args) {
        int num = 0, sum = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력하세요. (예:12345) >> ");
        num = scan.nextInt();

        int tem = num % 10;
        for (int i = 0; i < 10; i++) {
            if (tem != 0 && tem % 3 == 0) {

                sum += sum;

                System.out.printf("%d", sum);
            }

        }
    }
}
