package com.podcastapp.controller.datastructure;

import java.util.ArrayList;

/**
 *
 * @author Siddhartha Singh
 * @lmuID 23048583
 */
public class CustomStack {
    private ArrayList<Object[]> stack;

    // Constructor to initialize the stack
    public CustomStack() {
        this.stack = new ArrayList<>();
    }

    /**
     * Pushes an object array onto the stack.
     *
     * @param item the object array to add
     */
    public void push(Object[] item) {
        stack.add(item);
    }

    /**
     * Removes and returns the top element from the stack.
     *
     * @return the top object array, or null if the stack is empty
     */
    public Object[] pop() {
        if (isEmpty()) {
            return null; // Return null if the stack is empty
        }
        return stack.remove(stack.size() - 1);
    }

    /**
     * Returns the top element of the stack without removing it.
     *
     * @return the top object array, or null if the stack is empty
     */
    public Object[] peek() {
        if (isEmpty()) {
            return null; // Return null if the stack is empty
        }
        return stack.get(stack.size() - 1);
    }

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    /**
     * Returns the number of elements in the stack.
     *
     * @return the size of the stack
     */
    public int size() {
        return stack.size();
    }

    /**
     * Clears all elements from the stack.
     */
    public void clear() {
        stack.clear();
    }

    /**
     * Returns all elements in the stack as a list.
     *
     * @return a list of object arrays in the stack
     */
    public ArrayList<Object[]> getAllElements() {
        return new ArrayList<>(stack);
    }
}