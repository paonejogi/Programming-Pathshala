 
class Node{

    int key;
    Node left;
    Node right;
    Node(int k){
        key = k;
         
    }
}


public class Tree {

    public static void printTree(Node root){
         if(root != null){
            printTree(root.left);
            System.out.println(root.key + " ");
            printTree(root.right);
         }
    }
      
    public static void main(String[] args) {
        System.out.println("This is all about TREE!");

        Node root = new Node(10);
        root.left = new Node(50);
        root.right = new Node(55);
        root.left.left = new Node(60);

        printTree(root);


    }
}
