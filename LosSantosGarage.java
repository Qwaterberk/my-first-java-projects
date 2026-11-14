import java.util.Scanner;

public class LosSantosGarage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==== ГАРАЖ ====");
        System.out.print("Введите имя: ");
        String name = sc.nextLine();
        if (name.equalsIgnoreCase("Any")) { // ВВЕДИ ЭТО ЖЕ ЗНАЧЕНИЕ В КОНСОЛЕ!!
            System.out.println("Добро пожаловать в личный гараж, босс!");
        } else {
            System.out.println("Ты лишь пешка в этом гараже!"); // ЕСЛИ ВВЕДЕШЬ НЕ ТО, ВЫЙДЕТ ЭТО СООБЩЕНИЕ!!
        }
        System.out.print("Введи номер машины. 1 - Спорткар. 2 - Мотоцикл. 3 - Броневик: ");
        int car = sc.nextInt();
        switch (car) {
            case 1 -> {
                System.out.println("Спорткар готов к выезду! Максимальная скорость 320 км/ч!");
                System.out.println("Удачной езды!");
            }
            case 2 -> {
                System.out.println("Мотоцикл готов к выезду! Максимальная скорость 280 км/ч");
                System.out.println("Удачной езды!");
            }
            case 3 -> {
                System.out.println("Броневик готов к выезду! Максимальная скорость 160 км/ч");
                System.out.println("Удачной езды!");
            }
            default -> System.out.println("Такой машины нет в гараже! Топай ножками.");
        }
        System.out.println("==== ПОКА! ====");
    }
}
