package DomashkiJava.Hw3Java;

import java.util.ArrayList;
import java.util.Random;

public class hw1 {
    //Реализовать алгоритм сортировки слиянием

    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(-100, 100);
            list1.add(val);
             }
        System.out.printf("Входной массив: %s\n", list1);
    
    } public static void mergeSort(int[] list1, int left, int right) {
        int mid = (left + right) / 2;
            if ((left + right) < 2) return;
            mergeSort(list1, left, mid);
            mergeSort(list1, mid+1, right);
            merge(list1, left, mid, right);
            
    } private static void merge(int[] list1, int left, int mid, int right) {
        int lengthLeft = mid - left +1;
        int lengthRight = right - mid;
        int leftArray[] = new int [lengthLeft];
        int rightArray[] = new int [lengthRight];
            for (int i = 0; i < lengthLeft; i++) leftArray[i] = list1[left+1];
            for (int i = 0; i < lengthRight; i++) rightArray[i] = list1[mid+i+1];
    }
        
}
  