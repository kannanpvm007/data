package com.kgisl.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> ar = new ArrayList<String>();
        System.out.println("hi");
       // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=1;i<=3;i++){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String h=br.readLine();
            ar.add(h);
        }
        System.out.println("reply"+ar);
    }
}