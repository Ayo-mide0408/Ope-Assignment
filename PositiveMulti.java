import java.util.Scanner;
	public class PositiveMulti{
	public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter positive integer: ");
	int number = input.nextInt();

System.out.print("Multiplication table of: " + number);
	for(int count = 1; count <= 10; count++){
System.out.println(number + " x " + count + " = " + (number*count));

}






}


}