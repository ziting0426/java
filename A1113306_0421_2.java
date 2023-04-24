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
        char[] birthyear = new char[4];
        char[] birthmonth = new char[4];
        char[] birthdate = new char[4];
        // System.out.println("你的出生日期為:"+birthday);
        if(birthday.matches("[12]{1}[0-9]{3}[/]{1}[01]{1}[0-9]{1}[/]{1}[0-3]{1}[0-9]{1}")==true){
        birthday.getChars(0, 4, birthyear, 0);
        birthday.getChars(5, 7, birthmonth, 0);
        birthday.getChars(8, 10, birthdate, 0);
        }
        if(birthday.matches("[01]{1}[0-9]{1}[/]{1}[0-3]{1}[0-9]{1}[/]{1}[12]{1}[0-9]{3}")==true){
            birthday.getChars(6,10, birthyear, 0);
            birthday.getChars(0, 2, birthmonth, 0);
            birthday.getChars(3, 5, birthdate, 0);
            }
        // System.out.println("你的出生日期為:"+birthyear+"年"+birthmonth+"月"+birthdate+"日");
        System.out.print("你的出生日期為:");
        System.out.print(birthyear);
        System.out.print("年");
        System.out.print(birthmonth);
        System.out.print("月");
        System.out.print(birthdate);
        System.out.print("日");
    }
}