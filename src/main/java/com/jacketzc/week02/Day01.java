package com.jacketzc.week02;

import java.util.Scanner;

public class Day01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name="12345";
        String passwd="12345";
        String n,p;
        int i;
        for (i=0;i<3;i++){
            System.out.print("请输入用户名：");
            n=scanner.next();
            System.out.print("请输入密码：");
            p=scanner.next();
            if(n.equals(name)&&p.equals(passwd)){
                System.out.println("登陆成功");
                break;
            }else
                System.out.println("登录失败，你还有"+(2-i)+"次机会");
        }
        if(i==3){
            System.out.println("登录失败");
        }
    }
}
