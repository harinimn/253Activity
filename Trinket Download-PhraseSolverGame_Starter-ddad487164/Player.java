/*
 * Activity 2.5.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{
  /* your code here - attributes */
  private String name;
  private int score;
  private boolean winner;
  /* your code here - constructor(s) */ 
  public Player() {
    System.out.println("Please enter your name: ");
    Scanner sc = new Scanner(System.in);
    name = sc.nextLine();
    score = 0;
    winner = false;
  }
  /* your code here - accessor(s) */ 

  /* your code here - mutator(s) */ 
}