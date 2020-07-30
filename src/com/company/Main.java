package com.company;
import java.io.*;
public class Main {

    public static void main(String[] args)  throws IOException{
	    int nr;
        nr = (int) System.in.read();
	    numar(nr);
    }
    static void numar(int nr){
        if(nr%2==0)
            System.out.println("Nr este par");
        else
            System.out.println("Nr este impar");
    }
}
