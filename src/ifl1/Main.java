package ifl1;

import abiturklassen.BinaryTree;
import abiturklassen.List;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{88, 349, 975, 308, 878, 894, 325, 560, 794, 172, 121, 526, 750, 55, 866};
        Sorting.sortingArrayRecursive2(arr,arr.length);
        Sorting.printArray(arr);
    }
}