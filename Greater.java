import java.util.Scanner;
	public class Greater{
	public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter the first integer: ");
int first = input.nextInt();

System.out.print("Enter the second integer: ");
int second = input.nextInt();


if (first > second){
int difference = first - second;
System.out.printf("The diff is %d", difference);
}
}

}