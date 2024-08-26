package MapAndTree;
import java.util.HashMap;
import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the map");
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            System.out.println("Nhap key");
            String key=sc.nextLine();
            System.out.println("Nhap value");
            int value=Integer.parseInt(sc.nextLine());
            hashMap.put(key,value);
        }
        System.out.println("Hashmap"+hashMap);
        String key=sc.nextLine();
        boolean flag=hashMap.containsKey(key);

        String result=flag?"Key '"+key+"' is found":"Key '"+key+"' is not found";

    }
}
