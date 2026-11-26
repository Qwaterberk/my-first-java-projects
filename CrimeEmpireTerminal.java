import java.util.Scanner;

public class CrimeEmpireTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 150000;
        String[] points = {"Клуб Малибу", "Таксопарк", "Типография", "Порт Вайс-Сити", "Автосалон"};
        int[] profit = {12000, 4500, 8000, 15000, 10000};
        boolean isRunning = true;
        // сам цикл
        while (isRunning) {
            System.out.println("==== ДОБРО ПОЖАЛОВАТЬ В ТЕРМИНАЛ ====");
            System.out.println("Баланс: " + balance + "$");
            System.out.print("Выберите: " + System.lineSeparator() + "1. Показать все точки и их доход. " + System.lineSeparator() + "2. Показать только элитные точки. " + System.lineSeparator() + "3. Собрать дневную выручку со всех точек. " + System.lineSeparator() + "4. Прокачать предприятие (цена улучшения — 20 000$, прибавка к доходу — +3 000$/день). " + System.lineSeparator() + "0. Выход из терминала: ");
            int num = sc.nextInt();
            // инструкция
            switch (num) {
                case 1 -> {
                    for (int i = 0; i < points.length; i++) {
                        System.out.println(i + 1 + ". Точка: " + points[i] + " | " + "Ежедневный доход: " + profit[i] + "$");
                    }
                }
                case 2 -> {
                    for (int b = 0; b < points.length; b++) {
                        if (profit[b] >= 10000) {
                            System.out.println("Точка: " + points[b] + ". Ежедневная прибыль: " + profit[b] + "$");
                        }
                    }
                }
                case 3 -> {
                    for (int g = 0; g < profit.length; g++) {
                        int dayTotal = 0;
                        dayTotal += profit[g];
                        balance += dayTotal;
                        System.out.println("Доход с точки: " + profit[g] + "$" + "! Ваш баланс: " + balance + "$");
                    }
                }
                case 4 -> {
                    System.out.println("Введите номер предприятия (1-5): ");
                    int number = sc.nextInt();
                    int index  = number -1;
                    if (number <= 0) {
                        System.out.println("Такого номера не существует!");
                    } else if (number > 5) {
                        System.out.println("Такого номера не существует!");
                    } else if (balance < 20000) {
                        System.out.println("На балансе не хватает средств!");
                    } else {
                        balance -= 20000;
                        profit[index] += 3000;
                        System.out.println("Точка: " + points[index] + " прокачена! Новый доход: " + profit[index] + "$/день");
                    }
                }
                case 0 -> {
                    System.out.println("Сеанс завершён. До встречи!");
                    isRunning = false;
                }
                default -> System.out.println("Неверная команда! Повторите попытку.");
            }
        }
    }
}
