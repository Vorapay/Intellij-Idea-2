//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int x = 333; // количество денег на счету клиента перед пополнением
        int y = 14_924; // количество денег для пополнения счета клиента
        int z; // бонусы клиента после пополнения
        int a; // количество денег на счету клиента после пополнения
        if (y >= 1000) {
            z = y/100;
        } else {
            z = 0;
        }
        a = x+y+z;
            System.out.println("Бонусов начислено " + z + ", Баланс счета " + a);
        }
    }