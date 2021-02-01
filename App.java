import java.util.Scanner;
import java.util.Random;
//Imports that the code will use to call on.
public class App {
//The main class.
  static int hand;
  static int sum;
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Intro game = new Intro();
      
      System.out.println("It looks like you want to be dealt in, is that true?");
      System.out.println("Enter '1' for yes and '2' for no");
      
      int start = scanner.nextInt();
      System.out.println("");
      System.out.println("");
     
      
      while (start == game.getAnswer())
      {

        if (start == game.getAnswer())
        {
          System.out.println("Alright lets start!");
          System.out.println("");
          drawOrHold();
          System.out.println("Now that you know what the game is like, how many times would you like to play again?"); 
      
      
          int rerun = scanner.nextInt();
          int i = 0;
          while (i < rerun)
           {
          i++;
          drawOrHold();
          
      }

    }
        } 
        if (start == 2) 
        {
          
          System.out.println("Sorry I didn't quite get that.");
          System.out.println("");
          start = scanner.nextInt();
          
        }
        if(!(start == game.getAnswer()) && !(start == 2))
        {
          
          System.out.println("I don't understand.");
          System.out.println("");
          start = scanner.nextInt();
          
        }
      }











      


    public static void drawOrHold()
    {
      //It starts off by asking you how many cards you would like to draw, from there it will tell you if you won or not. Depending on what cards you get you will get a particular prompt.
      Scanner scanner = new Scanner(System.in);
      System.out.println("How many times would you like to draw?");
      int draw = scanner.nextInt();
      System.out.println("");
      System.out.println("");
      int hand = 0;
      
      if (draw >= 1)
      {
        for(int i = 1; i <= draw; i++)
    	{
        Random card = new Random();
		    int score;
        score = 1+card.nextInt(11);
        System.out.println(score);
        
        hand = hand + score;
        //This is how it will generate a random number and add it to your hand.
    	}
        //Down below is all the esponses to if you win or lose, if you are over 21 or under 20 then you lose, but if you are within the range you win!
        System.out.println(hand);
        if (hand < 20)
        {
          System.out.println("It looks like the house had a hand of 20 or more. You lose."); 
          System.out.println("");
          System.out.println("");
        }
        else if (hand > 21)
        {
          System.out.println("WOW it looks like your hand is to large, you busted! You lose."); 
          System.out.println("");
          System.out.println("");
        }
        else 
        {
          System.out.println("Congratulations you beat the dealer! You win."); 
          System.out.println("");
          System.out.println("");
        }

      }
      
      
      
    }
    


}









    

