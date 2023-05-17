import java.util.*;

class dumpling extends Thread {
    static int pork = 5000, beef = 3000, vegetable = 1000; 

    public synchronized void run() {
        int count = (int) (Math.random() * 41) + 10;
        if (count % 3 == 0) {
            if (pork - count >= 0) {
                pork -= count;
            } else {
                System.out.println("豬肉水餃已售完");
            }
        }
        if (count % 3 == 1) {
            if (beef - count >= 0) {
                beef -= count;
            } else {
                System.out.println("牛肉水餃已售完");
            }
        }
        if (count % 3 == 2) {
            if (vegetable - count >= 0) {
                vegetable -= count;
            } else {
                System.out.println("蔬菜水餃已售完");
            }
        }

        try{
        Thread.sleep(3000);
        }catch(InterruptedException e){

        }
    }

}

public class A1113306_0512 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("輸入顧客數目:");
        int customer = sc.nextInt();
        for (int i = 1; i <= customer; i++) {
            dumpling a = new dumpling(); 
            a.start();
        }
    }
}
