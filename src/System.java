import cu.edu.cujae.ceis.tree.TreeNode;
import cu.edu.cujae.ceis.tree.binary.BinaryTreeNode;
import cu.edu.cujae.ceis.tree.general.GeneralTree;
import cu.edu.cujae.ceis.tree.iterators.general.InDepthIterator;

public class System {
    private GeneralTree<Dependency> tree;
    public System() {
        tree = new GeneralTree<>();
    }
    
    public BinaryTreeNode<Dependency> getDepartmentNodeByName (String departmentName1) {
        InDepthIterator<Dependency> iterator = tree.inDepthIterator();
        BinaryTreeNode<Dependency> department1 = null;
        while (iterator.hasNext()) {
            BinaryTreeNode<Dependency> current = iterator.nextNode();
            if (current.getInfo().getName().equals(departmentName1)) {
                if (current.getInfo() instanceof Department)
                    department1 = current;
            }
        }
        return department1;
    }

    public boolean mergeDepartments(String departmentName1, String departmentName2, String newDepartment) {
        boolean result = false;
        if (getDepartmentNodeByName(newDepartment)==null) {
            return false;
        }

        BinaryTreeNode<Dependency> department1Node = getDepartmentNodeByName(departmentName1);
        if (department1Node != null) {
            BinaryTreeNode<Dependency> department2Node = getDepartmentNodeByName(departmentName2);
            if (department2Node != null) {
                Department department1 = (Department) department1Node.getInfo();
                Department department2 = (Department) department2Node.getInfo();

                if (department1.getBoss().getYearsInCharge() >= department2.getBoss().getYearsInCharge()) {
                    department1.setName(departmentName1);
                    department1.getWorkers().addAll(department2.getWorkers());
                    department1.setMaxCant(department1.getMaxCant()+department2.getMaxCant());
                    tree.deleteNode(department2Node);
                } else {
                    department1.setName(departmentName2);
                    department2.getWorkers().addAll(department1.getWorkers());
                    department2.setMaxCant(department1.getMaxCant()+department2.getMaxCant());
                    tree.deleteNode(department1Node);
                }
            }
        }
        return result;
    }
}
