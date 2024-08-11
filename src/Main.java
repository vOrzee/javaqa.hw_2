import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной мили

        // Рассчитываете количество бонусных миль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран

        // Вариант 1:
        int amount = 5389;
        int ratioBonus = 20;

        int miles = amount / ratioBonus;

        System.out.println("Начислено бонусных миль: " + miles);

        // Вариант 2:
        int amount2 = 433436;
        double ratioBonus2 = 0.05;

        int miles2 = (int) (amount2 * ratioBonus2);

        System.out.println("Начислено бонусных миль: " + miles2);

        // Вариант 3:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму билетов: ");
        int amount3 = (int) scanner.nextDouble();
        double ratioBonus3 = 0.05;
        scanner.close();

        int miles3 = (int) (amount3 * ratioBonus3);

        System.out.println("Начислено бонусных миль: " + miles3);
    }
}