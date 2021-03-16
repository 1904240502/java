package firstcode;

public class Sub {

public int a,b,c;
public double x1,x2;
public Sub(int A,int B,int C) 
{
	a=A;
	b=B;
	c=C;
	x1=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
	x2=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
}
public void show()
{
	System.out.println("x1="+x1+","+"x2="+x2);
}
}