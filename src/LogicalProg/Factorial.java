package	LogicalProg;

import java.util.Scanner;

public	class	Factorial	{
public	static	void	main(String[]	args)	{
int	num ,fact	=	1;	

System.out.println("Enter a integer value");
Scanner s = new Scanner(System.in);
num = s.nextInt();

//5!	=	120		1	*	2	*	3	*	4	*	5	=	
for(int	i=1;i<=num;i++)			//i	=	6	6<=5		x
{
fact	=	fact	*	i;		//	fact =	24	*	5	=	120
}

System.out.println("Factorial	of	"+	num	+	"	=	"	+	fact);
}
}
