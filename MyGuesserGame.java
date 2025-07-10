import java.util.Scanner;
class Guesser{
  int GuesserNum;
  public int GuesserNumb(){
    Scanner scan=new Scanner(System.in);
    System.out.println("Guesser Kindly Guess a number");
    GuesserNum=scan.nextInt();
    return GuesserNum;
  }
}
class Player{
  int PlayerNum;
  public int PlayerNumb(){
    Scanner scan=new Scanner(System.in);
    PlayerNum=scan.nextInt();
    return PlayerNum;
  }
}
class Umpire{
  int Guessernum;
  int Playernum1;
  int Playernum2;
  int Playernum3;

  public void CollectNumFromGuesser(){
    Guesser Gu= new Guesser();
    Guessernum=Gu.GuesserNumb();
  }
  public void CollectNumFromPlayers(){
  System.out.println("Player1 Kindly Guess a number");
   Player P1=new Player();
   Playernum1=P1.PlayerNumb();
   System.out.println("Player2 Kindly Guess a number");
   Player P2=new Player();
   Playernum2=P2.PlayerNumb();
   System.out.println("Player3 Kindly Guess a number");
   Player P3=new Player();
   Playernum3=P3.PlayerNumb();

  }
  public void Compare(){
    if(Guessernum==Playernum1){
      if(Guessernum==Playernum2 && Guessernum==Playernum3){
        System.out.println("All Players won the game");
      }
      else if(Guessernum==Playernum2){
        System.out.println("Player 1 and Player 2 won the game");
      }
      else if(Guessernum==Playernum3){
        System.out.println("Player 1 and Player 3 won the game");
      }
      else {
        System.out.println("Player 1 won the game");
      }
    }
    else if(Guessernum==Playernum2){
      if(Guessernum==Playernum3)System.out.println("Player 2 and Palyer 3 won the gane");
    
    else  System.out.println("Palyer 2 Won the game");}
    else if(Guessernum==Playernum3){
      System.out.println("player 3 won the game");
    }
    else { 
      System.out.println("All Player lost the game");
    }

  }
}

public class MyGuesserGame{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
  while(true){
    System.out.println("----------Game Stated---------");
    System.out.println();
    Umpire Um =new Umpire();
    Um.CollectNumFromGuesser();
    Um.CollectNumFromPlayers();
    Um.Compare();
    System.out.println();
    System.out.println("-------Game over---------");
    System.out.println();
    System.out.println("Do you want to exit? (y/n)");
    String choice=sc.next();
    if(choice.equalsIgnoreCase("y")){
      System.out.println("The Game is Exit");
      break;
    }
  }

  }
}