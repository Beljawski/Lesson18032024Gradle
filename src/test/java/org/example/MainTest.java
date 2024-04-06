package org.example;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    int[] arr;

    @BeforeEach
    void init() {
//        arr = new int[]{1, 2, 3, 5};
        System.out.println("BeforeEach");
    }

    @AfterEach
    void initAfter() {
        System.out.println("AfterEach");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("BeforeAll");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("AfterAll");
    }

    @Test
    void getNumbersSuccessTest() {
        int[] arr = {1, 2, 3, 5};
        assertEquals(Arrays.toString(arr), Arrays.toString(Main.getNumbers()));
        System.out.println("Test 1");
    }

    @Test
    void getNumbersFailTest() {
        int[] arr = {1, 2, 3, 6};
        assertNotEquals(Arrays.toString(arr), Arrays.toString(Main.getNumbers()));
        System.out.println("Test 2");
    }
    @Test
    void getNumbersLengthSuccessTest() {
        assertEquals(4, Main.getNumbers().length);
        System.out.println("Test 3");
    }

    @Test
    void getNumbersLengthFailTest() {
        assertFalse(5 == Main.getNumbers().length);
        assertFalse(3 == Main.getNumbers().length);
        System.out.println("Test 4");
    }

    @Test
    void findMaxSuccessTest() {
        int[] arr = {1, 2, 3, 5};
        assertEquals(5, Main.findMax(arr));
    }
    @Test
    void findMaxFailTest() {
        int[] arr = {1, 2, 3, 5};
        assertNotEquals(2, Main.findMax(arr));
    }
    @Test
    void findNotEmptyArrayTest(){
        int[] arr = {1, 2, 3, 5};
        assertTrue(arr.length>0);
    }
    @Test
    void findEmptyArrayTest(){
        int[] arr = new int[0];
        assertTrue(arr.length==0);
    }

}
