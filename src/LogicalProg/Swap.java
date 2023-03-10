package	LogicalProg;
public	class	Swap	{
public	static	void	swap1()    // using 3rd variable
{
int	a	=	10,	b	=	20;
System.out.println("Before	Swapping");
System.out.println("A	=	"	+	a	+	"			"	+	"B	=	"	+	b);
int	c	=	a;
a	=	b;
b	=	c;
System.out.println("After	Swapping");
System.out.println("A	=	"	+	a	+	"			"	+	"B	=	"	+	b);
}
public	static	void	swap2()         // without using 3rd variable
{
int	a	=	10,	b	=	20;
System.out.println("Before	Swapping");
System.out.println("A	=	"	+	a	+	"			"	+	"B	=	"	+	b);
a	=	a	+	b;		//a	=	30
b	=	a	- b;		//b	=	30	- 20	=	10
a	=	a	- b;		//a	=	30	- 10	=	20
System.out.println("After	Swapping");
System.out.println("A	=	"	+	a	+	"			"	+	"B	=	"	+	b);
}
public	static	void	main(String[]	args)	{
swap2();
swap1();
}
}