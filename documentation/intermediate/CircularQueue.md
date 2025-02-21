# Circular Queues

- A circula queue data structure is an implementation of normal queue with an enhacement.
- The enhancement is to calculate the value of rear and front pointer. We calculate the rear element such that if the queue is full, then the rear/front element will point to the first index of the queue.
- Before adding any element in the queue, we increament the value of rear with this formulla: `rear = (rear + 1)%size`
- Now if after calculating rear, if `rear == front`,  then the queue is full.
- Before removing any element in the queue, we increament the value of front with this formulla: `front = (front + 1)%size`
- Now if after calculating the front, if `rear == front`, then we are removing the last element. so after getting the value, we set front and rear to -1.
- More details [here](https://prepinsta.com/data-structures-algorithms/circular-queue-using-array-in-c/)

## **Time Complexity**

- Get: O(n): O(1) to get the element
- Insert or Update: O(1)
- Search: O(n)

## **Example with Code**

[Queue Data Structure Impl](src/datastructures/basic/QueueDS.java)