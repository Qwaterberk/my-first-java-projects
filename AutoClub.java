import java.util.Scanner;

public class AutoClub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 3000;
        int levelTuning = 0;
        int victories = 0;
        int choice = -1;
        System.out.println("==== ДОБРО ПОЖАЛОВАТЬ В НАШ АВТОКЛУБ ====");
        while (choice != 0) {
            System.out.print("Выбери, что хочешь сделать: 1. Прокачать двигатель (+1 уровень тюнинга за 800$). 2. Провести тест-драйв на треке (бесплатно). 3.  Участвовать в нелегальном драг-рейсинге (взнос 500$). 4. Посмотреть профиль гонщика. 0. Покинуть автоклуб.: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    if (balance >= 800 && levelTuning < 5) {
                        balance -= 800;
                        levelTuning++;
                        System.out.println("Двигатель прокачен! Текущий уровень: " + levelTuning + " из 5.");
                    } else {
                        System.out.println("НЕДОСТУПНО! Либо нет денег, либо тачка уже прокачена до максимума.");
                    }
                }
                case 2 -> {
                    for (int circle = 1; circle <= 4; circle++) {
                        System.out.println("Круг № " + circle + " пройден!");
                        if (circle == 4) {
                            System.out.println("Финишная черта пересечена! Отличный заезд!");
                        }
                    }
                }
                case 3 -> {
                    if (balance >= 500) {
                        balance -= 500;
                        for (int num = 3; num >= 1; num--) {
                            System.out.println("До старта: " + num);
                        }
                        if (levelTuning >= 3) {
                            balance += 1200;
                            victories++;
                            System.out.println("Поздравляем, вы выиграли! На баланс начислено 1200$.");
                        } else {
                            System.out.println("Тачка слишком медленная! Твой взнос сгорел.");
                        }
                    } else {
                        System.out.println("Денег недостаточно для взноса!");
                    }
                }
                case 4 -> System.out.println("Ваш баланс: " + balance + "$" + ". Уровень тюнинга: " + levelTuning + ". Колличество побед: " + victories);
                case 0 -> System.out.println("ДО СКОРОЙ ВСТРЕЧИ В НАШЕМ АВТОКЛУБЕ!");
                default -> System.out.println("Такого пункта в меню нет. Введи еще раз!");
            }
        }
        sc.close();
    }
}
