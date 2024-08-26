package MapAndTree;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Nhap so luong phan tu");
        int n = Integer.parseInt(sc.nextLine());
        Random r = new Random();

        for (int i = 0; i < n; i++) {
            int x = r.nextInt(10)+1;
            list.add(x);
            System.out.println(x);

        }

        HashMap<Integer, Integer> elementCountMap = new HashMap<>();
        for (int x:list) {
            if(elementCountMap.containsKey(x)) {
                elementCountMap.put(x, elementCountMap.get(x)+1);
            }else {
                elementCountMap.put(x, 1);
            }
        }
        System.out.println("So lan xuat hien cua ca phan tu trong danh sach");
        for (HashMap.Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}
