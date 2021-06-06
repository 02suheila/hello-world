import java.io.*; 
import java.util.Scanner;
class Fibonacci
{
    public static void main (String[] args)
 {
     Scanner input=new Scanner(System.in);
    int n=input.nextInt();    
   
   int fibo[] = new int[2 * n + 1];
    fibo[0] = 0; 
    fibo[1] = 1;
    int sum = 0;
    for (int i = 2; i <= 2 * n; i++)
 {
        fibo[i] = fibo[i - 1] + fibo[i - 2];

     if (i % 2 == 0)
      {sum += fibo[i];}
  }
    System.out.println(" "+sum);
}
}
