# DSA# 🌳 Java Binary Tree Problems

A collection of **7 Binary Tree problems implemented in Java**, covering recursion, tree traversal, BFS, tree construction, serialization, and subtree comparison.

This repository is part of my Data Structures and Algorithms practice to strengthen my Java programming and problem-solving skills.

## 📚 Problems Covered

| No. | LeetCode | Problem Name | Main Concept |
|---:|---:|---|---|
| 1 | 226 | Invert Binary Tree | Recursion |
| 2 | 104 | Maximum Depth of Binary Tree | Recursion |
| 3 | 100 | Same Tree | Tree Comparison |
| 4 | 102 | Binary Tree Level Order Traversal | BFS and Queue |
| 5 | 105 | Construct Binary Tree from Preorder and Inorder Traversal | Recursion and HashMap |
| 6 | 297 | Serialize and Deserialize Binary Tree | Serialization and Recursion |
| 7 | 572 | Subtree of Another Tree | Recursion and Tree Comparison |

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
└── 572-SubtreeOfAnotherTree/
    └── Main.java
```

## 🛠️ Technologies Used

- **Language:** Java
- **Data Structure:** Binary Tree
- **Concepts:** Recursion, DFS, BFS, Queue, HashMap
- **Tools:** VS Code, Git, GitHub

## 🌱 Tree Creation

Most programs use a recursive method called `createTree()` to build a binary tree from user input.

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

**Note:** Problem 105 constructs a tree from preorder and inorder arrays, while Problem 297 serializes and deserializes a tree.

## 💡 Problem Explanations

### 1. Invert Binary Tree — LeetCode 226
Swap the left and right children of every node recursively.

### 2. Maximum Depth — LeetCode 104
Calculate the maximum depth by finding the depth of both subtrees and adding one for the current node.

### 3. Same Tree — LeetCode 100
Check whether two trees have identical structures and corresponding node values.

### 4. Level Order Traversal — LeetCode 102
Use a queue to visit and print nodes level by level using Breadth-First Search (BFS).

### 5. Construct Binary Tree — LeetCode 105
Build a binary tree using preorder and inorder traversal arrays. A HashMap helps locate each root in the inorder array efficiently.

### 6. Serialize and Deserialize — LeetCode 297
Convert a binary tree into a string and reconstruct the original tree. Null markers preserve the tree structure.

### 7. Subtree of Another Tree — LeetCode 572
Determine whether one tree appears as a complete subtree of another tree.

## ⏱️ Complexity Overview

Let `n` represent the number of nodes in the main tree and `m` the number of nodes in the subtree.

| Problem | Time Complexity |
|---|---|
| Invert Binary Tree | O(n) |
| Maximum Depth | O(n) |
| Same Tree | O(n) |
| Level Order Traversal | O(n) |
| Construct Binary Tree | O(n) average |
| Serialize and Deserialize | O(n) |
| Subtree of Another Tree | O(n × m) worst case |

Space complexity depends on tree height, recursion depth, and additional data structures.

## ▶️ How to Run

1. Install Java JDK.
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

Each standalone program has its own `Main` class. Problem 297 can also use a `Codec` class when adapting the solution to LeetCode.

## 🎯 Learning Goals

- Understand binary tree structure and recursive tree creation.
- Improve problem-solving using DFS and BFS.
- Practice queues and HashMaps.
- Learn tree reconstruction and serialization.
- Analyze time and space complexity.
- Write clean, reusable Java code.

## 👨‍💻 About This Repository

This repository documents my learning journey in **Java, Data Structures and Algorithms, and Binary Trees** through practical coding problems.

**Build. Learn. Improve. Grow.** 🚀
