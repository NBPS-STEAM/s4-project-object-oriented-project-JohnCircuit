import java.util.Scanner;
import java.util.Random;
//Class name and imports.
public class Hand {
private int currentScore;

//setter! This will take the value of the number that is created by the random number generator and store it so it can be called apon later on.
public int setScore(int score){

  currentScore = score;
  return score;

}
//getter! This is where the values that were being stored by the setter gets to be used and called with.
public int useScore() {

  return this.currentScore;

}
//When you lose to the dealer due to your card score being lower. This will be the text that will play in response.
public void toSmall(){
  
  System.out.println("It looks like the house had a hand of 20 or more. You lose."); 
  System.out.println("");
  System.out.println("");

}
//When you lose to the dealer due to your card score being to large. This will be the text that will play in response.
public void toBig(){
  
  System.out.println("WOW it looks like your hand is to large, you busted! You lose."); 
  System.out.println("");
  System.out.println("");

}
//When your card score is just right and win against the dealer this is the text that will play.
public void justRight(){
  
  System.out.println("Congratulations you beat the dealer! You win."); 
  System.out.println("");
  System.out.println("");

}


}
