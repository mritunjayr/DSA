package com.github.mritunjayr.tree.traversal;

import com.github.mritunjayr.tree.BinaryTreeNode;

public class InOrder implements Traversal {

    @Override
    public void traverse(BinaryTreeNode node) {
        if (node.leftChild() != null) traverse(node.leftChild());
        visit(node);
        if (node.rightChild() != null) traverse(node.rightChild());
    }
}
