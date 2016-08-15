package Experiment_1;

public class Exp1_B {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);

        int ans = (a/c)*b/a;
        System.out.println("(a/c)*b/a = "+ans);
        ans = c++ + b/a - d;
        System.out.println("c++ + b/a - d = g"+ans);
    }
}
