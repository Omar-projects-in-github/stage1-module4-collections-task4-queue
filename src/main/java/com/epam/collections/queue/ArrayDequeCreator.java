package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> combinedCards = new ArrayDeque<>();

        combinedCards.add(firstQueue.poll());
        combinedCards.add(firstQueue.poll());
        combinedCards.add(secondQueue.poll());
        combinedCards.add(secondQueue.poll());

        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            firstQueue.add(combinedCards.pollLast());

            combinedCards.add(firstQueue.poll());
            combinedCards.add(firstQueue.poll());

            secondQueue.add(combinedCards.pollLast());

            combinedCards.add(secondQueue.poll());
            combinedCards.add(secondQueue.poll());


        }
        return combinedCards;
    }
}
