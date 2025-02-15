//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int checkTo = 333; // количество денег на счету клиента перед пополнением
        int money = 14_924; // количество денег для пополнения счета клиента
        int bonus; // бонусы клиента после пополнения
        int checkAfter; // количество денег на счету клиента после пополнения
        if (money >= 1000) {
            bonus = money / 100;
        } else {
            bonus = 0;
        }
        checkAfter = checkTo + money + bonus;
        System.out.println("Бонусов начислено " + bonus + ", Баланс счета " + checkAfter);
    }
}