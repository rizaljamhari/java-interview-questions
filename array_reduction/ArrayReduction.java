import java.util.*;

public class ArrayReduction {
    public static int reductionCost(List<Integer> num) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(num);
        int sum = priorityQueue.poll();
        int cost = 0;
        while (!priorityQueue.isEmpty()) {
            int currentElement = priorityQueue.poll();
            if (currentElement < sum) {
                priorityQueue.add(sum);
                sum = currentElement;
            } else {
                sum += currentElement;
                cost += sum;
                continue;
            }

            sum += priorityQueue.poll();
            cost += sum;
        }

        return cost;
    }
}
