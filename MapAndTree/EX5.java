package MapAndTree;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeMap;

public class EX5 {
    public static void main(String[] args) {
        int n=10;
        Random random=new Random();

        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=random.nextInt(10)+1;
        }

        for (int num : a) {
            System.out.print(num+" ");
        }
        //Khai bao TreeMap de luu tru cac phan tu
        TreeMap<Integer, Integer> map1=new TreeMap<>();
        for (int num : a) {
            map1.put(num, 0);
        }
        int minElement=map1.firstKey();
        System.out.println("nho nhat"+minElement);
        //Khai bao treemap thu hai sap xep theo thu tu giam dan
        TreeMap<Integer, Integer> map2=new TreeMap<>(Comparator.reverseOrder());
        map2.putAll(map1);
        map2.remove(minElement);
        //Tim phan tu lon thu 2 trong mang
    }
}
