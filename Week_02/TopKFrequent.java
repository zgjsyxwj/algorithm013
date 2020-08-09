package week02;

import java.util.*;

/**
 * 347. 前 K 个高频元素
 * 给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
 */
public class TopKFrequent {
    public static void main(String[] args) {

    }

    public Integer[] solution(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (Integer i : nums
        ) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);

            }
        }
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(Comparator.comparingInt(map::get));
        for (Integer key:map.keySet()
             ) {
            priorityQueue.add(key);
            if (priorityQueue.size()>k){
                priorityQueue.poll();
            }
        }
       List<Integer> list=new LinkedList<>();
        while (!priorityQueue.isEmpty()){
            list.add(priorityQueue.poll());
        }
        Collections.sort(list);
        return list.toArray(new Integer[0]);

    }
}
