/* Date: Mar 2, 2018
 * Name: Yvette Xie
 * Teacher: Mr.Chu
 * Description: This program is a game called Clacker aiming to cover all the 12 numbers displayed in the fewest rolls.
 */

package clacker;
import java.util.Scanner;
import java.util.Random;

public class Clacker{
  public static void main(String args[]){
    
    
    Scanner sc = new Scanner(System.in);
    Random random= new Random ();
    String username;//variable declaration
    String start;
    double best = Double.POSITIVE_INFINITY;
    //The best socre is set to positive infinity so that the first score can be the best score for later rounds
    double score = 0;
    int random1;
    int random2;
    int n1=1;
    int n2=2;
    int n3=3;
    int n4=4;
    int n5=5;
    int n6=6;
    int n7=7;
    int n8=8;
    int n9=9;
    int n10=10;
    int n11=11;
    int n12=12;
    int sum;
    String playagain;
    
    do{//Starting the game first without any condition
      
      System.out.println ("Enter the player's name.");//ask for user's name
      username = sc.nextLine();
      
      System.out.println ("Enter 0 if the player decides the numbers to cover.");//give the user options to decide 
      System.out.println ("Enter 1 if the computer decides the numbers to cover.");
      int decision1 = sc.nextInt();//collect the user's input
      System.out.println ("When the number is covered,it will be displayed as '0'");//Tells the player that "0" means covered number
      sc.nextLine();
      
      do{//Start to throw the dice after player's name has been collected
      

        System.out.println ("Press 's' to throw the dice");//The user tells the computer when to throw the dice
        
        start = sc.nextLine();
        if (start.equals("s")){//The computer would only generate the random numbers when the player press "s"
          random1 = random.nextInt(6)+1; //randomly generates 2 number from 1-6
          random2 = random.nextInt(6)+1;
          sum = random1+random2;//calculate the sum of these two numbers
          System.out.println ("You got " + random1 + " and " + random2);//tells the player what the numbers are
        
          
          if (decision1 == 1){//when the user wants to let the computer decide
            if (random1 !=n1 && random1 !=n2 && random1 !=n3 && random1 !=n4 && random1 !=n5 && random1 !=n6 && random2 !=n1 && random2 !=n2 && random2 !=n3 && random2 !=n4 && random2 !=n5 && random2 !=n6) {
              /*This section compares the random numbers with number 1 to 6. 
                In the section after, number covered is shown as 0. Therefore, 
                if none of the random numbers equal to any number between 1 to 6
                it means that both numbers are covered and now the sum should be
                covered. The sum is compared with 2,the smallest possible sum,
                and all the way to 12, the largest possible sum. If the sum equals to
                one of the numbers, that number will be set to 0 to indicate 
                that it is covered up. In this way, the program will always cover
                the individual numbers first and then the sum if needed.
               */
                if (sum == n2){
                n2 = 0;
              } 
              else if (sum == n3){
                n3= 0;
              }
              else if (sum == n4){
                n4=0; 
              } 
              else if (sum == n5){
                n5=0; 
              }else if (sum == n6){
                n6=0; 
              } else if (sum == n7){
                n7=0; 
              }else if (sum == n8){
                n8=0; 
              } else if (sum == n9){
                n9=0; 
              }else if (sum == n10){
                n10=0; 
              }else if (sum == n11){
                n11=0; 
              }else if (sum == n12){
                n12=0; 
              }
              System.out.println (n1+ " " + n2+ " " +n3 + " " +n4 + " " +n5+ " " +n6+ " " + n7+ " " + n8+ " " +n9+ " " + n10+ " " +n11+ " " + n12);
              //display of curret roll
              score ++;//score accumulates
            } else {
                /*When either or both of the random numbers are not covered,
                the program compares the numbers with each number from 1 to 6.
                If the random number equals to any of these numbers, that number
                will be set to 0 to show that it is covered.
                */
              if (random1 == n1){
                n1 = 0;
              } else if (random1 == n2){
                n2= 0;
              } else if (random1 == n3){
                n3 = 0;
              }else if (random1 == n4){
                n4=0; 
              } else if (random1 == n5){
                n5=0; 
              }else if (random1 == n6){
                n6=0; 
              }
              
              
              if (random2 == n1){
                n1 = 0;
              } else if (random2 == n2){
                n2=0;
              } else if (random2 == n3){
                n3 = 0;
              } else if (random2 == n4){
                n4=0; 
              }else if (random2 == n5){
                n5=0; 
              }else if (random2 == n6){
                n6=0; 
              }
              
              
              System.out.println (n1+ " " + n2+ " " +n3 + " " +n4 + " " +n5+ " " +n6+ " " + n7+ " " + n8+ " " +n9+ " " + n10+ " " +n11+ " " + n12);
              //display of current roll
              score ++;//scofe accumulates
            } 
            
          } else if (decision1 == 0){//when the user wants to choose by themselves
            System.out.println ("Enter 0 if you want to cover the individual numbers you got.");
            System.out.println ("Enter 1 if you want cover the sum of the numbers.");
            //player selects the numbers to be covered
            int decision2 = sc.nextInt();
            sc.nextLine();
            
            if (decision2 == 0){//when the user chooses to cover the individual numbers
              /* This section of the code compares both number with each of the six numbers
                on a dice. If the random numbers equal to any of them, the numbers on the list will be
                set to 0 to show that they are covered up.
                */
              if (random1 == n1){
                n1 = 0;
              } else if (random1 == n2){
                n2=0;
              } else if (random1 == n3){
                n3 = 0;
              }else if (random1 == n4){
                n4=0; 
              } else if (random1 == n5){
                n5=0; 
              }else if (random1 == n6){
                n6=0; 
              }
              
              
              if (random2 == n1){
                n1 = 0;
              } else if (random2 == n2) {
                n2=0;
              } else if (random2 == n3){
                n3 = 0;
              }else if (random2 == n4){
                n4=0; 
              }else if (random2 == n5){
                n5=0; 
              }else if (random2 == n6){
                n6=0; 
              }
              
              System.out.println (n1+ " " + n2+ " " +n3 + " " +n4 + " " +n5+ " " +n6+ " " + n7+ " " + n8+ " " +n9+ " " + n10+ " " +n11+ " " + n12);
              score ++;//score acculates
              
            } else if (decision2 == 1){//when the user chooses to cover the sum
              if (sum < 7){
                  /* The sum can only be covered when it is between 7 and 12, so
                  if the sum is less than 7,the program will tell the player and 
                  proceeds as if the player chose to cover the individual numbers.
                  */
                System.out.println ("Only individual numbers will be covered if the sum is less than 7");
                if (random1 == n1){
                  n1 = 0;
                } else if (random1 == n2){
                  n2=0;
                } else if (random1 == n3){
                  n3 = 0;
                }else if (random1 == n4){
                  n4=0; 
                } else if (random1 == n5){
                  n5=0; 
                }else if (random1 == n6){
                  n6=0; 
                }
                
                
                if (random2 == n1){
                  n1 = 0;
                } else if (random2 == n2){
                  n2=0;
                } else if (random2 == n3){
                  n3 = 0;
                }else if (random2 == n4){
                  n4=0; 
                }else if (random2 == n5){
                  n5=0; 
                }else if (random2 == n6){
                  n6=0; 
                }
                
                
                System.out.println (n1+ " " + n2+ " " +n3 + " " +n4 + " " +n5+ " " +n6+ " " + n7+ " " + n8+ " " +n9+ " " + n10+ " " +n11+ " " + n12);//display of current roll
                score ++;//score acculutes
              } 
              else if (sum > 7){
                /* Only when the sum is greater than 7, the program compares 
                  the sum to each number between 7 and 12. If the sum equals to
                  one of the numbers, that number will be set to 0 to indicate 
                  that it is covered up.
                  */
                if (sum == n7){
                  n7 = 0;
                } else if (sum == n8){
                  n8=0;
                } else if (sum == n9){
                  n9 = 0;
                }else if (sum == n10){
                  n10=0; 
                }else if (sum == n11){
                  n11=0; 
                }else if (sum == n12){
                  n12=0; 
                }
                System.out.println (n1+ " " + n2+ " " +n3 + " " +n4 + " " +n5+ " " +n6+ " " + n7+ " " + n8+ " " +n9+ " " + n10+ " " +n11+ " " + n12);//display of current roll
                score ++;//score accumulates
              }//end of selection in which the sum is greater than 7
            }//end of section where the player decides to cover the sum
          }//end of section where the player decides which number to cover by themselves
          
          else {//If the user enters anything other than "s", it is invalid and the user have to enter again
            System.out.println("Invalid input. Please enter again.");
          }
        }//end of one roll
        
        else {//If the user enters anything other than 0 or 1, it is invalid and the user have to enter again
          System.out.println("Invalid input. Please enter again.");
        } 
      } while (n1 != 0 || n2 != 0 || n3 != 0 || n4 != 0 || n5 != 0 || n6 != 0 || n7 != 0 || n8 != 0 || n9 != 0 || n10 != 0 || n11 != 0 || n12 != 0);
        // the round ends when all numbers are covered (equals to 0)
      
      if (score < best) {//if the score in this round is lower tham the best score, it becomes the best score
        best = score;
      } else {//if not, the best score remains the same
      }        
      System.out.println ("**************************************************" );//beginning of scoreboard
      System.out.println ("The score to beat is: " + best);//showing the lowest score of the game
      System.out.println ( username + "'s score is: " + score);//showing the user's score in this game
      System.out.println ("Do you want to play again?");//ask the player if they want to play again
      playagain = sc.nextLine();
      score = 0;//reset the value of score and numbers so the next round can be executed
      n1=1;
      n2=2;
      n3=3;
      n4=4;
      n5=5;
      n6=6;
      n7=7;
      n8=8;
      n9=9;
      n10=10;
      n11=11;
      n12=12;
    } while (playagain.equalsIgnoreCase ("yes"));//the loop only continues if the user says "yes"
    
    System.out.println ("The game is over.");//end the game if the user does not to play again
    
  }//main method
}//end of class



