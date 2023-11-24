package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue,
                                                Queue<Integer> secondQueue) {

        LinkedList<Integer> LLfirst = (LinkedList<Integer>) firstQueue;
        LinkedList<Integer> LLsecond = (LinkedList<Integer>) secondQueue;
        int sizeArrDeque = firstQueue.size() + secondQueue.size();
        ArrayDeque<Integer> finalArrDeque = new ArrayDeque<>(sizeArrDeque);
        finalArrDeque.add(Objects.requireNonNull(LLfirst.pollFirst()));
        finalArrDeque.add(Objects.requireNonNull(LLfirst.pollFirst()));
        finalArrDeque.add(Objects.requireNonNull(LLsecond.pollFirst()));
        finalArrDeque.add(Objects.requireNonNull(LLsecond.pollFirst()));

        while (!firstQueue.isEmpty()){
            LLfirst.addLast(finalArrDeque.pollLast());
            finalArrDeque.addLast(Objects.requireNonNull(LLfirst.pollFirst()));
            finalArrDeque.addLast(Objects.requireNonNull(LLfirst.pollFirst()));

            LLsecond.addLast(finalArrDeque.pollLast());
            finalArrDeque.addLast(Objects.requireNonNull(LLsecond.pollFirst()));
            finalArrDeque.addLast(Objects.requireNonNull(LLsecond.pollFirst()));
        }


    return finalArrDeque;
    }
}
