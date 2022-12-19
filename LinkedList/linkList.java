import java.util.*;
class node
{
    int data;
    node next;
    node()
    {
        next=null;
    }
    node(int ele)
    {
        data=ele;
        next=null;
    }
}
public class linkList
{
    Scanner sc =new Scanner(System.in);
    node list=null;
    public void insert()
    {
        int ele,choice;
        while(true){
        System.out.println("1.InsertAtBegin\n2.InsertATPos\n3.InsertAtEnd\n4.exit");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:System.out.println("Enter element");
                    ele=sc.nextInt();
                    insertAtBegin(ele);
                    break;
            case 2:System.out.println("Enter element");
                    ele=sc.nextInt();
                    System.out.print("Enter position");                    
                    int pos=sc.nextInt();
                    insertAtPos(ele, pos);
                    break;
            case 3:System.out.println("Enter element");
                    ele=sc.nextInt();
                    insertAtEnd(ele);
                    break;
            case 4:return;
            default:System.out.println("Invalid input");
                        break;
        }}
    }
    private void insertAtBegin(int ele)
    {
        node newnode =new node(ele);
        if(list==null)
        {
            list=newnode;
        }
        else{
            newnode.next=list;
            list=newnode;
        }
        traverse();
    }
    private void insertAtEnd(int ele)
    {
        node newnode =new node(ele);
        if(list==null)
        {
            list=newnode;
        }
        else
        {
            node ptr=list;
            while(ptr.next!=null)
            {
                ptr=ptr.next;
            }
            ptr.next=newnode;
        }
        traverse();
    }
    private void insertAtPos(int ele,int pos)
    {
        if(pos==1)
        {
            insertAtBegin(ele);
        }
        else
        {    
            node newnode =new node(ele);
            int i=0;
            node ptr=list;
            while(ptr!=null)
            {
                i++;
                if(i==pos-1)
                {
                    newnode.next=ptr.next;
                    ptr.next=newnode;
                    break;
                }
                ptr=ptr.next; 
            }
            if(pos>i || pos<1)
            {
                System.out.println("Position Not Found");
            }
        }
        traverse();
    }
    public void traverse()
    {
        node ptr=list;
        while(ptr!=null)
        {
            System.out.print(ptr.data+"->");
            ptr=ptr.next;
        }
        System.out.println("null");
    }
    public void delete()
    {
        //int ch;
        System.out.println("1.DeleteStartNode\n2.DeleteAtEnd\n3.deleteAtPosition\n");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:if(list!=null)
                   list=list.next;
                    break;
            case 2:deleteAtEnd();
                    break;
            case 3:System.out.println("Enter Position");
                    int pos =sc.nextInt();
                    deleteAtPosition(pos);
                    break;
            default:System.out.println("Inavlid input");
                    break;                 
        }
        traverse();
    }
    private void deleteAtPosition(int ele) {

    }
    private void deleteAtEnd() {
        if(list==null|| list.next==null)
        {
            list=null;
        }
        else
        {
            node ptr=list;
            while(ptr.next.next!=null)
            {
                ptr=ptr.next;
            }
            ptr=null;
        }
    }
    
}