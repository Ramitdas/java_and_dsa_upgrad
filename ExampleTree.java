
class Node {
    int key;
    Node left, right;

    public Node(int key){
        this.key = key;
        left = right = null;
    }
}

public class exampleTree {

    Node root;


    //Insertion
    Node insert(Node root, int key){
        if(root == null){
            root = new Node(key);
            return root;
        }

        if(key < root.key){
            root.left = insert(root.left, key);
        }
        else if(key > root.key){
            root.right = insert(root.right, key);
        }

        return root;
    }


    //Searching
    boolean search(Node root, int key){
        if(root == null){
            return false;
        }
        if(root.key == key){
            return true;
        }
        if(key < root.key){
            return search(root.left, key);
        }
        else if(key > root.key){
            return search(root.right, key);
        }

        return false;
    }


    //Inorder Traversal
    void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }

    //Preorder Traversal
    void preorder(Node root){
        if(root != null){
            System.out.print(root.key + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    //Postorder Traversal
    void postorder(Node root){
        if(root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.key + " ");
        }
    }


    //Deletion
    Node delete(Node root, int key){
        if(root == null){
            return root;
        }
        if(key < root.key){
            root.left = delete(root.left, key);
        }
        else if(key > root.key){
            root.right = delete(root.right, key);
        }
        else {
            //case 2 : if node has 1 child
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            //case 3 : two children, get inorder successor
            root.key = minValue(root.right);
            root.right = delete(root.right,root.key);
        }
        return root;
    }

    int minValue(Node root){
        int minVal = root.key;
        while(root.left != null){
            minVal = root.left.key;
            root = root.left;
        }
        return minVal;
    }



    public static void main(String[] args) {
        exampleTree tree = new exampleTree();

        tree.root = tree.insert(tree.root,50);
        tree.root = tree.insert(tree.root,20);

        System.out.println(tree.root.key + " Left-> " + tree.root.left.key );
        System.out.println("Search 20 : " + tree.search(tree.root, 20));
        System.out.println("Search 60 : " + tree.search(tree.root, 60));

    }
}
