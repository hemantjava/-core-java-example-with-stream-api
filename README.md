#Time Complexity
Since Binary Search divides the array into half each time its time complexity is O(log(N)). 
This time complexity is a marked improvement on the O(N) time complexity of Linear Search.

#Space Complexity
This search requires only one unit of space to store the element to be searched. 
Hence, its space complexity is O(1).

If Binary Search is implemented recursively, it needs to store the call to the method on a stack.
This may require O(log(N)) space in the worst case scenario.