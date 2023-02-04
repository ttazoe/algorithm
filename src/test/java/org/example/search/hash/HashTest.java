package org.example.search.hash;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashTest {
    @Test
    public void testHash(){
        Hash hash = new Hash(11);
        hash.insert("AAA");
        hash.insert("AAA");
        hash.insert("AAC");
        assertTrue(hash.search("AAA"));
        assertFalse(hash.search("CCC"));
        hash.insert("CCC");
        assertTrue(hash.search("CCC"));
    }
}