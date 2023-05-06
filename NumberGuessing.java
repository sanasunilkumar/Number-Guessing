import java.util.*;

import javax.swing.*;

public class NumberGuessing
{
    public static void main(String[] args) 
    {
         int attempt =1;
         int guess=0 ,score=0;
         int computerNumber=(int)(Math.random()*100+1);
         while(guess != computerNumber)
         {
           String reply = JOptionPane.showInputDialog(null, "Guess a number between 1-100", "WELCOME TO GUESSING GAME", JOptionPane.PLAIN_MESSAGE);
 
           guess = Integer.parseInt(reply);
            JOptionPane.showMessageDialog(null,""+finding(guess,computerNumber,attempt));
            attempt++;
            if (attempt > 10) {
                JOptionPane.showMessageDialog(null, "You have exceeded the maximum number of attempts. Better luck next time!");
                System.exit(0);
         } 
    }
}
    public static String finding(int guess,int computerNumber,int attempt)
    {
        if(guess<=0 || guess >100) 
        {
            return "Your Guessing is Crossing the Limits";
        }  
        /*else if(attempt == 10)
        {
            return "You have Exceeded the Maximum number of attempts \n Better Luck next Time!";
        }*/
        else if(guess == computerNumber)
        {
            return "Congratulations Your Guess is correct \n Your Score is:"+(10-attempt+1);
        }
        else if(guess > computerNumber)
        {
            return "Your guess is greater than computerNumber \n attempt:"+attempt;
        }
        else if(guess < computerNumber)
        {
            return "Your guess is Less than computerNumber \n attempt:"+attempt;
        }
        else
        {
            return "Your guessing is incorrect";
        }
    }
}