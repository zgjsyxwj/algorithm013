package week04;

/**
 * 860. 柠檬水找零
 * 在柠檬水摊上，每一杯柠檬水的售价为 5 美元。
 * <p>
 * 顾客排队购买你的产品，（按账单 bills 支付的顺序）一次购买一杯。
 * <p>
 * 每位顾客只买一杯柠檬水，然后向你付 5 美元、10 美元或 20 美元。你必须给每个顾客正确找零，也就是说净交易是每位顾客向你支付 5 美元。
 * <p>
 * 注意，一开始你手头没有任何零钱。
 * <p>
 * 如果你能给每位顾客正确找零，返回 true ，否则返回 false 。
 */
public class LemonadeChange {

    public static void main(String[] args) {
        int[] coins1 = {5, 5, 5, 10, 20};
        int[] coins2 = {5, 5, 10};
        int[] coins3 = {10, 10};
        int[] coins4 = {5, 5, 10, 10, 20};

        System.out.println(new LemonadeChange().solution(coins1));
        System.out.println(new LemonadeChange().solution(coins2));
        System.out.println(new LemonadeChange().solution(coins3));
        System.out.println(new LemonadeChange().solution(coins4));
    }

    public boolean solution(int[] coins) {
        int five = 0, ten = 0;
        for (int coinValue : coins
        ) {
            if (coinValue == 5) {
                five++;
            } else if (coinValue == 10) {
                if (five == 0) {
                    return false;
                }
                if (five > 0) {
                    five--;
                    ten++;
                }
            } else {
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                } else if (five > 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
