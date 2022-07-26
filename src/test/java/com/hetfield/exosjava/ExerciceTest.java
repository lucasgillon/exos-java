package com.hetfield.exosjava;

import static org.junit.Assert.*;
import org.junit.Test;

public class ExerciceTest {
    @Test
    public void testExample() {
        System.out.println("****** Basic Tests ******");
        assertEquals(3, Exercice.persistence(39));
        assertEquals(0, Exercice.persistence(4));
        assertEquals(2, Exercice.persistence(25));
        assertEquals(4, Exercice.persistence(999));
    }
}
