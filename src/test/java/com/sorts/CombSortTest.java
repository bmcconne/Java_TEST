package com.sorts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CombSortTest {

    CombSort combSort = new CombSort();

    @Test
    void testIntegerSort(){

        Integer array1[] =  { 9, 5, 4, 6, 0, 100, 91, 40, 140, 500, 4, -1, -19};
        Integer array2[] =  { 9, 5, 4, 6, 0, 100, 91, 40, 140, 500, 4, -1, -19};

        //using Java's tested sort algorithm to sort our unsorted array
        Arrays.sort(array1);

        //sort our unsorted array using our new CombSort algorithm
        combSort.sort(array2);

        //compare the two results, our CombSort vs. Java's sort
        Assertions.assertArrayEquals(array1,array2);
    }

    @Test
    void testStringSort(){

        String array1[] =  { "Ten" , "Nine", "Eight", "Seven", "Six", "Five", "Four", "One", "Zero" };
        String array2[] =  { "Ten" , "Nine", "Eight", "Seven", "Six", "Five", "Four", "One", "Zero" };

        //using Java's tested sort algorithm to sort our unsorted array
        Arrays.sort(array1);

        //sort our unsorted array using our new CombSort algorithm
        combSort.sort(array2);

        //compare the two results, our CombSort vs. Java's sort
        Assertions.assertArrayEquals(array1,array2);
    }

    @Test
    void testDoubleSort(){

        Double array1[] =  { 90.0, -10.0, 0.0, -1.0, -23.98, 10.76, 20.92 };
        Double array2[] =  { 90.0, -10.0, 0.0, -1.0, -23.98, 10.76, 20.92 };

        //using Java's tested sort algorithm to sort our unsorted array
        Arrays.sort(array1);

        //sort our unsorted array using our new CombSort algorithm
        combSort.sort(array2);

        //compare the two results, our CombSort vs. Java's sort
        Assertions.assertArrayEquals(array1,array2);
    }

    @Test
    void testCharacterSort(){

        Character array1[] =  { 'Z', 'A', 'B', 'z', 'b', 'c' };
        Character array2[] =  { 'Z', 'A', 'B', 'z', 'b', 'c' };

        //using Java's tested sort algorithm to sort our unsorted array
        Arrays.sort(array1);

        //sort our unsorted array using our new CombSort algorithm
        combSort.sort(array2);

        //compare the two results, our CombSort vs. Java's sort
        Assertions.assertArrayEquals(array1,array2);
    }
}