package com.podcastapp.controller.datastructure;

import com.podcastapp.model.PodcastModel;
import java.util.LinkedList;

/**
 * <b>Custom implementation of a queue data structure for managing PodcastModel
 * objects. This queue is implemented using a LinkedList and supports basic
 * operations like enqueue, dequeue, peek, and size checks</b>.
 *
 * <p>
 * Features include:</p>
 * <ul>
 * <li>Capacity limit for the queue.</li>
 * <li>Ability to check if the queue is empty or full.</li>
 * </ul>
 *
 * <p>
 * Note: This implementation assumes that the queue operations are not accessed
 * concurrently.</p>
 *
 * @author Siddhartha
 * @lmuID 23048583
 */
public class CustomQueue {

    private LinkedList<PodcastModel> queueList; // Internal storage for the queue.
    private int capacity; // Maximum number of elements the queue can hold.

    /**
     * Constructs a CustomQueue with the specified capacity.
     *
     * @param capacity the maximum number of elements the queue can hold.
     * @throws IllegalArgumentException if the specified capacity is negative.
     */
    public CustomQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than zero.");
        }
        queueList = new LinkedList<>();
        this.capacity = capacity;
    }

    /**
     * Removes and returns the first element from the queue.
     *
     * @return the first PodcastModel in the queue, or null if the queue is
     * empty.
     * @throws IllegalStateException if the queue is empty.
     */
    public PodcastModel deQueue() {
        try {
            return queueList.removeFirst();
        } catch (Exception ex) {
            throw new IllegalStateException("Cannot remove from an empty queue.");
        }
    }

    /**
     * Adds a new element to the end of the queue if it is not full.
     *
     * @param podcastModel the PodcastModel to be added to the queue.
     * @return the current size of the queue after the operation, or -1 if the
     * queue is full.
     */
    public int enQueue(PodcastModel podcastModel) {
        if (isFull()) {
            throw new IllegalStateException("Cannot add to a full queue.");
        }
        queueList.addLast(podcastModel);
        return queueList.size();
    }

    /**
     * Returns the current size of the queue.
     *
     * @return the number of elements in the queue.
     */
    public int poll() {
        return queueList.size();
    }

    /**
     * Retrieves, but does not remove, the first element of the queue.
     *
     * @return the first PodcastModel in the queue, or null if the queue is
     * empty.
     * @throws IllegalStateException if the queue is empty.
     */
    public PodcastModel peek() {
        try {
            return queueList.getFirst();
        } catch (Exception ex) {
            throw new IllegalStateException("Cannot peek into an empty queue.");
        }
    }

    /**
     * Checks if the queue is empty.
     *
     * @return true if the queue contains no elements, false otherwise.
     */
    public boolean isEmpty() {
        return queueList.isEmpty();
    }

    /**
     * Checks if the queue is full.
     *
     * @return true if the queue has reached its capacity, false otherwise.
     */
    public boolean isFull() {
        return queueList.size() == capacity;
    }
}
