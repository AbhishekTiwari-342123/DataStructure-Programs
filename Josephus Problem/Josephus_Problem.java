import java.util.Scanner;
class node3{
	public int data;
	public node3 next;
	
	public node3(int item)
	{
		data=item;
		next=null;
	}
}
class link_list7{ 
	private node3 current;
	private node3 kill;
	public int skip;
	public int pos;
	Scanner sc=new Scanner(System.in);
	public link_list7()
	{
		current=null;
	}
	public void create_node()
	{
		System.out.println("Do you want to insert a person ? (1/0)");
		int ch;
		ch=sc.nextInt();
		while(ch==1)
		{
			System.out.println("Enter the person number.");
			int data=sc.nextInt();
			node3 link1=new node3(data);
			node3 p;
		if(current==null){
			kill=link1;
			current=link1;
			current.next=current;
			}
		else
		{
			link1.next=current.next;
			current.next=link1;
			current=link1;
		}
	
		System.out.println("Do you want to insert a person ? (1/0)");
		ch=sc.nextInt();
		}
	}
	public void start_from(int pos)
	{
		int ctr=1;
		node3 p=kill;
		while(ctr<pos)
		{
			p=p.next;
			ctr++;
		}
		kill=p;
	}
	public void delete(int skip)
	{
		node3 p=kill;
		node3 q=kill;
		int ctr=1;
		while(ctr<=skip)
		{
			q=p;
			p=p.next;
			ctr++;
		}
		q.next=p.next;
		kill=p.next;
	}
	public void display()
	{
		node3 p=kill;
		while(kill!=p.next)
		{
			System.out.print(p.data+" ");
			p=p.next;
		}
		System.out.print(p.data+" ");
	}
	}
public class question_5_5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		link_list7 ob1 =new link_list7();
		int begin=0;
		int skip=0;
		System.out.println("\nEnter the choice");
		System.out.println("1. Insert Person");
		System.out.println("2. Start Killing");
		System.out.println("3. Display Persons");
		int ch;
		ch=sc.nextInt();
		while(ch!=0)
		{
			switch(ch)
			{
				case 1:ob1.create_node();
					   break;
				case 2:	if(begin==0)
						{
						System.out.println("Enter the position you want to Begin with and the counting off parameter. ");
						begin=sc.nextInt();
						ob1.start_from(begin);
						skip=sc.nextInt();
						}
						ob1.delete(skip);
				   	   	break;
				case 3:ob1.display();	    
			}
			System.out.println("\n1. Insert Person");
			System.out.println("2. Start Killing");
			System.out.println("3. Display Persons");
			ch=sc.nextInt();
		}		
	}

}