package The1500.P1400.P1400.Q1396;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCodePractice
 * 设计地铁系统
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/4/2 10:33
 * @since JDK17
 */


class UndergroundSystem {
    // 自定义对应的时间节点
    public class TimeNode {
        public String stationName;
        public int t;
        TimeNode(String stationName, int t) {
            this.stationName = stationName;
            this.t = t;
        }
    }
    Map<String, Long[]> avgMap;
    Map<Integer, TimeNode> startMap;
    public UndergroundSystem() {
        avgMap = new HashMap<>();
        startMap = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        startMap.put(id, new TimeNode(stationName,t));
    }

    public void checkOut(int id, String stationName, int t) {
        TimeNode node = startMap.get(id);
        startMap.remove(id);
        String startStation = node.stationName;
        String endStation = stationName;
        String key = startStation+"@"+endStation;
        Long[] record = avgMap.getOrDefault(key, new Long[]{0L,0L});
        record[0] += t-node.t;
        record[1]++;
        avgMap.put(key, record);
    }

    public double getAverageTime(String startStation, String endStation) {
        String key = startStation+"@"+endStation;
        Long[] record = avgMap.get(key);
        return ((double)(record[0]))/record[1];
    }
}


