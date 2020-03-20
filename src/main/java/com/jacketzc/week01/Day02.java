package com.jacketzc.week01;

import org.junit.Test;

import java.util.Scanner;

public class Day02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a);
    }
    @Test
    public void test1(){
        int x=10;
        int y=(x++)+(++x)+(x--)-(--x);
        System.out.println(y);
    }
    @Test
    public void test2(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a);
    }
}
