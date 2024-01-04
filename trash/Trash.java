/*

package Eclipse_testing.trash;

public class Trash {
	package Eclipse_testing.labb5;

	import javax.swing.JOptionPane;
	import javax.swing.JTree;
	import javax.swing.tree.DefaultMutableTreeNode;
	import javax.swing.tree.DefaultTreeModel;
	import javax.swing.tree.TreePath;

import Eclipse_testing.labb5.XMLTreeParser;

	public class LifeTree extends TreeFrame {
	    static String title = "Liv";
	  
	    @Override
	    protected void initTree() {
	    	
	    	this.root = XMLTreeParser.parseXML();
	    	// this.root = new DefaultMutableTreeNode(title);
	        this.treeModel = new DefaultTreeModel(root);
	        this.tree = new JTree(treeModel);
	        //displayNodeDetails(root); // Display node details using JOptionPane
	        // buildTree();
	    }

	    // Method called with no arguments, test case with manual things
	    private void buildTree() {
	    	DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Växter");
	    	root.add(child1);
	    	DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Djur");
	    	root.add(child2);
	    	DefaultMutableTreeNode child3 = new DefaultMutableTreeNode("Svampar");
	    	root.add(child3);
	    }
	    
	    private void displayNodeDetails(DefaultMutableTreeNode node) {
	        if (node != null) {
	            Object userObject = node.getUserObject();
	            if (userObject instanceof XMLTreeParser.NodeDetails) {
	                XMLTreeParser.NodeDetails details = (XMLTreeParser.NodeDetails) userObject;
	                // JOptionPane.showMessageDialog(null, "Name: " + details.name + "\nText: " + details.text);
	            }
	            // Recursively display for child nodes
	            //for (int i = 0; i < node.getChildCount(); i++) {
	            //    displayNodeDetails((DefaultMutableTreeNode) node.getChildAt(i));
	            // }
	        }
	    }
	    
	    @Override
	    void showDetails(TreePath path) {
	        if (path == null || !box.isSelected()) {
	            super.showDetails(path); // Call the superclass method if conditions are not met
	            return;
	        }

	        DefaultMutableTreeNode node = (DefaultMutableTreeNode) path.getLastPathComponent();
	        Object userObject = node.getUserObject();
	        if (userObject instanceof XMLTreeParser.NodeDetails) {
	            XMLTreeParser.NodeDetails details = (XMLTreeParser.NodeDetails) userObject;
	            JOptionPane.showMessageDialog(this, "Name: " + details.name + "\nText: " + details.text);
	        }
	    }
	    
	    public static void main(String[] args) {
	    	new LifeTree();
	    }

	}
    @Override
    void showDetails(TreePath path) {
        if (path == null || !box.isSelected()) {
            super.showDetails(path);
            return;
        }

        DefaultMutableTreeNode node = (DefaultMutableTreeNode) path.getLastPathComponent();
        Object userObject = node.getUserObject();
        if (userObject instanceof XMLTreeParser.NodeDetails) {
            XMLTreeParser.NodeDetails details = (XMLTreeParser.NodeDetails) userObject;
            JOptionPane.showMessageDialog(this, "Name: " + details.name + "\nText: " + details.text);
        }
    }
    
	// aja, den skriver ut men ... inte i JTree... och namnen där ser ut som adresser i minnet... får fortsätta sen
	// nu ser detaljerna nästan ok ut... TreePath of Treeframe och ... e krångliga

}
*/
