// Problem 2: given a number ‘n’, predict whether it is a power of two or not. [medium]
// Input 1: n = 15
// Output 1: False
// Input 2: n = 32
// Output 2: True

import javax.sound.sampled.SourceDataLine;

public class powerPredictor
{  static int n =15 ;
     static int m = 32;

    public static  boolean powerPredictor(int number)
    {
        if(number == 0)
        return false;
          if(number%2==0)
          {
            return true;
          }
          else return false;


    }
    public static void main(String agrs[])
    {
           System.out.println("Input n = 15 "+"      "+ "output =" + "  " +powerPredictor(n));
           System.out.println("Input m = 32" +"      "+ "output =" +"  "+ powerPredictor(m));
    }
}