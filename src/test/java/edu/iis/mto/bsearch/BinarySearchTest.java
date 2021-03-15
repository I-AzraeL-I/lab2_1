package edu.iis.mto.bsearch;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


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

}
