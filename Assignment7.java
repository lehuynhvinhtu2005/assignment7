
package assignment7;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Assignment7 {
    public static float[] importData(float[] mangsothuc) {
        Scanner keyboard = new Scanner(System.in);
        
        for(int i=0;i<mangsothuc.length;i++)
        {
            System.out.print("Nhap phan tu thu "+(i+1)+":");
            mangsothuc[i]=keyboard.nextFloat();   
        }
        return mangsothuc;
    }
    public static void printData(float[] mangsothuc) {
        System.out.print("Mang vua nhap la : "+Arrays.toString(mangsothuc));
         System.out.println();
    }    
    public static float findMax2(float[] mangsothuc) {
        float max1=Float.NEGATIVE_INFINITY;
        float max2=Float.NEGATIVE_INFINITY;
        for (int i=0;i<mangsothuc.length;i++) {
            if (mangsothuc[i] > max1) {
                max2 = max1;
                max1 = mangsothuc[i];
            } else if (mangsothuc[i] > max2 && mangsothuc[i] < max1) {
                max2 = mangsothuc[i];
            }
        }
        return max2;
    }
    public static void deleteOddNumber(float[] mangsothuc) {
        float[] mangchan = new float[mangsothuc.length];
        for (int i=0;i<mangsothuc.length;i++) {
            if (mangsothuc[i] % 2 == ) {
                for(int j=0;j<mangsothuc.length;j++){
                    mangchan[j]=mangsothuc[i];
                }
            }
        }
        Arrays.toString(mangchan);
    }
    public static void main(String[] args) {
        System.out.print("Nhap so phan tu trong mang : ");
        Scanner keyboard = new Scanner(System.in);
        int a=keyboard.nextInt();
        float[] arrays = new float[a];
        importData(arrays);
        printData(arrays);
        System.out.println("Phan tu lon thu 2 trong mang la : "+findMax2(arrays));
        System.out.println("Mang sau khi xoa cac so le la : ");
        deleteOddNumber(arrays);
    }
    
}
