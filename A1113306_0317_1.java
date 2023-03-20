import java.util.*;
public class A1113306_0317_1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("輸入n:");
        int n = sc.nextInt();
        System.out.print("輸入m:");
        int m = sc.nextInt();

        int[][] a = new int[n][m];
        
        for(int i=0;i<=n-1;i++){
            for(int k=0;k<=m-1;k++){
                a[i][k] = (i+1)*(k+1);
            }
        }

        int p=1;
        int h=1;

        for(int[] b:a){
            for(int num:b){
                System.out.print(p+"*"+h+"="+num+"\t");
                h++;
            }
            System.out.print("\n");
            p++;
            h=1;
        }


    }
}
