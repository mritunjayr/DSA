package com.github.mritunjayr.tree.traversal;

import com.github.mritunjayr.tree.BinaryTreeNode;

public class PreOrder implements Traversal {

    @Override
    public void traverse(BinaryTreeNode node) {
        visit(node);
        if (node.leftChild() != null) traverse(node.leftChild());
        if (node.rightChild() != null) traverse(node.rightChild());
    }
}
