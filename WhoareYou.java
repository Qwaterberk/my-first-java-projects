import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter Your Level");
   String Level = sc.nextLine();
   System.out.println("You: "+Level);
   int playerLevel = Integer.parseInt(Level);
    if (playerLevel >= 100) {
      System.out.println("The Legend!");
    } else if (playerLevel >= 70) {
      System.out.println("Master");
    } else if (playerLevel >= 40) {
      System.out.println("PRO");
    } else if (playerLevel >= 20) {
      System.out.println("Beginner Player");
    } else if (playerLevel >= 10) {
      System.out.println("NOOB!");
    } else {
      System.out.println("NOTHING");
    }
      sc.close();
 }
}