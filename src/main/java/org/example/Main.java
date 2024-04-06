package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr= getNumbers();
        System.out.println(Arrays.toString(arr));
        System.out.println(findMax(arr));
    }
    public static int[] getNumbers(){
        int[] arr = {1,2,3,5};
        return arr;
    }
    public static int findMax(int[] arr){
        int max =arr[0]; //Gehen davon aus, dass 1.Index maximal ist
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max){
                max =arr[i];
            }
        }
        return max;
    }
}
