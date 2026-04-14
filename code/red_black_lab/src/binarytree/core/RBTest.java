package binarytree.core;

import org.junit.*;

import java.util.ArrayList;
import java.util.Collections;

public class RBTest {
    @Test
    public void randomTrees() {
        for (int test = 0; test < 30; test++) {
            randomTree(256);
        }
    }

    public RedBlackTree<Integer> randomTree(int size) {
        ArrayList<Integer> values = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            values.add(i);
        }
        Collections.shuffle(values);
        RedBlackTree<Integer> t = new RedBlackTree<>();
        for (int i = 0; i < size; i++) {
            t.insert(values.get(i));
            t.getRoot().get().assertParentChildSymmetry();
        }
        t.assertInvariants();
        return t;
    }
}