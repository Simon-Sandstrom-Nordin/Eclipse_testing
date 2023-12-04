package Eclipse_testing.labb5;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class LifeTree extends TreeFrame {
    static String title = "Liv";
  
    @Override
    protected void initTree() {
        this.root = new DefaultMutableTreeNode(title);
        this.treeModel = new DefaultTreeModel(root);
        this.tree = new JTree(treeModel);
        buildTree();
    }

    // Method called with no arguments
    private void buildTree() {
    	DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Växter");
    	root.add(child1);
    	DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Djur");
    	root.add(child2);
    	DefaultMutableTreeNode child3 = new DefaultMutableTreeNode("Svampar");
    	root.add(child3);
    }
    
    public static void main(String[] args) {
    	new LifeTree();
    }

}
