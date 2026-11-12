import java.util.Scanner;

public class AmmuNationShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = 5000;
        System.out.print("Привет! Твой баланс: " + money + "$");
        System.out.print(". Выбери что купить: 1 - Бронежилет(1000$). 2 - Штурмовая винтовка(3500$). 3 - Ракетница RPG(5000$): ");
        int weapon = sc.nextInt();
        switch (weapon) {
            case 1 -> {
                System.out.println("Ты купил бронежилет. С тобой приятно иметь дело!");
                money -= 1000;
                System.out.println("Остаток средств: " + money + "$");
            }
            case 2 -> {
                System.out.println("Ты купил штурмовую винтовку. С тобой приятно иметь дело!");
                money -= 3500;
                System.out.println("Остаток средств: " + money + "$");
            }
            case 3 -> {
                System.out.println("Ты купил Ракетницу RPG. С тобой приятно иметь дело!");
                money -= 5000;
                System.out.println("Остаток средств: " + money + "$");
            }
            default -> {
                System.out.println("Такого товара в магазин не завезли пока что!");
                System.out.println("Баланс не был изменен.");
            }
        }
        if (money <= 0) {
            System.out.println("Ты все бабки потратил!");
        }
    }
}
