package com.csaba79coder.algorecap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueElementTest {

    UniqueElement uniqueElement = new UniqueElement();

    /*
     1, 2, 3 -> 1, 2, 3
     1, 1, 2, 2, 3, 3 -> null
     1, 2, 2, 3, 4, 4 -> 1, 3
    */
    @Test
    public void testFindUniqueElements() {
        assertArrayEquals(new int[]{1, 2, 3}, uniqueElement.findUniqueElements(new int[]{1, 2, 3}));
        assertNull(uniqueElement.findUniqueElements(new int[]{1, 1, 2, 2, 3, 3}));
        assertArrayEquals(new int[]{1, 3}, uniqueElement.findUniqueElements(new int[]{1, 2, 2, 3, 4, 4}));
    }

    @Test
    public void testFindUniqueElements2() {
        assertArrayEquals(new int[]{1, 2, 3}, uniqueElement.findUniqueElements2(new int[]{1, 2, 3}));
        assertNull(uniqueElement.findUniqueElements2(new int[]{1, 1, 2, 2, 3, 3}));
        assertArrayEquals(new int[]{1, 3}, uniqueElement.findUniqueElements2(new int[]{1, 2, 2, 3, 4, 4}));
    }
}