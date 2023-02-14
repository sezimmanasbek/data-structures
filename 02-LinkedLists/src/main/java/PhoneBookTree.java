import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PhoneBookTree {

    CustomNodeTree root;



    PhoneBookTree(){


    }

    public void insert(CustomNodeTree nodeTree){
        if(root == null){
            root = nodeTree;
            return;
        } else{
            CustomNodeTree current = root;
            while(true) {
                if (nodeTree.firstName.compareToIgnoreCase(current.firstName) < 0) {
                    if (current.left == null) {
                        current.left = nodeTree;
                        break;
                    }
                    current = current.left;
                } else {
                    if (current.right == null) {
                        current.right = nodeTree;
                        break;
                    }
                    current = current.right;
                }
            }

        }
    }

    public void printInAssOrder(CustomNodeTree node) {
        if (node == null) return;
        printInAssOrder(node.left);
        System.out.println(node.firstName);
        printInAssOrder(node.right);
    }

    List<String> firstNameList(CustomNodeTree node) {
        List<String> result = new ArrayList<>();
        Stack<CustomNodeTree> stack = new Stack<>();
        while (stack.isEmpty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                result.add(root.firstName);
                root = root.right;
            }

        }
        return result;
    }

}
