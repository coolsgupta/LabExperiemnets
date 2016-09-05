package Experiment_2;

import java.util.Scanner;

public class C {
    public static void main(String arg[]){
        String text1,text2;
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First String : ");
        text1=sc.next();
        System.out.print("\nEnter Second String : ");
        text2=sc.next();
        System.out.print("\nEnter number : ");
        i=sc.nextInt();
        System.out.println("\nChar at "+i+" is : "+text1.charAt(i));
        System.out.println("Length of String : "+text1.length());
        //System.out.println("Comparing String :"+text1.compareTo(text2));
        int j=text1.compareTo(text2);
        if(j==0){
            System.out.println("Same Size");
        }else if(j>0){
            System.out.println("First Bigger");
        }else{
            System.out.println("Second Bigger");
        }
    }
}
