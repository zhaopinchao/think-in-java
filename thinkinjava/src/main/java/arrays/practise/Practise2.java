package arrays.practise;

import arrays.CountingMapData;
import arrays.Countries;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Practise2 {

    public static void main(String[] args) {
        int size = Countries.DATA.length;
        Map<String, String> map = new HashMap<String, String>();
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < size; i++) {
            if (Countries.DATA[i][0].startsWith("A")){
                map.put(Countries.DATA[i][0],Countries.DATA[i][1]);
                set.add(Countries.DATA[i][0]);
            }
        }
        System.out.println("map = " + map);
        System.out.println("set = " + set);
    }
}
