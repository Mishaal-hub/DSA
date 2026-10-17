# 🌳 Java Binary Tree, BST & DSA Problems

A collection of **11 Data Structures and Algorithms problems implemented in Java**, covering Binary Trees, Binary Search Trees (BST), recursion, tree traversal, BFS, DFS, tree construction, serialization, and backtracking.

This repository is part of my Data Structures and Algorithms practice to strengthen my Java programming, logical thinking, and problem-solving skills.

## 📚 Problems Covered

| **No.** | **LeetCode** | **Problem Name** | **Main Concept** |
|---:|---:|---|---|
| 1 | 226 | Invert Binary Tree | Recursion |
| 2 | 104 | Maximum Depth of Binary Tree | Recursion |
| 3 | 100 | Same Tree | Tree Comparison |
| 4 | 102 | Binary Tree Level Order Traversal | BFS and Queue |
| 5 | 105 | Construct Binary Tree from Preorder and Inorder Traversal | Recursion and HashMap |
| 6 | 297 | Serialize and Deserialize Binary Tree | Serialization and Recursion |
| 7 | 572 | Subtree of Another Tree | Recursion and Tree Comparison |
| 8 | 98 | Validate Binary Search Tree | BST and Recursion |
| 9 | 230 | Kth Smallest Element in a BST | Inorder Traversal |
| 10 | 235 | Lowest Common Ancestor of a BST | BST Search |
| 11 | 79 | Word Search | Backtracking and DFS |

## 📁 Project Structure

```text
Java-Binary-Tree-Problems/
├── README.md
├── 226-InvertBinaryTree/
│   └── Main.java
├── 104-MaximumDepth/
│   └── Main.java
├── 100-SameTree/
│   └── Main.java
├── 102-LevelOrderTraversal/
│   └── Main.java
├── 105-BuildTree/
│   └── Main.java
├── 297-SerializeDeserialize/
│   └── Main.java
├── 572-SubtreeOfAnotherTree/
│   └── Main.java
├── 98-ValidateBST/
│   └── Main.java
├── 230-KthSmallestBST/
│   └── Main.java
├── 235-LowestCommonAncestorBST/
│   └── Main.java
└── 79-WordSearch/
    └── Main.java
```

## 🛠️ Technologies Used

- **Language:** Java
- **Data Structures:** Binary Tree, Binary Search Tree, Queue, HashMap, 2D Character Array
- **Concepts:** Recursion, DFS, BFS, Inorder Traversal, Backtracking, Tree Construction, Serialization, BST Search
- **Tools:** VS Code, Git, GitHub

## 🌱 Tree Creation

Most standalone tree programs use a recursive method called `createTree()` to build a binary tree from user input.

- Read the root value first.
- Create the left subtree recursively.
- Create the right subtree recursively.
- Use `-1` to represent a missing node.

### Example Input

```text
1 2 -1 -1 3 -1 -1
```

### Tree Structure

```text
    1
   / \
  2   3
```

This input follows **preorder format**: root, left subtree, right subtree.

**Note:**
- Problem 105 constructs a tree from preorder and inorder arrays.
- Problem 297 serializes and deserializes a tree.
- BST programs use preorder input for tree creation.
- Word Search uses a 2D character board and a target word instead of a binary tree.

## 💡 Problem Explanations

### 1. Invert Binary Tree — LeetCode 226

Swap the left and right children of every node recursively.

**Concepts:** Recursion, tree traversal.

### 2. Maximum Depth of Binary Tree — LeetCode 104

Calculate the maximum depth by finding the depth of both subtrees and adding one for the current node.

**Concepts:** Recursion, DFS.

### 3. Same Tree — LeetCode 100

Check whether two trees have identical structures and corresponding node values.

**Concepts:** Recursion, tree comparison.

### 4. Binary Tree Level Order Traversal — LeetCode 102

Use a queue to visit nodes level by level using Breadth-First Search (BFS).

**Concepts:** BFS, queue.

### 5. Construct Binary Tree from Preorder and Inorder Traversal — LeetCode 105

