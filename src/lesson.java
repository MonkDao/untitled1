import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class lesson {
    public static void main(String[] args) {
        int[]intArrays = new int[10];
        intArrays[2] = 2;
        intArrays[3] = 2;
        int[]Arraystwo = new int[]{1,2,5,7};
        int n = 100;
        int[] a = new int[n + n];
        int d =a.length;

        Scanner myScan = new Scanner(System.in);
        int[]m= new int[10];
        for(int i=0;i<10; i++){
            m[i]= myScan.nextInt();
        }
        System.out.println(m[3]);
        String str = Arrays.toString(intArrays);
    }
}
