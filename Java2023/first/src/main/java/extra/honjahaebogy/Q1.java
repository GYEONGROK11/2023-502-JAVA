package extra.honjahaebogy;

public class Q1 {
    public static void main(String[] args) {
        final int MIN = 10, MAX = 50 ;
        int rVal = (int) (Math.random() * (MAX-MIN+1) + MIN);

        System.out.println(rVal);

        /*
리터럴을 더이상 사용하지 않음
MIN, MAX 상수만 사용해
MIN~MAX로 나 올 수 있는 랜덤 숫자를 만드는 로직을 구현하시오
 */
    }
}
