package org.ericzh.lintcode.binarytree;

import java.util.LinkedList;

public class PreorderTranversal {
  public static void tranversalWithoutRecursion(BinNode binNode) {
    if (binNode == null) return;
    LinkedList<BinNode> stack = new LinkedList<>();
    stack.push(binNode);
    while (!stack.isEmpty()) {
      BinNode p = stack.pop();
      System.out.println(p.value);
      if (p.right != null) stack.push(p.right);
      if (p.left != null) stack.push(p.left);
    }
  }

  public static void tranversalRecursion(BinNode binNode) {
    if (binNode == null) return;
    System.out.println(binNode.value);
    tranversalRecursion(binNode.left);
    tranversalRecursion(binNode.right);
  }

  public static void main(String ...args) {
    BinNode<Integer> root = new BinNode<>(3);
    BinNode<Integer> node1 = new BinNode<>(9);
    BinNode<Integer> node2 = new BinNode<>(20);
    BinNode<Integer> node3 = new BinNode<>(11);
    BinNode<Integer> node4 = new BinNode<>(12);
    BinNode<Integer> node5 = new BinNode<>(13);
    root.left = node1;
    root.right = node2;
    node1.left = node3;
    node1.right = node4;
    node2.left = node5;
//    tranversalRecursion(root);

    tranversalWithoutRecursion(root);
  }
}