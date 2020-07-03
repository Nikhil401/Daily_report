import java.util.Scanner;
public class Stack
{
	int top=-1;
	int max=100;
	int s[]=new int[max];
	void push(int item)
	{
		if(top>=max-1)
		{
			System.out.println("overflow");
		}
		else
			{
				s[++top]=item;
				
			}
		}
	void pop()
	{
		if(top==-1)
		{
			System.out.println("underflow");
		}
		else 
		{
			System.out.println( "popped element is: "+s[top--]);
			
		}
	}
	void display()
	{
		if(top==-1)
		{
			System.out.println("empty");
		}
			else
			{
				for(int i=0;i<=top;i++)
				
					System.out.println(s[i]+" ");
				
		     }
	}

	public static void main(String args[])
	{
		int q=1;
		Stack obj=new Stack();
		Scanner sc=new Scanner(System.in);
		System.out.println("program to perform the stack operation :");
		while(q!=0)
		{
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.display");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("enter the element to be pushed: ");
				int a=sc.nextInt();
				obj.push(a);
				break;
			case 2:
				obj.pop();
				break;
			case 3:
				System.out.println("stack element is: ");
				obj.display();
				break;
			default:
				System.out.println("enter valid choice");
			}
		}
	}
		
		
		}