Build a binary tree using preorder and inorder traversal arrays. A HashMap helps locate each root in the inorder array efficiently.

**Concepts:** Recursion, tree construction, HashMap.

### 6. Serialize and Deserialize Binary Tree — LeetCode 297

Convert a binary tree into a string and reconstruct the original tree. Null markers preserve the tree structure.

**Concepts:** Serialization, deserialization, recursion.

### 7. Subtree of Another Tree — LeetCode 572

Determine whether one tree appears as a complete subtree of another tree.

**Concepts:** Recursion, tree comparison.

### 8. Validate Binary Search Tree — LeetCode 98

Check whether a binary tree satisfies BST rules: every value in the left subtree must be smaller than its root, and every value in the right subtree must be greater.

**Concepts:** BST properties, recursion, range validation.

### 9. Kth Smallest Element in a BST — LeetCode 230

Use inorder traversal to visit BST values in ascending order and find the kth smallest element.

**Concepts:** Inorder traversal, DFS, BST.

### 10. Lowest Common Ancestor of a BST — LeetCode 235

Find the lowest node in a BST that has both target nodes as descendants, allowing a target node to be an ancestor of itself.

**Concepts:** BST search, tree traversal.

### 11. Word Search — LeetCode 79

Determine whether a given word exists in a 2D character board by searching horizontally and vertically adjacent cells.

Use Depth-First Search (DFS) and backtracking to explore possible paths. Mark visited cells temporarily so that the same cell cannot be used more than once in a single word path, then restore the cell when backtracking.

**Concepts:** DFS, backtracking, matrix traversal.

## ⏱️ Complexity Overview

Let:

- `n` = number of nodes in the main tree.
- `m` = number of nodes in the second tree.
- `h` = height of the tree.
- `k` = requested rank in the BST.
- `R` = number of rows in the Word Search board.
- `C` = number of columns in the board.
- `L` = length of the target word.

| **Problem** | **Time Complexity** |
|---|---|
| Invert Binary Tree | O(n) |
| Maximum Depth of Binary Tree | O(n) |
| Same Tree | O(n) |
| Level Order Traversal | O(n) |
| Construct Binary Tree | O(n) average |
| Serialize and Deserialize | O(n) |
| Subtree of Another Tree | O(n × m) worst case |
| Validate BST | O(n) |
| Kth Smallest Element in a BST | O(h + k) typical with early stopping; O(n) worst case |
| Lowest Common Ancestor of a BST | O(h) for the LCA search |
| Word Search | O(R × C × 4^L) worst-case upper bound |

Space complexity depends on recursion depth and auxiliary data structures. For a balanced BST, `h` is typically O(log n); for a skewed tree, `h` can be O(n).

For Word Search, the auxiliary recursion stack uses O(L) space, excluding the input board. The search can be pruned further based on the number of available neighboring cells.

## ▶️ How to Run

1. Install the Java JDK.
2. Open the desired problem folder in VS Code.
3. Open the terminal in that folder.
4. Compile the Java program:

   ```bash
   javac Main.java
   ```

5. Run the program:

   ```bash
   java Main
   ```

6. Enter the required input according to that problem.

Each standalone program has its own `Main` class in this folder structure. If you use descriptive class names instead, ensure the filename matches the public class name.

For LeetCode submissions, adapt the relevant solution to LeetCode's provided classes and method signatures. Problem 297 uses the `Codec` interface expected by LeetCode.

## 🎯 Learning Goals

- Understand binary tree and BST structures.
- Improve problem-solving through recursion, DFS, and BFS.
- Practice queues and HashMaps.
- Learn tree reconstruction and serialization.
- Understand BST validation, searching, and inorder traversal.
- Solve matrix problems using DFS and backtracking.
- Analyze time and space complexity.
- Write clean, reusable Java programs.

## 👨‍💻 About This Repository

This repository documents my learning journey in **Java, Data Structures and Algorithms, Binary Trees, Binary Search Trees, and Backtracking** through practical coding problems.

**Build. Learn. Improve. Grow.** 🚀
