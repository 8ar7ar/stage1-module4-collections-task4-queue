package com.epam.collections.queue;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes,
                                            int everyDishNumberToEat) {
        ArrayList<Integer> resSequences = new ArrayList<>();
        LinkedList<Integer> dishNums = new LinkedList<>();

        for (int i = 1; i <= numberOfDishes; i++) dishNums.addLast(i);
        int nextDishNumber = everyDishNumberToEat - 1;
        int i = 0;
        while (!dishNums.isEmpty()) {
            i = (i + nextDishNumber) % dishNums.size();
            resSequences.add(dishNums.remove(i));
        }
        return resSequences;
    }
}
