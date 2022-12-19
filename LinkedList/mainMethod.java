import java.util.*;
class mainMethod {
    public static void main(String[] args) 
    {
        int choice;
        try (Scanner sc = new Scanner (System.in)) {
            linkList head=new linkList();
            while(true)
            {
                System.out.println("1.Insert\n2.delete\n3.exit");
                choice=sc.nextInt();
                switch(choice)
                {
                    case 1:head.insert();
                            break;
                    case 2:head.delete();
                            break;
                    case 3:System.exit(0);
                    default:
                            System.out.println("Eneter a valid input");
                            break;
                }
                
            }
        }
    }
}
