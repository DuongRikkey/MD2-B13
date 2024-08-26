package MapAndTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;

public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cho mang");
        int n=Integer.parseInt(sc.nextLine());
        int[] arr= new int[n];
          for (int i = 0; i < n; i++) {
              System.out.println("Nhap cac phan tu co trong mang");
              arr[i]=Integer.parseInt(sc.nextLine());
          }
        HashMap<Integer,Integer> elementCountMap=new HashMap<>();

        for (int duong:arr) {
            if(elementCountMap.containsKey(duong)){
                elementCountMap.put(duong,elementCountMap.get(duong)+1);

            }else
                elementCountMap.put(duong,1);
        }
        List<Integer> uniqueElements = new ArrayList<>();
        for(HashMap.Entry<Integer,Integer> entry:elementCountMap.entrySet()){
            if(entry.getValue()==1){
                uniqueElements.add(entry.getKey());
            }
        }
        System.out.println("In ra mang phan tu duy nha");
        for (int element:uniqueElements) {
            System.out.print(element+" ");
        }

     }
}
