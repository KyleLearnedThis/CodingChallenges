package com.albion.sumOfLeftLeaves;


import com.albion.core.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * https://leetcode.com/problems/sum-of-left-leaves/
 */
public class SumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null || root.left == null && root.right == null) return 0;

        int result = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            TreeNode current = queue.poll();

            if(current.left != null && current.left.left == null && current.left.right == null) result += current.left.val;
            if(current.left != null) queue.offer(current.left);
            if(current.right != null) queue.offer(current.right);
        }
        return result;
    }

    public int sumOfLeftLeavesV2(TreeNode root) {
        if(root == null) return 0;
        int ans = 0;
        if(root.left != null) {
            if(root.left.left == null && root.left.right == null) ans += root.left.val;
            else ans += sumOfLeftLeaves(root.left);
        }
        ans += sumOfLeftLeaves(root.right);

        return ans;
    }

    public int sumOfLeftLeavesV3(TreeNode root) {
        if(root == null) return 0;
        int ans = 0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.empty()) {
            TreeNode node = stack.pop();
            if(node.left != null) {
                if (node.left.left == null && node.left.right == null)
                    ans += node.left.val;
                else
                    stack.push(node.left);
            }
            if(node.right != null) {
                if (node.right.left != null || node.right.right != null)
                    stack.push(node.right);
            }
        }
        return ans;
    }
}
