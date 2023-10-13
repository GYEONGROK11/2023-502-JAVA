package extra.day1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //     리턴타입 메소드명(파라미터,매개변수)
        System.out.println(args.length);
        System.out.println(Arrays.toString(args));
        for (int i = 0; i < args.length; i++) {
            System.out.printf("args[%d] : %s\n",i,args[i]);
        }

        for (String a : args) {
            System.out.println(a);
        }
    }
}

class Util {

}