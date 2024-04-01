package The1000.P700.P640.Q622;

/**
 * LeetCodePractice
 * 设计循环队列
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/1 21:50
 * @since JDK17
 */

class MyCircularQueue {
    int k, he, ta;
    int[] nums;
    public MyCircularQueue(int _k) {
        k = _k;
        nums = new int[k];
    }
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        nums[ta % k] = value;
        return ++ta >= 0;
    }
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        return ++he >= 0;
    }
    public int Front() {
        return isEmpty() ? -1 : nums[he % k];
    }
    public int Rear() {
        return isEmpty() ? -1 : nums[(ta - 1) % k];
    }
    public boolean isEmpty() {
        return he == ta;
    }
    public boolean isFull() {
        return ta - he == k;
    }
}


