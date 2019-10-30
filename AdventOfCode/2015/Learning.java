import java.util.Scanner;

public class Learning{
    public static void main(String[] args) {
        Scanner kboard = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int choice = Integer.parseInt(kboard.nextLine());
        System.out.println(choice);
      switch(choice){
          case 1:
          case 2:
          System.out.println("Buckle my shoe");
          break;

          case 3:
          case 4:
          System.out.println("Shut the door");
          break;
          default:
          System.out.println("This not valid");



      }
    }
}