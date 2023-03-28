import java.util.*;

class animal{

    String name;
    double height;
    int weight;
    int speed;
    
    void show(){
        System.out.println("姓名:"+name);
        System.out.println("身高:"+height);
        System.out.println("體重:"+weight);
        System.out.println("速度:"+speed);
    }

    double distance (int x,double y){
         double p=x*y*speed;
         return p;
    }

    int distance (int x){
        int p=x*speed;
        return p;
    }
}

public class A1113306_0324_1{
    public static void main(String[] args){

        animal[] a = new animal[4];

        a[0]=new animal();
        a[0].name="雪寶";
        a[0].height=1.1;
        a[0].weight=52;
        a[0].speed=100;

        a[1]=new animal();
        a[1].name="驢子";
        a[1].height=1.5;
        a[1].weight=99;
        a[1].speed=200;

        a[2]=new animal();
        a[2].name="安那";
        a[2].height=1.7;
        a[2].weight=48;
        a[2].speed=120;

        a[3]=new animal();
        a[3].name="愛沙";
        a[3].height=1.7;
        a[3].weight=50;
        a[3].speed=120;

        a[0].show();
        a[1].show();
        a[2].show();
        a[3].show();
        
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++){
            System.out.print("輸入"+a[i].name+"的時間:");
            int k = sc.nextInt();
            System.out.print("輸入"+a[i].name+"的加速度(如沒有輸入0):");
            double j = sc.nextDouble();
            if(j==0){
                System.out.println(a[i].distance(k));
            }
            if(j!=0){
                System.out.println(a[i].distance(k,j));
            }
        }

    }
}
