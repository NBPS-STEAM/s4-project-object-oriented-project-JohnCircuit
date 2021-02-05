import java.util.Scanner;
import java.util.Random;

public class Hand {
private int currentScore;
private int highScore;
//setter
public int setScore(int score){

  currentScore = score;
  return score;

}
//getter
public int useScore() {

  return currentScore;

}

public void toSmall(){
  
  System.out.println("It looks like the house had a hand  of 20 or more. You lose."); 
  System.out.println("");
  System.out.println("");
  highScore = 0;

}

public void toBig(){
  
  System.out.println("WOW it looks like your hand is to large, you busted! You lose."); 
  System.out.println("");
  System.out.println("");
  highScore = 0;

}

public void justRight(){
  
  System.out.println("Congratulations you beat the dealer! You win."); 
  System.out.println("");
  System.out.println("");
  highScore++;

}

public int bestScore() {

  return highScore;

}




}
