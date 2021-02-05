import java.util.Scanner;
import java.util.Random;
//Class name and imports.
public class Intro {
Scanner scanner = new Scanner(System.in);

private int answer = 1;
static int no = 2;


//Using overloading to determine which text will play in what order when the game starts.
public void greeting(int num, double start){
  
  System.out.println("It looks like you want to be dealt in, is that true?");
  System.out.println("Enter '1' for yes and '2' for no");

}

public void greeting(int num){

  System.out.println("Now that you know what the game is like, how many times would you like to play again?");    

}

//This is where the logic of the code takes place for when you ask if you want to play the game or not. If you enter a '2' that means you don't want to play so the code will wait. Enter a '1' the code will move on, any other number it will ask you to try again.
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
          
          System.out.println("I am unsure what you mean by that, could you say that again?");
          System.out.println("");
          start = scanner.nextInt();
          
        }
        
      }

    }

}


