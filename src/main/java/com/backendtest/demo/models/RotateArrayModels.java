package com.backendtest.demo.models;

/**
 * RotateArrayModels
 */
public class RotateArrayModels {
    // rotate array counterclockwise 90º
    public static int [][] rotateArray(int [][] array) {
        int sizeArray = array.length;
        int[][] newrotatedArray = new int[sizeArray][sizeArray];

        for (int x = 0; x < sizeArray; x++) {
            for (int y = 0; y < sizeArray; y++) {
                newrotatedArray[sizeArray - 1 - y][x] = array[x][y];
            }
        }
        return newrotatedArray;
    }
    
}