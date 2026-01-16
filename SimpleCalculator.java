public class SimpleCalculator {
 public static void main(String[] args) {
  int number1 = 10; // Ñşäà ïèøè çíà÷åíèÿ. Äî 2ìëğä!
  int number2 = 2; //  Ñşäà òîæå
  // ÍÈÆÅ ÍÅ ÒĞÎÃÀÒÜ!!
  int sum = number1 + number2;
  int difference = number1 - number2;
  int product = number1 * number2;
  int quotient = number1 / number2;
  int remaining = number1 % number2;
  System.out.println("==== SIMPLE CALCULATOR ====");
  System.out.println(number1 + "+" + number2 + "=" + sum);
  System.out.println(number1 + "-" + number2 + "=" + difference);
  System.out.println(number1 + "*" + number2 + "=" + product);
  System.out.println(number1 + "/" + number2 + "=" + (number1 / (double) number2));
  System.out.println(number1 + "%" + number2 + "=" + remaining);
  System.out.println("-----------------------------");
 }
}