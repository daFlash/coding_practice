package customtress;

class TreeNode {
	int data;
	TreeNode left = null;
	TreeNode right = null;
	
	TreeNode(int data) {
		this.data = data;
	}
}
public class TreeTraversals {
	
	public static TreeNode createBinaryTree() {
		TreeNode root = new TreeNode(40);
		TreeNode node20= root.left = new TreeNode(20);
		TreeNode node60 = root.right = new TreeNode(60);
		node20.left = new TreeNode(10);
		node20.right = new TreeNode(30);
		node60.left = new TreeNode(50);
		node60.right = new TreeNode(70);
		return root;
	}
	
	public static void preOrder(TreeNode root) {
		if(root != null) {
			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	public static void inOrder(TreeNode root) {
		if(root != null) {
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}

	public static void postOrder(TreeNode root) {
		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + " ");
		}
	}
	public static void main(String[] args) {
		TreeNode tree = createBinaryTree();
		preOrder(tree);
		System.out.println();
		postOrder(tree);
		System.out.println();
		inOrder(tree);
	}

}
