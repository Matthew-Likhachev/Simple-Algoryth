package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number");
        //intput
        int n = in.nextInt();
        long row, coloumn;
        for(coloumn=n-1;coloumn<=2*n-1;coloumn++){
            for(row=n-1;row<=2*n-1; row++){
                //if(Math.abs())
                System.out.print((char)(65+row-coloumn)+" ");
            }
            System.out.println();
        }
    }
}
