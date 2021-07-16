class DemoMultiply
{
int addTwoNumbers(int a , int b)
{
 int result;
 result=a+b;
 return result;

}

public static void main(String args[])
{
int sum=0;
System.out.println("Happy Coding");

DemoMultiply obj = new DemoMultiply();
 
sum=obj.addTwoNumbers(8,9);
System.out.println("The sum of 2 numbers is "+sum);

}
}