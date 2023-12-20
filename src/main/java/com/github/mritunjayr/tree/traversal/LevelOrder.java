package com.github.mritunjayr.tree.traversal;

import com.github.mritunjayr.tree.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder implements Traversal {

    @Override
    public void traverse(BinaryTreeNode node) {
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            BinaryTreeNode current = queue.poll();
            visit(current);
            if (current.leftChild() != null) queue.add(current.leftChild());
            if (current.rightChild() != null) queue.add(current.rightChild());
        }
    }
}
