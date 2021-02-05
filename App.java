import java.util.Scanner;
import java.util.Random;
//Imports that the code will use to call on.
public class App { 
//The main class.
  static int hand;
  static int small = 20;
  static int big = 21;
  public static void main(String[] args) {
    //creation of a object using the Intro class.
    Intro game = new Intro();
    game.greeting(1,1.0);
    Scanner scanner = new Scanner(System.in);
      
    int start = scanner.nextInt();
    System.out.println("");
    System.out.println("");
    //It takes the user's answer to determine with logic what will happen next by using an object to call apon the code in a different class.
    game.Begin(start);
    
    drawOrHold();
    game.greeting(2);

    //When you want to play again or not. It will ask how many times you would like to do so. Once it replays that many times the code will end.
    int rerun = scanner.nextInt();
    int i = 0;
    while (i < rerun) 
      {
        hand = 0;
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
      
      Hand value = new Hand();
      if (draw >= 1)
      {
        for(int k = 1; k <= draw; k++)
    	  {
          //This is how it will generate a random number and add it to your hand.
          Random card = new Random();
		      int number;
          number = 1+card.nextInt(11);
          System.out.println(number);
          
          value.setScore(number);
          hand = hand + number;
          
    	  }
        //Down below is all the esponses to if you win or lose, if you are over 21 or under 20 then you lose, but if you are within the range you win!
        System.out.println(hand);
        value.setScore(hand);
        if (value.useScore() < small)
        {
          value.toSmall();
        }
        else if (value.useScore() > big)
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
