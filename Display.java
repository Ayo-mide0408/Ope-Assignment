import java.util.Scanner;
	public class Display{
	public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter the first integer: ");
int no1 = input.nextInt();

System.out.print("Enter the second integer: ");
int no2 = input.nextInt();


int largest = 0;
int smallest = 0;

if (no1 < no2){
largest = no2;
}else largest = no1;
System.out.printf("The result is %d", largest);


}

}