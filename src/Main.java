
public class Main {
    public static void main(String[] args) {
        int start = 0;

        int plus = 1100;
        int bonus = 0;

        int balans;
        if (plus > 1000) {
            bonus = plus / 100;
            balans = start + plus + bonus;
        } else {
            balans = start + plus;
        }

        System.out.println(" Итоговый баланс: " + balans);
        System.out.println(" Бонусные рубли: " + bonus);


    }
}
