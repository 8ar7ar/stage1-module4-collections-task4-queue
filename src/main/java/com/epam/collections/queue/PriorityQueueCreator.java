package com.epam.collections.queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList,
                                                     List<String> secondList) {
        int initCap = firstList.isEmpty() && secondList.isEmpty() ?
                1 : firstList.size() + secondList.size();

        PriorityQueue<String> priorityQueue = new PriorityQueue<>(initCap, new CustomComparator());
        priorityQueue.addAll(firstList);
        priorityQueue.addAll(secondList);
        return priorityQueue;
    }

    public static class CustomComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return -o1.compareTo(o2);
        }
    }
}
