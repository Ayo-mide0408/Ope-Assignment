import java.util.Scanner;
	public class Product2{
	public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter the first integer: ");
int first = input.nextInt();

System.out.print("Enter the second integer: ");
int second = input.nextInt();

int product = first * second;

System.out.printf("%d", product);

}

}