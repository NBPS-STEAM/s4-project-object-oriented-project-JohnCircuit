import java.util.Scanner;
import java.util.Random;

public class Intro {
Scanner scanner = new Scanner(System.in);
//int start = scanner.nextInt();
private int answer = 1;
static int no = 2;



public void greeting(){
  
  System.out.println("It looks like you want to be dealt in, is that true?");
  System.out.println("Enter '1' for yes and '2' for no");

}

public void replay(){

  System.out.println("Now that you know what the game is like, how many times would you like to play again?");    

}

public void Begin(int start){
  while (start != answer)
      {

        if (start == answer)
        {
          System.out.println("Alright lets start!");
          System.out.println("");
          
          
        } 
        if (start == no)
        {
          
          System.out.println("Thats okay, let me know when you are ready!");
          System.out.println("");
          start = scanner.nextInt();
          
        }
        else 
        {
          
          System.out.println("what?");
          System.out.println("");
          start = scanner.nextInt();
          
        }
        
      }

    }

}


