import java.util.*;
class student {


public static void main(String [] args){

System.out.println("----------Welocome to JavaProgram to Print Pattern-------------");
System.out.println("Enter the value of Number to print Pattern: ");
Scanner s= new Scanner(System.in);
int c=s.nextInt();
int i,j;
for ( i=1;i<=2*c;i++)

{	if (i<=c){
		for (j=1;j<=i;j++)
		{
	
			System.out.print("*");
		}
	System.out.print("\n");
		}
	else
		{
		
			for (j=c;j>i-c;j--)
		{
	
			System.out.print("*");
		}
	System.out.print("\n");
		}

}
}
}