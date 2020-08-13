public class BinarySearchTree {
    public static void main(String[] args) {




    }

    public static class BTS{


        int length;
        Node root;

        public void push(int value) {

            Node newNode=new Node();
            newNode.data=value;

            if(root==null){
                root=newNode;
            }else{

                Node cureent=root;
                while(true){

                    if(cureent.data>value){

                        if(cureent.left==null){
                            cureent.left=newNode;

                        }else{
                            cureent=cureent.left;
                        }else if(cureent.data<value){
                            if(cureent.right==null){
                                cureent.right=newNode;
                            }else{
                                cureent=cureent.right;
                            }
                        }

                    }

                }
            }




        }

    }

    public void show() {

    }

    static class Node {
        int data;
        Node right;
        Node left;

    }

}