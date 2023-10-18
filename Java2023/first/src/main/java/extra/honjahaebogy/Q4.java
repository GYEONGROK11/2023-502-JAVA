package extra.honjahaebogy;

public class Q4 {
    public String kind;//속성
    public String number; //속성

    void printYourSelf() {
        System.out.printf("%s(%s)\n", kind, number);
    }
}

class Q4Test {
    public static void main(String[] args) {

        Q4[] cards = makeCard();
        for (Q4 c : cards) {
            c.printYourSelf();
        }
    }

    public static Q4[] makeCard() {
        Q4[] cards = new Q4[52];
        String[] kinds = {"Spade", "Heart", "Diamond", "club"};
        int cnt = 0;
        for (int i = 0; i < kinds.length; i++) {
            for (int z = 1; z <= 13; z++) {
                Q4 c = new Q4();
                String number = getNumberFromInt(z);
                c.kind = kinds[i];
                c.number = number;

                cards[cnt++] = c;
            }
        }
        return cards;
    }

    public static String getNumberFromInt(int num) {
        switch (num) {
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
        }
        return String.valueOf(num); //정수를 문자열로
    }

}
