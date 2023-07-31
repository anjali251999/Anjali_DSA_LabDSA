package com.gl.BST_sumChecker;

import java.util.Scanner;
import java.util.ArrayList;

public class BST_sumCheckerDriverClass {
	ArrayList<Integer> list = new ArrayList<>();

	public static void main(String[] args) {

		BST_sumCheckerDriverClass bst = new BST_sumCheckerDriverClass();
		Node root = null;
		Node nn = null;
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter number of nodes");
		int size = scn.nextInt();
		int i;
		for (i = 1; i <= size; i++) {
			System.out.println("Please enter data for the node :");
			int item = scn.nextInt();
			nn = new Node(item);
			if (root == null)
				root = nn;
			else
				bst.insert(root, nn);
		}
		
		bst.inOrder(root);
		System.out.println(bst.list);

		System.out.println("Please enter the sum ");
		int sum = scn.nextInt(); 
		int flag = 0;
		for (i = 0; i < bst.list.size(); i++) {
			int n1 = bst.list.get(i);
			int n2 = sum - n1;
			if (bst.list.contains(n2) && n1 != n2 && n1 < n2) {
				System.out.println("FOUND");
				flag = 1;
				System.out.println("[" + n1 + "," + n2 + "]");
				// break;
			}
		}
		if (flag == 0)
			System.out.println("No elements found");

		scn.close();
	}

	private void postOrder(Node root) {
		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + " ");
		}
	}

	private void preOrder(Node root) {
		if (root != null) {
			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	private void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			list.add(root.data);
			inOrder(root.right);
		}

	}

	private void insert(Node root, Node nn) {

		if (nn.data > root.data) {
			if (root.right == null) {
				root.right = nn;
			} else {
				insert(root.right, nn);
			}
		} else {
			if (root.left == null) {
				root.left = nn;
			} else {
				insert(root.left, nn);
			}
		}

	}

}
