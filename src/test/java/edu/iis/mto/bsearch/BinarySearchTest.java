package edu.iis.mto.bsearch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class BinarySearchTest {

    @BeforeEach
    void setUp() throws Exception {}

    @Test
    void SequenceLengthEqualsOneAndElementInSequence() {
        int[] seq = {5};
        int key = 5;

        SearchResult result = BinarySearch.search(key, seq);
        assertTrue(result.isFound());
        assertEquals(key, seq[result.getPosition()]);
    }

    @Test
    void SequenceLengthEqualsOneAndElementNotInSequence() {
        int[] seq = {5};
        int key = 1;
        int NOT_FOUND = -1;

        SearchResult result = BinarySearch.search(key, seq);
        assertFalse(result.isFound());
        assertEquals(NOT_FOUND, result.getPosition());
    }

}
