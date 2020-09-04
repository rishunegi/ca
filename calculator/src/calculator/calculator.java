package calculator;
import java.util.Scanner;
public class calculator {
  public static void main(String args[]){
    Scanner in= new Scanner(System.in);
     
   System.out.println("WELCOME \n \n Here's a simple calculator coded by \n          ARYAN NEGI \n       using java language ");
  System.out.println("\n \n To start, enter :");
   
   System.out.println("\n +    for addition \n -    for substraction \n /    for division \n *    for multiplication \n a    for square \n b    for cube \n c    for power\n "); 
   while(true){//while is a statement used to loop
    char expression;
     expression=in.next().charAt(0);
    
  switch(expression)
   
   {
     case '+':
       System.out.println("you choose addition");
    System.out.println("\n now type any two numbers \n");
   int a,b,sum;
   System.out.println("enter the first number");
   a=in.nextInt();
   System.out.println("enter the second number");
   b=in.nextInt();
   sum=a+b;
   System.out.println("result is   " +sum);
   System.out.println("\n if you want to continue using calculator \nenter (+,-,*,/,a,b,c)");
   break;
   case '-':
     System.out.println("you chose substraction");
     System.out.println("\n now type any two numbers you want to subtract ");
   int c,d,sub;
   System.out.println("enter the bigger number");
   c=in.nextInt();
   System.out.println("enter the second number");
   d=in.nextInt();
   sub=c-d;
   System.out.println("result is   " +sub);
   System.out.println("\n if you want to continue using calculator \nenter (+,-,*,/,a,b,c)");
   break;
   case '*':
     System.out.println("you chose multiplication");
     System.out.println("\n now type any two numbers you want to multiply ");
   int e,f,mub;
   System.out.println("enter the first number");
   e=in.nextInt();
   System.out.println("enter the second number");
   f=in.nextInt();
   mub=e*f;
   System.out.println("result is   " +mub);
   System.out.println("\n if you want to continue using calculator \nenter (+,-,*,/,a,b,c)");
   break;
   case '/':
     System.out.println("you chose division");
   double g,h,div,r;
   System.out.println("enter the dividend");
   g=in.nextDouble();
   System.out.println("enter the divisor");
   h=in.nextDouble();
   div=g/h;
   r=g%h;
   System.out.println("result is   " +div+ " and the remainder is " +r);
   System.out.println("\n if you want to continue using calculator \nenter (+,-,*,/,a,b,c)");
   break;
   case 'a':
     System.out.println("you chose to find square of a number");
     System.out.println("\n now type the number \n ");
   int i,square;
   i=in.nextInt();
   square=i*i;
   System.out.println("the square of " +i+ " is " +square);
   System.out.println("\n if you want to continue using calculator \nenter (+,-,*,/,a,b,c)");
   break;
     case 'b':
       System.out.println("you chose to find cube of a number");
     System.out.println("\n now type the number \n");
   int j,cu;
   j=in.nextInt();
   cu=j*j*j;
   System.out.println("\n the cube of " +j+ " is " +cu);
   System.out.println("\n if you want to continue using calculator \nenter (+,-,*,/,a,b,c)");
   break;
   case 'c':
     System.out.println("\nyou chose power ");
     double k,l,power;
     System.out.println("enter base number");
     k=in.nextDouble();
     System.out.println("enter power");
     l=in.nextDouble();
     power=Math.pow(k,l);
     System.out.println("result is   " +power);
     System.out.println("\n if you want to continue using calculator \nenter (+,-,*,/,a,b,c)");
   break;
   default :
     System.out.println("do what u are told to do😡😡!! \n however, i have have set a default case🙂");
     System.out.println("\n if you want to continue using calculator \nenter (+,-,*,/,a,b,c)");
   }
   }
   
    }
    }
