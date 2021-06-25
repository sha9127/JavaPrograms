import java.util.*;
class student {


public static void main(String [] args){

System.out.println("----------Welocome to JavaProgram to Print Pattern-------------");
System.out.println("Enter the value of Number to print Pattern: ");
Scanner s= new Scanner(System.in);
int c=s.nextInt();
int i,j;
for ( i=1;i<=c;i++)

{	for (j=c;j>=i;j--)
	{
		System.out.print("*");
	}
	System.out.println("\n");
}
}
}