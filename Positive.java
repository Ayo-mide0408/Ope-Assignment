import java.util.Scanner;
	public class Positive{
	public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter the first integer: ");
int num1 = input.nextInt();

System.out.print("Enter the second integer: ");
int num2 = input.nextInt();

if(num1 > 0 && num2 > 0 || num1 < 0 && num2 < 0){
int product = num1 * num2;
 
System.out.printf("The product is %d%n", product);
}else{
System.out.printf("The sum is %d", (num1 + num2));

}



}

}