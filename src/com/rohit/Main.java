package com.rohit;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count = 0;
        int count1 = 0;
        int n = 1;
        int p = 0;

        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.println(count++);
            }
        }

        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                System.out.println(count1++);
            }
        }

        System.out.println("==============");

        for(int i=0;p<n;i++){
            p = p+ i;
            System.out.println(p);
        }
    }
}
