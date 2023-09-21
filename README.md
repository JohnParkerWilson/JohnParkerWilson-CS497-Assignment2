# JohnParkerWilson-CS497-Assignment2

Problem 1:
At first I was going to brute force the solution, but then I realized that the problem given was word-for-word a Majority-Vote algorithm, so I used that to solve the problem. A majority vote algorithm would give a time complexity of O(n) and a space complexity of O(1)

Problem 2:
In order to solve this problem without sorting, I used a quickselect algorithm which would have a similar principle to a quicksort, but would work on an unsorted array and give a time complexity of O(n).

Problem 3:
To solve this, I sorted the array using a bucket sort and then finding the gaps between the minimum and maximum values of each bucket in order to get the maximum gap. Using the bucket sort would give a time and space complexity of O(n).

Problem 4:
I solved this by using java's Array.sort() function to sort the string and then iterated through it to get each unique character. The function itself uses the Tim Sort which gives an O(n log n) time complexity with an O(n) space complexity.

Problem 5:
To solve this, I iterated through the array trying to sum up the elements and keeping track of which elements used for the sum. Iterating through the array would give a time complexity of O(n) and a space complexity of O(n)
