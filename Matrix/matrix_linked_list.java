import java.util.Scanner;
class node_p
{
	node curr;
	node_p next;
	public node_p()
	{
		next=null;
		curr=null;
	}
}
class node9
{
	int data;
	node9 next;
	public node9(int data)
	{
		data=data;
		next=null;
	}
}
class linked_list_matrix
{
	public int row;
	public int column;
	public node_p head_p;
	public node_p p=head_p;
	public linked_list_matrix(int rows, int columns)
	{
		row=rows;
		column=columns;
		head_p=null;
	}
	public  void create_matrix()
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<row;i++)
		{
				node_p row_a=new node_p();
				if(head_p==null)
					head_p=row_a;
				else
					p.next=row_a;
				p=row_a;
				for(int j=0;j<column;j++)
				{
					System.out.println("Enter the Data");
					int data=sc.nextInt();
					node link1=new node(data);
						if(p.curr==null)
							p.curr=link1;
						else
						{
							node r=p.curr;
							while(r.next!=null)
								r=r.next;
							r.next=link1;
						}
				}
		}
	}
	public void insert_at_link(int data,int row_pos, int column_pos)
	{
		int ctr1=1;
		node_p r =head_p;
		while(ctr1<row_pos)
		{
			r=r.next;
			ctr1++;
		}
		node p=r.curr;
		for(int i=1;i<column_pos;i++)
		{
			p=p.next;
		}	
		p.data=data;
	}
	public void display()
	{
		node p;
		node_p r=head_p;
		for(int i=0;i<row;i++)
		{
			p=r.curr;
			for(int j=0;j<column;j++)
			{
				System.out.print(p.data+" ");
				p=p.next;
			}
			System.out.println();
			r=r.next;
		}
	}
}
public class question_5_6 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of rows and columns.");
		int rows=sc.nextInt();
		int columns=sc.nextInt();		
		linked_list_matrix ob1 = new linked_list_matrix(rows,columns); 
		System.out.println("1. Create Node");
		System.out.println("2. Insert Data at Co-Ordinates");
		System.out.println("3. Display List");
		int ch;
		ch=sc.nextInt();
		while(ch!=0)
		{
			switch(ch)
			{
				case 1:ob1.create_matrix();
					   break;
				case 2: System.out.println("Enter the Data, Row Position and Column Position.");
			 			int data=sc.nextInt();
			 			int row_pos=sc.nextInt();
			 			int col_pos=sc.nextInt();
			 			ob1.insert_at_link(data,row_pos,col_pos);
			 			break;
				case 3:ob1.display();
				   break;		   
			}
			System.out.println("\nEnter the choice");
			System.out.println("1. Create Node");
			System.out.println("2. Insert Data at Co-Ordinates");
			System.out.println("3. Display List");
			ch=sc.nextInt();
		}		
	}

}