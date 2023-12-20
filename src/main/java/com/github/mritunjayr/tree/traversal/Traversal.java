package com.github.mritunjayr.tree.traversal;


import com.github.mritunjayr.tree.BinaryTreeNode;

public interface Traversal {
    void traverse(BinaryTreeNode node);

    default void visit(BinaryTreeNode node) {
        System.out.print("Node [" + node.name() + "] -> ");
    }
}
