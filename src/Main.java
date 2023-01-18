public class Main {
    public static void main(String[] args) {

        int balanceAmount = 200;
        int depositAmount = 1100;
        int total = balanceAmount + depositAmount;
        System.out.println(total);
        int percent;
        if (depositAmount > 1000) {
            percent = 1;
        } else {
            percent = 0;
        }
        int bonus = depositAmount / 100 * percent;
        System.out.println("Бонус:" + bonus);
    }
}