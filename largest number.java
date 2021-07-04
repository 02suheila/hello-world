// largest nmber 'l' less than to given number,but doesn't contain same digit,otherwise print -1.
package p1;
public class Largest{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter numbers and digit");
int number = sc.nextInt();
int digit = sc.nextInt();
// converting digit to char
char c = Integer.toString(digit).charAt(0);
int i;
for(i=number;i>0;i--)
{
if(Integer.toString(i).indexOf(c)==1)
{
System.out.printl(i);
break;
}
}
if(i==0)
System.out.println(-1);
}
