import java.util.*;
class student {


public static void main(String [] args){

System.out.println("----------Welocome to JavaProgram to Print Pattern-------------");
System.out.println("Enter the value of Number to print Pattern: ");
Scanner s= new Scanner(System.in);
int c=s.nextInt();
for (int i=1;i<=c;i++)
{
		for (int j=1;j<=i;j++)
		{
			System.out.print(j);
		}
	System.out.print("\n");
}




}

}