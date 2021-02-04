import java.util.Scanner;
import java.util.Random;

public class Hand {
private static int currentscore;

public void setScore(int score){

    score = currentscore;

}

public static int useScore() {

    return currentscore;

}

public void toSmall(){
  
  System.out.println("It looks like the house had a hand  of 20 or more. You lose."); 
  System.out.println("");
  System.out.println("");

}

public void toBig(){
  
  System.out.println("WOW it looks like your hand is to large, you busted! You lose."); 
  System.out.println("");
  System.out.println("");

}

public void justRight(){
  
  System.out.println("Congratulations you beat the dealer! You win."); 
  System.out.println("");
  System.out.println("");

}


}
