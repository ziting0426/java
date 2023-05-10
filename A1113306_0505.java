import java.util.*;

class MyException extends Exception {
    MyException(String a) {
        super(a);
    }
}

public class A1113306_0505 {
    public static void main(String[] args) throws Exception {
        int[] success = { 15, 18, 20, 33, 42, 48 };
        System.out.print("輸入在1-49之間的六個整數:");
        int[] array = new int[6];
        try {
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < 6; i++) {
                array[i] = sc.nextInt();
            }
            for (int k = 0; k < 6; k++) {
                if (array[k] < 1 | array[k] > 49) {
                    throw new MyException("要在1-49之間");
                }
            }
            for (int j = 0; j < 6; j++) {
                for (int m = 0; m < 6; m++) {
                    if (success[j] == array[m]) {
                        success[j] = 0;
                    }
                }
            }
            int count = 0;
            for (int h = 0; h < 6; h++) {
                if (success[h] == 0) {
                    count++;
                }
            }
            if (count == 6) {
                System.out.println("中獎");
            } else {
                System.out.println("沒中獎");
            }
        } catch (MyException wrong) {
            System.out.println("例外訊息:" + wrong);
        } catch (InputMismatchException wrong) {
            System.out.println("請輸入整數");
        } catch (RuntimeException wrong) {
            System.out.println("輸入的有錯，例外訊息:" + wrong);
        }

    }
}
