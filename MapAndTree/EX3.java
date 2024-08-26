package MapAndTree;

import java.util.*;
import java.util.HashMap;


public class EX3 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Duong", 10);
        hm.put("Duy", 3);
        hm.put("Danh", 5);
        hm.put("Duyen", 2);

        //B2 Tao danh sach tu cac cap key_value
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(hm.entrySet());
        Collections.sort(entryList,Map.Entry.comparingByValue());

        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        };

    }

}
