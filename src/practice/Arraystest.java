package practice;

import java.util.Arrays;

public class Arraystest {
    public static void main(String[] args) {
        int[] arr = {34,2,4655,23,234,21,213};
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr,21);
        System.out.println(index);
        
    }
}
