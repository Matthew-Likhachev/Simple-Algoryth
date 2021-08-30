package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number");
        //intput
        int n = in.nextInt();
        long row, coloumn;
        for(coloumn=-n+1;coloumn<n;coloumn++){
            for(row=-n+1;row<n; row++){
                //condition for non-empty blocks
                if(Math.abs(row)+1 >= n-Math.abs(coloumn)){
                    System.out.print((char)(64+(n-Math.abs(row)))+" ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
