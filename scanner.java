
/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
class customer
{
String cust_id,cust_name,add;
float bal;
Scanner sc=new Scanner(System.in);
public void main()
{
System.out.println("enter id,name,balance,amount");
cust_id=sc.nextLine();
cust_name=sc.nextLine();
bal=sc.nextFloat();
sc.nextLine();
add=sc.nextLine();
}
public void show_details()
{
System.out.println("customer details are:");
System.out.println("id:"+cust_id);
System.out.println("NAME:"+cust_name);
System.out.println("BALANCE:"+bal);
System.out.println("ADDRESS:"+add);
}
}
