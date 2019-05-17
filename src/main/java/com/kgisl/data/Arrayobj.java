package com.kgisl.data;
import java.lang.reflect.Field;
import java.util.ArrayList;
public class Arrayobj {

   public static void main(String[] args) throws Exception {
       ArrayList<Integer> list = new ArrayList<Integer>(5);
       for (int i = 0; i <10; i++) {
           list.add(i);
           System.out.format("Size: %2d, Capacity: %2d%n",
                             list.size(), getCapacity(list));
       }
   }

   static int getCapacity(ArrayList<Integer> list) throws Exception {
       // Field x = Student1.class.getDeclaredField("rollno");
       Field d = ArrayList.class.getDeclaredField("elementData");
        
       d.setAccessible(true);
       return ((Object[]) d.get(list)).length;
   }
}