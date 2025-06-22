1.Explain the concept of recursion and how it can simplify certain problems.

Recursion is a programming technique where a function calls itself to solve smaller instances of a problem. 
Each recursive call breaks the problem down further until it reaches a base case, which stops the recursion. 
This method simplifies problems that have repetitive, self-similar structures, such as tree traversal, mathematical sequences, or divide-and-conquer algorithms like merge sort. 
Recursion can make code more concise and easier to understand by expressing solutions in a natural and logical way. 
However, it requires careful handling to avoid infinite loops or stack overflow by ensuring a proper base case is defined.




2. Discuss the time complexity of your recursive algorithm.

The time complexity of a recursive algorithm depends on how many recursive calls are made and the work done in each call. 
For example, the recursive factorial algorithm makes one call per decrement in n, resulting in O(n) time complexity. In contrast, the recursive Fibonacci algorithm, which calls itself twice per call (for n-1 and n-2), has an exponential time complexity of O(2?) due to repeated calculations. 
Recursive algorithms that follow a divide-and-conquer approach, like merge sort, divide the problem in half each time and combine results, giving a time complexity of O(n log n). Overall, analyzing recursive time complexity often involves solving recurrence relations to determine the growth of function calls.




3. Explain how to optimize the recursive solution to avoid excessive computation.


To optimize recursive solutions and avoid excessive computation, use memoization or dynamic programming. 
Memoization stores the results of expensive function calls in a cache so repeated calls with the same inputs return cached results instead of recomputing. 
This is especially effective for problems like Fibonacci, where overlapping subproblems occur. Alternatively, dynamic programming uses a bottom-up approach to solve subproblems iteratively, storing results in a table. 
Both techniques significantly reduce time complexity. Additionally, ensure a well-defined base case to prevent infinite recursion and consider tail recursion (if supported by the language), which can be optimized by compilers to avoid stack overflow. Choosing the right optimization depends on the problem structure and how subproblems relate to each other.


