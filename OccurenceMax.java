import java.util.Scanner;
	public class OccurenceMax{
	public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the integer: ");
	int num = input.nextInt();
	int count = 1;
	int sentiel = -1;
	int max = 0; 

	
while (num != sentiel){
	if (num > max){
	max = num;
	count = 1;
	
       }
	else if (num == max){
	  count += 1;
       }
num = input.nextInt();
}
System.out.println("The largest number: " + max);
System.out.println("Occurence: " + count);







}


}