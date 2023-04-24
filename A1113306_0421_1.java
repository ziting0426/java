import java.util.*;
public class A1113306_0421_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        int count=0;
        do{
        if(count>0){
            System.out.println("格式錯誤!請重新輸入");
        }
        System.out.print("輸入電子郵件:");
        a = sc.next();
        count++;
        }while((a.matches("[a-z0-9]{1,}[@]{1}[a-z.]{1,}"))==false);
        System.out.println("您的電子郵件為:"+a);
    }
}
