# DSA
# Binary Tree Inversion in Java

## Description
This program inverts a binary tree by swapping the left and right children of every node using recursion.

## Concepts Used
- Binary Trees
- Recursion
- Tree Traversal
- Inorder Traversal

## How It Works
1. Create a binary tree using preorder input.
2. Use `-1` to represent a null node.
3. Swap the left and right children of each node recursively.
4. Print the inverted tree using inorder traversal.

## Sample Input
```text
1 2 -1 -1 3 -1 -1
```

## Output
```text
3 1 2
```

## Language
Java

## Time Complexity
O(n), where n is the number of nodes.

## Space Complexity
O(h) auxiliary recursion stack space, where h is the height of the tree.
