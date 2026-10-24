# 🌳 Java DSA Problems

A collection of **21 Data Structures and Algorithms problems implemented in Java**, covering Arrays, Binary Trees, Binary Search Trees (BST), recursion, tree traversal, BFS, DFS, binary search, sliding window, two pointers, and backtracking.

This repository is part of my Data Structures and Algorithms practice to strengthen my Java programming, logical thinking, and problem-solving skills.

## 📚 Problems Covered

### 📦 Array Problems

| No. | LeetCode | Problem Name | Main Concept |
|---:|---:|---|---|
| 1 | 1 | Two Sum | HashMap |
| 2 | 121 | Best Time to Buy and Sell Stock | Greedy |
| 3 | 238 | Product of Array Except Self | Prefix and Suffix Products |
| 4 | 152 | Maximum Product Subarray | Dynamic Programming |
| 5 | 153 | Find Minimum in Rotated Sorted Array | Binary Search |
| 6 | 11 | Container With Most Water | Two Pointers |
| 7 | 15 | 3Sum | Sorting and Two Pointers |
| 8 | 53 | Maximum Subarray | Kadane's Algorithm |
| 9 | 217 | Contains Duplicate | HashSet |
| 10 | 33 | Search in Rotated Sorted Array | Binary Search |

### 🌳 Binary Tree, BST and Backtracking Problems

| No. | LeetCode | Problem Name | Main Concept |
|---:|---:|---|---|
| 11 | 226 | Invert Binary Tree | Recursion |
| 12 | 104 | Maximum Depth of Binary Tree | Recursion |
| 13 | 100 | Same Tree | Tree Comparison |
| 14 | 102 | Binary Tree Level Order Traversal | BFS and Queue |
| 15 | 105 | Construct Binary Tree from Preorder and Inorder Traversal | Recursion and HashMap |
| 16 | 297 | Serialize and Deserialize Binary Tree | Serialization and Recursion |
| 17 | 572 | Subtree of Another Tree | Recursion and Tree Comparison |
| 18 | 98 | Validate Binary Search Tree | BST and Recursion |
| 19 | 230 | Kth Smallest Element in a BST | Inorder Traversal |
| 20 | 235 | Lowest Common Ancestor of a BST | BST Search |
| 21 | 79 | Word Search | Backtracking and DFS |

## 📁 Project Structure

```text
DSA/
├── README.md
├── Array/
│   ├── TwoSum.java
│   ├── BestTimeToBuyAndSellStock.java
│   ├── ProductOfArrayExceptSelf.java
│   ├── MaxProduct.java
│   ├── FindMinimumInRotatedSortedArray.java
│   ├── ContainerWithMostWater.java
│   ├── ThreeSum.java
│   ├── MaximumSubarray.java
│   ├── ContainsDuplicate.java
│   └── SearchInRotatedSortedArray.java
└── Tree/
    ├── 226-InvertBinaryTree/
    ├── 104-MaximumDepth/
    ├── 100-SameTree/
    ├── 102-LevelOrderTraversal/
    ├── 105-BuildTree/
    ├── 297-SerializeDeserialize/
    ├── 572-SubtreeOfAnotherTree/
    ├── 98-ValidateBST/
    ├── 230-KthSmallestBST/
    ├── 235-LowestCommonAncestorBST/
    └── 79-WordSearch/
```

*Note: The tree folder structure above reflects the previously documented layout. Keep the actual folder and file names in your repository if they differ.*

## 🛠️ Technologies Used

- **Language:** Java
- **Data Structures:** Arrays, HashMap, HashSet, Binary Trees, Binary Search Trees, Queues, 2D Character Arrays
- **Algorithms:** Binary Search, Sliding Window, Two Pointers, Greedy Algorithms, Kadane's Algorithm, DFS, BFS, Backtracking
- **Concepts:** Recursion, Prefix and Suffix Products, Tree Construction, Serialization, Inorder Traversal
- **Tools:** VS Code, Git, GitHub

## 📦 Array Problem Highlights

### 1. Two Sum — LeetCode 1
Find two array elements whose sum equals the target using a HashMap.

**Concepts:** Hashing, array traversal.

### 2. Best Time to Buy and Sell Stock — LeetCode 121
Find the maximum profit by buying before selling, tracking the minimum price seen so far.

**Concepts:** Greedy algorithm, running minimum.

### 3. Product of Array Except Self — LeetCode 238
Calculate the product of all elements except the current element without using division.

**Concepts:** Prefix and suffix products.

### 4. Maximum Product Subarray — LeetCode 152
Find the contiguous subarray with the largest product. Track both maximum and minimum products because negative values can change the result.

**Concepts:** Dynamic programming, array traversal.

### 5. Find Minimum in Rotated Sorted Array — LeetCode 153
Find the minimum element in a rotated sorted array using binary search.

**Concepts:** Binary search.

### 6. Container With Most Water — LeetCode 11
Find two heights that form a container holding the maximum amount of water.

**Concepts:** Two pointers, greedy approach.

### 7. 3Sum — LeetCode 15
Find unique triplets whose sum is zero by sorting the array and using two pointers.

**Concepts:** Sorting, two pointers, duplicate handling.

### 8. Maximum Subarray — LeetCode 53
Find the contiguous subarray with the largest sum using Kadane's algorithm.

**Concepts:** Dynamic programming, running maximum.

