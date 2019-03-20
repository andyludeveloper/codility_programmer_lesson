package main.java.com.codility.app;

public class Lesson2_CyclicRotation {

    public int[] solution(int[] A, int K){
        int[] resultArray = new int[A.length];
        if(A.length > 0) {
            int realShift = K % A.length;
            for (int i = 0; i < A.length; i++) {
                resultArray[(realShift + i) % A.length] = A[i];
            }
        }
        return resultArray;
    }
}
