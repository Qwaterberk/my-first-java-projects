import java.util.Scanner;

public class HeistDispatcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите свой никнейм: ");
        String name = sc.nextLine();
        System.out.print("Введите свой уровень: ");
        int level = sc.nextInt();
        System.out.print("Введите кол-во денег на взнос за подготовку: ");
        int money = sc.nextInt();
        sc.nextLine();
        System.out.print("Введите секретный код (в ином случае напишите любой символ): ");
        String code = sc.nextLine();
        if (level >= 20 && (money >= 50000 || code.equalsIgnoreCase("LESER"))) {
            System.out.println("Вы допущены к ограблению!");
            System.out.print("Привет, " + name + "! " + "Выбери цель для ограбления (Введи цифру): 1. Ювелирный магазин (награда: 250.000$). 2. Центральный банк (награда: 1 200 000$). 3. Остров Кайо-Перико (награда: 1 800 000$): ");
            int mission = sc.nextInt();
            switch (mission) {
                case 1 -> {
                    System.out.println("Вы выбрали Ювелирный магазин!");
                    System.out.println("Куш: 250.000$. Команда собрана!");
                }
                case 2 -> {
                    System.out.println("Вы выбрали Центральный банк!");
                    System.out.println("Куш: 1.200.000$. Команда в боевой готовности!");
                }
                case 3 -> {
                    System.out.println("Вы выбрали остров Кайо-Перико!");
                    System.out.println("Куш: 1.800.000$. Команда готова к ограблению!");
                }
                default -> System.out.println("Такой миссии нет в базе Лестера! Пересмотри выбор.");
            }
        } else {
            System.out.println("Доступ запрещен! Нужен 20+ уровень и деньги на взнос или ключ от Лестера!");
        }
        if (name.equalsIgnoreCase("Bogdan")) {
            System.out.println("Примечание системы: Босс идет без комиссии Лестера!");
        }
    }
}
