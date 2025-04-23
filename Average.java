import java.util.Scanner;
	public class Average{
	public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter the first integer: ");
int no1 = input.nextInt();

System.out.print("Enter the second integer: ");
int no2 = input.nextInt();

int sum = no1 + no2;
System.out.printf("%d%n", sum);

int product = no1 * no2;
System.out.printf("%d%n", product);

int average = (no1 + no2) / 2;
System.out.printf("%d%n", average);

int distance = no1 - no2;
System.out.printf("%d%n", distance);
// for maximum
int max = 0;
int min = 0;

if (no1 > no2){
max = no1;
}
if (no2 > no1){
max = no2;
}
if (no1 < no2){
min = no1;
}
if (no2 < no1){
min = no2;
}

System.out.printf("The max is %d%n and the min is %d", max, min);




}

}