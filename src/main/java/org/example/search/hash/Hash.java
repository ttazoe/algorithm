package org.example.search.hash;

import java.util.Arrays;

public class Hash {
    String[] table;
    int primeNumber;

    public Hash(int length){
        table = new String[length];
        primeNumber = getPrime();
    }

    public int insert(String s){
        int stringHashCode = s.hashCode();
        int iteration = 0;

        while (true) {
            int hashKey = calcHash(stringHashCode, iteration);
            if(table[hashKey] == null) {
                table[hashKey] = s;
                System.out.println(hashKey);
                return hashKey;
            }
            iteration++;
        }
    }

    public boolean search(String s) {
        int stringHashCode = s.hashCode();
        int iteration = 0;

        while(true) {
            int hashKey = calcHash(stringHashCode, iteration);
            if (s == table[hashKey]) {
                System.out.println(hashKey);
                return true;
            }
            if (table[hashKey] == null) {
                return false;
            }
            iteration++;
        }
    }

    public int getPrime() {
        for (int i = table.length; i >= 1; i--) {
            int fact = 0;
            for (int j = 2; j <= (int) Math.sqrt(i); j++) {
                if (i % j == 0) {
                    fact++;
                }
            }
            if (fact == 0) {
                return i;
            }
        }
        return 3;
    }

    public int calcHash(int x, int iteration) {
        return (firstHash(x) - iteration * secondHash(x)) % table.length;
    }
    public int firstHash(int x) {
        return x % table.length;
    }

    public int secondHash(int x) {
        return primeNumber + x % primeNumber;
    }

    @Override
    public String toString() {
        return "Hash{" +
                "table=" + Arrays.toString(table) +
                ", primeNumber=" + primeNumber +
                '}';
    }
}
