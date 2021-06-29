package uas_semester.pkg2;
public class No_3_BinaryTreeApp {
    public static void main(String[] args) {
        var binding = new No_3_Binarytree();
        
        No_3_TreeNode node;
        node = new No_3_TreeNode('D');
        binding.insert(node);
        
        node = new No_3_TreeNode('B');
        binding.insert(node);
        
        node = new No_3_TreeNode('A');
        binding.insert(node);
        
        node = new No_3_TreeNode('C');
        binding.insert(node);
        
        node = new No_3_TreeNode('F');
        binding.insert(node);
        
        node = new No_3_TreeNode('E');
        binding.insert(node);
        
        node = new No_3_TreeNode('G');
        binding.insert(node);
        
        System.out.println("\nTraversal dengan Inorder : " );
        binding.inOrder();
        System.out.println();
        System.out.println("Traversal dengan Preorder : ");
        binding.preOrder();
        System.out.println("\nTraversal dengan Postorder : " );
        binding.postOrder();
        System.out.println();
        System.out.println();
        System.out.println("Muhammad Haidar Rasyiq ");
    }
}
