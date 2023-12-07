package Eclipse_testing.labb5;

import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

public class LifeTree extends TreeFrame {
  
    @Override
    protected void initTree() {
    	this.root = XMLTreeParser.parseXML();
        this.treeModel = new DefaultTreeModel(root);
        this.tree = new JTree(treeModel);
    }
    

    public static void main(String[] args) {
    	new LifeTree();
    }
    
    @Override
    void showDetails(TreePath path){
        if (path == null)
            return;

        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) path.getLastPathComponent();
        Object nodeInfo = selectedNode.getUserObject();

        XMLTreeParser.NodeDetails details = (XMLTreeParser.NodeDetails) nodeInfo;
        String info = details.getInfo();
        JOptionPane.showMessageDialog(this, info);

    }

}
