package Experiment_2;

import java.util.Arrays;
import java.util.Scanner;

public class A {
    public static void main(String[] args){
        int[] a=new int[10];
        int max = 0;
        int min = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 digits : ");
        for(int i=0;i<10;i++){
            a[i]=sc.nextInt();
            if (i==0)
                min = a[0];
            if(a[i]>max)
                max = a[i];
            if(min>a[i])
                min = a[i];
        }
        System.out.println("max : "+max);
        System.out.println("min : "+min);

        Arrays.sort(a);

        for (int i=0;i<a.length ;i++ ) {
            System.out.print(a[i]+" ,");
        }
    }
}
