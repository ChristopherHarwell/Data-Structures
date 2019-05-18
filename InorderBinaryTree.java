package Trees;

public class InorderBinaryTree {
	
		public class binaryTree {
		    class Node {
		        Node left,right;
		        int data;
		        public Node (int data) {
		            this.data = data;
		        }
		        /**
		         * A subroutine for inserting data into a binary tree
		         * using inorder traversal
		         */
		        public void insert(int value) {
		            if (value <= data) {
		                if (left == null) {
		                    left = new Node(value);
		                } else {
		                    left.insert(value);
		                }
		            } else {
		                if(right == null) {
		                    right = new Node(value);
		                } else {
		                    right.insert(value);
		                }
		            }
		        }

		        /**
		         * Checks whether the inorder binary tree contains a given value
		         */
		        public boolean contains(int value){
		            if(value == data) {
		                return true;
		            } else if (value < data) {
		                if(left == null) {
		                    return false;
		                } else {
		                    return left.contains(value);
		                }
		                } else {
		                if(right == null) {
		                    return false;
		                } else {
		                    return right.contains(value);
		                }
		            }
		        }

		        /**
		         * A method for printing out the Nodes in the inorder binary tree
		         */
		        public void printInOrder() {
		            if(left != null){
		                left.printInOrder();
		            }
		            System.out.println(data);
		            if (right != null) {
		                right.printInOrder();
		            }
		        }


		    }
		}
	}


