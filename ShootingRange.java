import java.util.Scanner;

public class ShootingRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==== ДОБРО ПОЖАЛОВАТЬ В НАШЕ СТРЕЛЬБИЩЕ! ====");
        int wallet = 1000;
        int ammunition = 0;
        int choice = -1;
        while (choice != 0) {
            System.out.print("Выбери что хочешь сделать: 1. Купить пачку патронов (30 штук за 250$). 2. Сделать очередь из 10 выстрелов: 3. Проверить инвентарь. 0. Выйти из тира: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    if (wallet >= 250) {
                        wallet -= 250;
                        ammunition += 30;
                        System.out.println("Успешная покупка! Добавлено 30 патронов, списано 250$.");
                    } else {
                        System.out.println("Недостаточно средств!");
                    }
                }
                case 2 -> {
                    if (ammunition >= 10) {
                        ammunition -= 10;
                        System.out.println("Тра-та-та! Очередь выпущена!");
                    } else {
                        System.out.println("Недостаточно патронов! Купите еще.");
                    }
                }
                case 3 -> System.out.println("В кошельке: " + wallet + "$." + " Патронов: " + ammunition + " шт.");
                case 0 -> System.out.println("Спасибо за посещение нашего стрельбища! Приходите еще.");
                default -> System.out.println("Данная команда не существует! Введите еще раз.");
            }
        }
    }
}
