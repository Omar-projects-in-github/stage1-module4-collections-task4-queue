package com.epam.collections.queue;

import java.util.LinkedList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> dishes = new LinkedList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            dishes.add(i);
        }

        List<Integer> resultList = new LinkedList<>();
        int counter = 1, i = 0;
        while (!dishes.isEmpty()) {
            if (counter % everyDishNumberToEat == 0) {
                resultList.add(dishes.get(i));
                dishes.remove(i);
            }
            else
                i++;
            counter++;
            if (i == dishes.size())
                i = 0;
        }
        return resultList;
    }
}
