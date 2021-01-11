/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.sort;

/**
 *
 * @author 37067
 */
public class ArraySort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] masyvas = {-15, 42, 15, 98, -2, -47, 10, 3, -14, 36};
        int temporary = 0;
        System.out.println("Origial array:");
        for (int i = 0; i < masyvas.length; i++) {
            System.out.print(masyvas[i] + " ");
        }
        for (int i = 0; i < masyvas.length; i++) {
            for (int j = i + 1; j < masyvas.length; j++) {
                if (masyvas[i] > masyvas[j]) {
                    temporary = masyvas[i];
                    masyvas[i] = masyvas[j];
                    masyvas[j] = temporary;
                }
            }
        }
        System.out.println();
        System.out.println("Array sorted in ascending order:");
        for (int i = 0; i < masyvas.length; i++) {
            System.out.print(masyvas[i] + " ");
        }
        for (int i = 0; i < masyvas.length; i++) {
            for (int j = i + 1; j < masyvas.length; j++) {
                if (masyvas[i] < masyvas[j]) {
                    temporary = masyvas[i];
                    masyvas[i] = masyvas[j];
                    masyvas[j] = temporary;
                }
            }
        }
        System.out.println();
        System.out.println("Array sorted in descending order:");
        for (int i = 0; i < masyvas.length; i++) {
            System.out.print(masyvas[i] + " ");
        }
        System.out.println();
        
    }
    
}
