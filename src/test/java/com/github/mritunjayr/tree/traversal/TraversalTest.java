package com.github.mritunjayr.tree.traversal;

import com.github.mritunjayr.tree.BinaryTreeNode;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TraversalTest {

    private BinaryTreeNode root;

    /**
     * 50
     * /   \
     * 30    90
     * /   \    \
     * 20   40    100
     */
    @BeforeEach
    void setUp() {
        root = new BinaryTreeNode("50",
                new BinaryTreeNode("30",
                        new BinaryTreeNode("20", null, null),
                        new BinaryTreeNode("40", null, null)),
                new BinaryTreeNode("90",
                        null,
                        new BinaryTreeNode("100", null, null)));
        System.out.print("-> ");
    }

    @Test
    void preOrderTest() {
        Traversal traversal = new PreOrder();
        traversal.traverse(root);
    }

    @Test
    void postOrderTest() {
        Traversal traversal = new PostOrder();
        traversal.traverse(root);
    }

    @Test
    void inOrder() {
        Traversal traversal = new InOrder();
        traversal.traverse(root);
    }

    @Test
    void levelOrder() {
        Traversal traversal = new LevelOrder();
        traversal.traverse(root);
    }


    @AfterEach
    void cleanup() {
        System.out.println("..");
    }

}