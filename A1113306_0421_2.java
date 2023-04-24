import java.util.*;
public class A1113306_0421_2 {
    public static void main(String[] args) {
        String birthday;
        int count=0;
        do{
        if(count>0){
            System.out.println("格式有誤!請充新輸入");
        }
        System.out.print("輸入出生日期:");
        Scanner sc = new Scanner(System.in);
        birthday = sc.next();
        count++;
        }while(birthday.matches("[12]{1}[0-9]{3}[/]{1}[01]{1}[0-9]{1}[/]{1}[0-3]{1}[0-9]{1}")==false && birthday.matches("[01]{1}[0-9]{1}[/]{1}[0-3]{1}[0-9]{1}[/]{1}[12]{1}[0-9]{3}")==false);
        System.out.println("你的出生日期為:"+birthday);
    }
}