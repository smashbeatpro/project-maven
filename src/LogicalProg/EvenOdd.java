package	LogicalProg;
import	java.util.Scanner;
public	class	EvenOdd	{
public	static	void	main(String[]	args)	{
int	num;
// System.err.println("Enter	a	number");
System.out.println("Enter	a	number");
Scanner	a	=	new	Scanner(System.in);
num	=	a.nextInt();
//Concat
if(num%2==0)
{
System.out.println(num	+	"	is	even	num");
}
else
{
System.out.println(num	+	"	is	odd	num");
}
}
}
