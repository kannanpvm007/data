
package com.kgisl.data;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

class oneTest{
    // public static void main(String[] args) {
        
    // }
    @Before
    public static void calculator(){
        System.out.print("@Before");

    } @After
    public static void after(){
        System.out.print("After");

    } 
    @BeforeClass
    public static void BeforeClass(){
        System.out.print("@BeforeClass");

    } 
    @AfterClass
    public static void AfterClass(){
        System.out.print("@AfterClass");

    } @Test
    public static void Test(){
        System.out.print("@Test");

    } 
}