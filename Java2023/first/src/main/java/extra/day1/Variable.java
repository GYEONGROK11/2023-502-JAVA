package extra.day1;

public class Variable {
    public static void main(String[] args) {
        int x = 10, y =50;
        System.out.printf("x : %d,y :%d\n",x,y);
        int tmp = x;
        x=y;
        y=tmp;
        System.out.printf("x : %d,y :%d\n",x,y);
    }
}
