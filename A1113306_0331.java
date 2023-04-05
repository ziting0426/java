import java.util.*;
class animal{

    String name;
    double height;
    int weight;
    int speed;

    animal(String name,double height,int weight,int speed){
        this.name=name;
        this.height=height;
        this.weight=weight;
        this.speed=speed;
    }

    void show(){
        System.out.println("名字:"+name);
        System.out.println("身高:"+height);
        System.out.println("體重"+weight);
        System.out.println("速度:"+speed);
    }

    double distance(int x,double y){
        return x*y*speed;
    }

    int distance(int x){
        return x*speed;
    }

    static void showinfo(){
        System.out.println("歡迎進入冰雪奇緣系統");
    }
}

class human extends animal{

    String sex;

    human(String name,double height,int weight,int speed,String sex){
        super(name, height, weight, speed);
        this.sex = sex;
    }

    void show(){
        super.show();
        System.out.println("性別:"+sex);
    }
}

class snow extends human{

    boolean skill;

    snow(String name,double height,int weight,int speed,String sex,boolean skill){
    super(name,height,weight,speed,sex);
    this.skill = skill;
    }

    void show(){
        super.show();
        String word;
        if(skill==true){
            word = "Yes";
        }
        else{
            word = "X";
        }
        System.out.println("冰凍技能:"+word);
    }

    double distance(int x,double y){
        return x*y*speed*2;
    }

    int distance(int x){
        return x*speed*2;
    }

}

public class A1113306_0331 {
    public static void main(String[] args) {

        animal.showinfo();

        snow[] role = new snow[6];
        
        role[0] = new snow("雪寶",1.1,52,100,"X",false);
        role[1] = new snow("驢子",1.5,99,200,"X",false);
        role[2] = new snow("阿克",1.9,80,150,"男",false);
        role[3] = new snow("漢斯",1.8,78,130,"男",false);
        role[4] = new snow("安那",1.7,48,120,"女",false);
        role[5] = new snow("愛沙",1.7,50,120,"女",true);

        for(int i=0;i<6;i++){
            role[i].show();
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);
        for(int k=0;k<6;k++){
            System.out.print("輸入"+role[k].name+"的x:");
            int a = sc.nextInt();
            System.out.print("輸入"+role[k].name+"的y(沒有則輸入0):");
            double b = sc.nextDouble();
            if(b==0){
                System.out.println(role[k].name+"奔跑的距離為:"+role[k].distance(a));
            }
            else{
                System.out.println(role[k].name+"奔跑的距離為:"+role[k].distance(a,b));
            }
        }
    }
}
