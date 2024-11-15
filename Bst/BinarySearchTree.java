import java.util.Scanner;
public class BinarySearchTree {
    public Node insert(Node node, int val){
        if(node==null){
            Node n=new Node(val);
            return n;
        }
        if(val<node.val){
            node.lefNode=insert(node.lefNode,val);
        }
        else if(val>node.val){
            node.righNode=insert(node.righNode,val);
        }
        return node;
    }
    public void inorder(Node root){
        if(root==null) return;
        else{
            inorder(root.lefNode);
            System.out.print(root.val+" ");
            inorder(root.righNode);
        }
    }
    public Node search(Node root,int val){
        if(root==null||root.val==val) return root;
        if(root.val < val)
            return search(root.righNode,val);
        else 
            return search(root.lefNode,val);
    }
    public void PostOrderTraversal (Node root){
        if(root==null) return;
        PostOrderTraversal(root.lefNode);
        PostOrderTraversal(root.righNode);
        System.out.print(root.val+ " ");
    }
    public void PreOrderTraversal(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        PreOrderTraversal(root.lefNode);
        PreOrderTraversal(root.righNode);

    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        BinarySearchTree tree = new BinarySearchTree();
        Node root = null;
        int ch=1;
        while(ch<5){
            System.out.println("1 Insert element ");
            System.out.println("2 Search Element");
            System.out.println("3 Display");
            System.out.println("4 PostOrderTraversal");
            System.out.println("5 PreOrderTraversal");
            System.out.println("6 EXIT");
            ch=sc.nextInt();
            switch (ch) {
                case 1:{
                    System.out.println("///enter the element you need to insert");
                    int ele=sc.nextInt();
                    root = tree.insert(root, ele);
                    tree.inorder(root);
                    //System.out.println(ans);
                    break;
                }
                case 2:{
                    System.out.println("///enter the element you need to search");
                    int ele=sc.nextInt();
                    Node ans=tree.search(root, ele);
                    if (ans==null) {
                        System.out.println("Not Found");
                    }
                    else System.out.println("Found");
                }
                case 3:{
                    tree.inorder(root);
                    break;
                }
                case 4:{
                    tree.PostOrderTraversal(root);
                    break;
                }
                case 5:{
                    tree.PreOrderTraversal(root);
                    break;
                }
                default:
                    break;
            }
        }
        
       

            
        }
        
}
/* 
class Node{
    int val;
    Node lefNode;
    Node righNode;
    Node(){
        val=0;
        lefNode=null;
        righNode=null;
    }
    Node(int item){
        val=item;
        lefNode=righNode=null;
    }
}*/

