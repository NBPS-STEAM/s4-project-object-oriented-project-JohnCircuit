import java.util.Scanner;
import java.util.Random;
//Imports that the code will use to call on.
public class App {
//The main class.
  static int hand;

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Intro game = new Intro();
      
      game.greeting();
      
      int start = scanner.nextInt();
      System.out.println("");
      System.out.println("");
      
      game.Begin(start);
      
      drawOrHold();
      game.replay();

      int rerun = scanner.nextInt();
      int i = 1;
      while (i < rerun)
        {
        drawOrHold();
        rerun--;
        }

    }

    static void drawOrHold()
    {
     
      Scanner scanner = new Scanner(System.in);
      System.out.println("How many times would you like to draw?");
      int draw = scanner.nextInt();
      System.out.println("");
      System.out.println("");
      int hand = 0;
      Hand value = new Hand();
      if (draw >= 1)
      {
        for(int i = 1; i <= draw; i++)
    	{
        Random card = new Random();
		    int score;
        score = 1+card.nextInt(11);
        System.out.println(score);
        
        hand = hand + value.setScore(score);
        //This is how it will generate a random number and add it to your hand.
    	}
        //Down below is all the esponses to if you win or lose, if you are over 21 or under 20 then you lose, but if you are within the range you win!
        System.out.println(value.useScore());
        if (hand < 20)
        {
          value.toSmall();
        }
        else if (value.useScore() > 21)
        {
          value.toBig();
        }
        else 
        {
          value.justRight();
        }
          
      }
      
    }

}









    

