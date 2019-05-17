package com.kgisl.data;

import java.util.*;
/**
 * Clonelist
 */
public class Clonelis {

    public static void main(String[] args) {
        Object cloning,remove;
        ArrayList<String> list=new ArrayList<String>();
        list.add("sanju");
        list.add("kannan");
        System.out.println(list);
        cloning=list.clone();
        remove=list.remove(1);
        System.out.println(remove);
        System.out.println(cloning);
        

    }
}