package Experiment_1;

public class D {

    public static void main(String[] args){

        int n = Integer.parseInt(args[0]);

        for(int i=0;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
                if(k>=1)
                    System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=n;k>=i;k--){
                System.out.print("*");
                if(k<n)
                    System.out.print("*");
            }
            System.out.print("\n");
        }
    }

}
