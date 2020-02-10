import java.util.*;
public class DesignPrinciples 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers:");
int m=sc.nextInt();
int n=sc.nextInt();
System.out.println("Enter your choice:\n1:ADDITION\n2:SUBTRACTION\n3:MULTIPLICATION\n4:DIVISION");
int z=sc.nextInt();
calculator cc=new calculator();
cc.calculate(m,n,z);
}
}