import java.util.Scanner;
	public class ThreeInteger{
	public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter the first integer: ");
int firstNum = input.nextInt();

System.out.print("Enter the second integer: ");
int secondNum = input.nextInt();

System.out.print("Enter the third integer: ");
int thirdNum = input.nextInt();


if (secondNum > firstNum){
if (thirdNum > secondNum){
System.out.print(true);
}
}



}

}