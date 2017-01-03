package com.albion.core;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class BinaryTreePrinter {
    public BinaryTreePrinter() {
    }

    public static void printNode(TreeNode root) {
        int maxLevel = maxLevel(root);
        printNodeInternal(Collections.singletonList(root), 1, maxLevel);
    }

    private static <T extends Comparable<?>> void printNodeInternal(List<TreeNode> nodes, int level, int maxLevel) {
        if(!nodes.isEmpty() && !isAllElementsNull(nodes)) {
            int floor = maxLevel - level;
            int endgeLines = (int)Math.pow(2.0D, (double)Math.max(floor - 1, 0));
            int firstSpaces = (int)Math.pow(2.0D, (double)floor) - 1;
            int betweenSpaces = (int)Math.pow(2.0D, (double)(floor + 1)) - 1;
            printWhitespaces(firstSpaces);
            ArrayList newNodes = new ArrayList();

            for(Iterator i = nodes.iterator(); i.hasNext(); printWhitespaces(betweenSpaces)) {
                TreeNode j = (TreeNode)i.next();
                if(j != null) {
                    System.out.print(j.val);
                    newNodes.add(j.left);
                    newNodes.add(j.right);
                } else {
                    newNodes.add((Object)null);
                    newNodes.add((Object)null);
                    System.out.print(" ");
                }
            }

            System.out.println("");

            for(int var10 = 1; var10 <= endgeLines; ++var10) {
                for(int var11 = 0; var11 < nodes.size(); ++var11) {
                    printWhitespaces(firstSpaces - var10);
                    if(nodes.get(var11) == null) {
                        printWhitespaces(endgeLines + endgeLines + var10 + 1);
                    } else {
                        if(((TreeNode)nodes.get(var11)).left != null) {
                            System.out.print("/");
                        } else {
                            printWhitespaces(1);
                        }

                        printWhitespaces(var10 + var10 - 1);
                        if(((TreeNode)nodes.get(var11)).right != null) {
                            System.out.print("\\");
                        } else {
                            printWhitespaces(1);
                        }

                        printWhitespaces(endgeLines + endgeLines - var10);
                    }
                }

                System.out.println("");
            }

            printNodeInternal(newNodes, level + 1, maxLevel);
        }
    }

    private static void printWhitespaces(int count) {
        for(int i = 0; i < count; ++i) {
            System.out.print(" ");
        }

    }

    private static <T extends Comparable<?>> int maxLevel(TreeNode node) {
        return node == null?0:Math.max(maxLevel(node.left), maxLevel(node.right)) + 1;
    }

    private static <T> boolean isAllElementsNull(List<T> list) {
        Iterator var1 = list.iterator();

        Object object;
        do {
            if(!var1.hasNext()) {
                return true;
            }

            object = var1.next();
        } while(object == null);

        return false;
    }
}