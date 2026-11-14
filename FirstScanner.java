// ЭТОТ КОД ВООБЩЕ НЕ ТРОГАЙ!!!
import java.util.Scanner;

public class FirstScanner {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Введите своё имя: ");
  String name = sc.nextLine();
  System.out.println("Введите свой возраст: ");
  int age = sc.nextInt();
  System.out.println("Name: "+name);
  System.out.println("Age: "+age);
 }
}
