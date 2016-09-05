package Experiment_2;

import java.util.Scanner;

public class B {
    public static void main(String args[]){
        StringBuffer text1=new StringBuffer();
        StringBuffer text2=new StringBuffer();
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First String : ");
        text1.append(sc.next());
        System.out.print("\nEnter Second String : ");
        text2.append(sc.next());
        text1.append(text2);
        System.out.println("\nAppended String is : "+text1);
        System.out.println("\nReverse String is : "+text1.reverse());
        text2.insert(2,"Hello");
        System.out.println("\nInsert Hello in StringBuffer : "+text2);
        System.out.println("\nCapacity of First StringBuffer : "+text1.capacity());
        System.out.println("\nSubString : "+text1.substring(2));
    }
}
