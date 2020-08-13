import java.util.Date;

public class CustomBinaryTreeSearch {
    public static void main(String[] args) {

        CustomData cd = new CustomData(40, "sai");
        CustomData cd1 = new CustomData(20, "vamshi");
        CustomData cd2 = new CustomData(30, "latha");
        CustomData cd3 = new CustomData(10, "bindhu");
        CustomData cd4 = new CustomData(50, "bava");
        CustomData cd5 = new CustomData(60, "vedik");
        CustomData cd6 = new CustomData(70, "sunny");
        CustomData cd7 = new CustomData(80, "cho");

        BinarySearchTreeclass bts = new BinarySearchTreeclass();
        bts.insert(cd);
        bts.insert(cd1);
        bts.insert(cd2);
        bts.insert(cd3);
        bts.insert(cd4);
        bts.insert(cd5);
        bts.insert(cd6);
        bts.insert(cd7);

        bts.preOrder();

    }

}

class BinarySearchTreeclass {
    CustomData root;

    void insert(CustomData data) {

        if (root == null) {
            root = data;
        } else {

            CustomData current = root;
            while (true) {
                if (data.rollNo < current.rollNo) {
                    if (current.left == null) {
                        current.left = data;
                        return;

                    } else {
                        current = current.left;
                    }
                } else {
                    if (current.right == null) {
                        current.right = data;
                        return;
                    } else {
                        current = current.right;
                    }

                }
            }
        }

    }

    void preOrder() {
        preOrderRec(root);
    }

    private void preOrderRec(CustomData root2) {
        if (root2 == null) {
            return;
        }
        System.out.println(root2);

        preOrderRec(root2.left);
        preOrderRec(root2.right);

    }
}

class CustomData {
    int rollNo;
    String name;
    Date date;
    CustomData left;
    CustomData right;

    CustomData(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
        this.date = new Date();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ("Name: " + name + "  " + "Roll No: " + rollNo + "  " + "Date: " + date);
    }

}