
import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Pascals_Triangle {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
                 ArrayList<ArrayList<Long>> pascalTriangle = new ArrayList<>();

        // Base case: First row of Pascal's Triangle
        ArrayList<Long> firstRow = new ArrayList<>();
        firstRow.add(1L);
        pascalTriangle.add(firstRow);

        // Build Pascal's Triangle row by row
        for (int i = 1; i < n; i++) {
            ArrayList<Long> currentRow = new ArrayList<>();
            ArrayList<Long> previousRow = pascalTriangle.get(i - 1);

            // First element of the current row is always 1
            currentRow.add(1L);

            // Calculate the elements in the current row
            for (int j = 1; j < i; j++) {
                long num = previousRow.get(j - 1) + previousRow.get(j);
                currentRow.add(num);
            }

            // Last element of the current row is always 1
            currentRow.add(1L);

            pascalTriangle.add(currentRow);
        }

        return pascalTriangle;
	}
}