### 9. Contains Duplicate — LeetCode 217
Check whether any value appears more than once using a HashSet.

**Concepts:** Hashing, duplicate detection.

### 10. Search in Rotated Sorted Array — LeetCode 33
Find the target's index in a rotated sorted array using binary search.

**Concepts:** Binary search, sorted partitions.

## 🌳 Binary Tree, BST and Backtracking Highlights

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
Visit nodes level by level using a queue.

**Concepts:** BFS, queue.

### 5. Construct Binary Tree from Preorder and Inorder Traversal — LeetCode 105
Reconstruct a binary tree using preorder and inorder arrays. A HashMap helps locate roots efficiently.

**Concepts:** Recursion, tree construction, HashMap.

### 6. Serialize and Deserialize Binary Tree — LeetCode 297
Convert a binary tree into a string and reconstruct it. Null markers preserve the tree structure.

**Concepts:** Serialization, deserialization, recursion.

### 7. Subtree of Another Tree — LeetCode 572
Determine whether one tree appears as a complete subtree of another tree.

**Concepts:** Recursion, tree comparison.

### 8. Validate Binary Search Tree — LeetCode 98
Check whether a binary tree follows BST ordering rules.

**Concepts:** BST properties, recursion, range validation.

### 9. Kth Smallest Element in a BST — LeetCode 230
Use inorder traversal to visit BST values in ascending order and find the kth smallest element.

**Concepts:** Inorder traversal, DFS, BST.

### 10. Lowest Common Ancestor of a BST — LeetCode 235
Find the lowest node in a BST that has both target nodes as descendants, allowing a target node to be an ancestor of itself.

**Concepts:** BST search, tree traversal.

### 11. Word Search — LeetCode 79
Determine whether a word exists in a 2D character board by searching horizontally and vertically adjacent cells. DFS explores possible paths, and backtracking restores visited cells.

**Concepts:** DFS, backtracking, matrix traversal.

## 🌱 Tree Creation

Most standalone tree programs use a recursive method called `createTree()` to build a binary tree from user input.

1. Read the root value first.
2. Create the left subtree recursively.
3. Create the right subtree recursively.
4. Use `-1` to represent a missing node.

**Example input:**

```text
1 2 -1 -1 3 -1 -1
```

**Tree structure:**

```text
    1
   / \
  2   3
```

This input follows preorder format: root, left subtree, right subtree.

**Exceptions:**
- Problem 105 constructs a tree from preorder and inorder arrays.
- Problem 297 serializes and deserializes a tree.
- Word Search uses a 2D character board and a target word instead of a binary tree.

## ⏱️ Complexity Overview

| Problem | Time Complexity |
|---|---|
| Two Sum | O(n) average |
| Best Time to Buy and Sell Stock | O(n) |
| Product of Array Except Self | O(n) |
| Maximum Product Subarray | O(n) |
| Find Minimum in Rotated Sorted Array | O(log n) |
| Container With Most Water | O(n) |
| 3Sum | O(n²) |
| Maximum Subarray | O(n) |
| Contains Duplicate | O(n) average |
| Search in Rotated Sorted Array | O(log n) |
| Invert Binary Tree | O(n) |
| Maximum Depth of Binary Tree | O(n) |
| Same Tree | O(n) |
| Level Order Traversal | O(n) |
| Construct Binary Tree | O(n) average |
| Serialize and Deserialize | O(n) |
| Subtree of Another Tree | O(n × m) worst case |
| Validate BST | O(n) |
| Kth Smallest Element in BST | O(h + k) with early stopping; O(n) worst case |
| Lowest Common Ancestor of BST | O(h) |
| Word Search | O(R × C × 4^L) upper bound |

Here, `n` is the number of array elements or tree nodes, `m` is the number of nodes in the second tree, `h` is tree height, `k` is the requested rank, `R` and `C` are board dimensions, and `L` is the word length.

Space complexity varies by algorithm and implementation. Hash-based solutions typically require O(n) auxiliary space, while binary-search and two-pointer solutions use O(1) auxiliary space. Recursive tree algorithms use stack space based on tree height.

## ▶️ How to Run

1. Install the Java JDK.
2. Clone the repository:

   ```bash
   git clone https://github.com/Mishaal-hub/DSA.git
   ```

3. Open the desired problem folder in VS Code.
4. Open the terminal in that folder.
5. Compile the Java program:

   ```bash
   javac TwoSum.java
   ```

6. Run the program:

   ```bash
   java TwoSum
   ```

Replace `TwoSum` with the relevant class name for other array programs. For tree programs, use the actual Java filename and class name in the corresponding folder.

For LeetCode submissions, adapt the relevant solution to LeetCode's provided class and method signatures.

## 🎯 Learning Goals

- Strengthen Java programming fundamentals.
- Improve problem-solving through arrays, recursion, and tree algorithms.
- Practice hashing, binary search, and two-pointer techniques.
- Understand BFS, DFS, and backtracking.
- Learn tree reconstruction, serialization, and BST operations.
- Analyze time and space complexity.
- Write clean, understandable Java programs.

## 👨‍💻 About This Repository

This repository documents my learning journey in Java, Data Structures and Algorithms, Arrays, Binary Trees, Binary Search Trees, and Backtracking through practical coding problems.

**Build. Learn. Improve. Grow.** 🚀
