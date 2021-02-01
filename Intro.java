import java.util.Scanner;
import java.util.Random;

public class Intro {

String answer = "yes";


public String getAnswer(){
  
  return answer;

}
}






//Down below it is asking you a question, and depending on the result it will either loop or let you continue.
/*
public class Intro {
  public void start() {
      System.out.println("It looks like you want to be dealt in, is that true?");

        Scanner scanner = new Scanner(System.in);
      
      String start = scanner.nextLine();
      System.out.println("");
      System.out.println("");
      while (start.equalsIgnoreCase("yes"))
      {
        if (!start.equalsIgnoreCase("yes"))
        {
          
          System.out.println("Sorry I didn't quite get that.");
          System.out.println("");
          start = scanner.nextLine();
          
        }
        if (start.equals("yes") || start.equals("Yes"))
        {
          System.out.println("Alright lets start!");
          System.out.println("");
          break;
        } 
      }
  }
}
*/