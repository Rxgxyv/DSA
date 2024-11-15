import java.util.Scanner;
public class Linkedlist {
    public boolean search(int ele,Node first){
        Node temp=first;
        while(temp.next!=null){
            if(temp.data==ele){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public void Display(Node first){
        Node temp = first;
        do {
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }while(temp.next!=null);
        System.out.println(temp.data);
    }
    public static void main(String[] args) {
        Node a=new Node();
        Node first=a;
        Node curr=a;
        Linkedlist ob=new Linkedlist();
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int ch;
        ch=1;
        while(ch<=7){
            System.out.println("____________________");
            System.out.println("Enter your choice:");
            System.out.println("1.ADD ELEMENT");
            System.out.println("2.INSERT AT FIRST");
            System.out.println("3.Display LinkedList");
            System.out.println("4.Insert at last");
            System.out.println("5.Search an Element");
            System.out.println("6.Delete an element");
            System.out.println("7.Reverse the element");
            System.out.println("____________________");
            ch=sc.nextInt();
            switch(ch){
                case 1:{
                    System.out.println("Enter the value to be added");
                    int d=sc.nextInt();
                    if(first.data==0){
                        first.data=d;
                    } 
                    else{
                        Node temp=new Node(d);
                        curr.next=temp;
                        curr=curr.next;
                    }
                    System.out.println("Element added successfully:");
                    break;
                }
                case 2:{
                    System.out.println("Enter the value to add at 1st:");
                    int k=sc.nextInt();
                    if(first.data==0) first.data=k;
                    else{
                        Node temp=new Node(k);
                        temp.next=first;
                        first=temp;
                    }System.out.println("*******Element added successfully*******");
                    ob.Display(first);
                    break;
                }
                case 3:{
                    ob.Display(first);
                    break;
                }
                case 4:{
                    System.out.println("Enter the value to add at last:");
                    int l=sc.nextInt();
                    if (first.data==0) {
                        first.data=l;
                    }else{
                        while(curr.next!=null){
                            curr=curr.next;
                        }
                        if (curr.next==null) {
                            Node temp=new Node(l);
                            curr.next=temp;
                            temp=curr;
                        }
                    }
                    System.out.println("*******Element added successfully*******");
                    ob.Display(first);
                    break;
                }
                case 5:{
                    System.out.println("||Enter the element you need to search:||");
                    int ele=sc.nextInt();
                    boolean res=ob.search(ele, first);
                    if(res!=true) System.out.println("*******Element not found*******");
                    else System.out.println("*******Element found successfully*******");
                    break;
                }
                case 6:{
                    System.out.println("||Enter the element you want to delete:||");
                    int dlt=sc.nextInt();
                    Node temp=first;
                    Node prev = new Node();
                    if(ob.search(dlt,first)){
                        if(temp.data==dlt){
                            first=first.next;
                            System.out.println("*******Deleted Successfully*******");
                            break;
                        }
                        while(temp.next!=null){
                            if(temp.data==dlt){
                                break;
                            }
                            prev = temp;
                            temp = temp.next;
                        }
                        prev.next=temp.next;
                        System.out.println("*******Deleted Succesfully*******");
                        System.out.println();
                        break;                        
                    }
                    else{
                        System.out.println("*******Not found*******");
                    }
                    ob.Display(first);
                    break;
                }
                case 7:{
                    Node temp;
                    Node prev=null;
                    while (first.next!=null){
                        temp=first.next;
                        first.next=prev;
                        prev=first;
                        first=temp;
                    }
                    first.next=prev;
                    System.out.println("After Reversing linked list:");
                    ob.Display(first);
                }
            }
        }
    }
    
}
//OGC