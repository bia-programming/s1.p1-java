package com.company;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  throws IOException{
        final Scanner myInput = new Scanner(System.in);
        final int nr = myInput.nextInt();
	    numar(nr);
    }
    static void numar(final int nr){
        if(nr%2==0)
            System.out.println("Nr este par");
        else
            System.out.println("Nr este impar");
    }
}
