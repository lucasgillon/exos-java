package com.hetfield.exosjava;

import static org.junit.Assert.*;
import org.junit.Test;

public class ExerciceTest {

    @Test
    public void test() {
        System.out.println("Fixed Tests calculateYears");
        assertEquals(3, Exercice.calculateYears(1000,0.05,0.18,1100));
        assertEquals(14 , Exercice.calculateYears(1000,0.01625,0.18,1200));
        assertEquals(0, Exercice.calculateYears(1000,0.05,0.18,1000));
    }
}