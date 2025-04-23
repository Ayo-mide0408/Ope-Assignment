public class TabularOutput{
	public static void main(String[] args){


System.out.println("Number	N2	N3	N4");

 int count = 1;

for (count = 1; count <= 5; count++){
int num1 = (int) Math.pow(count, 2);

int num2 = (int) Math.pow(count, 3);

int num3 = (int) Math.pow(count, 4);



System.out.printf("%d\t%d\t%d\t%d%n", count, num1, num2, num3);

}






}


}