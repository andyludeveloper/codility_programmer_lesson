package main.java.com.codility.app;

import java.util.ArrayList;

public class Lesson1_BinaryGap {
    public static void main(String[] args){
        int result = new Lesson1_BinaryGap().solution(529 );
        System.out.println(result);
    }

    public int solution(int N){
        int gapResult = 0;
        char[] result = Integer.toBinaryString(N).toCharArray();
        ArrayList<Integer> oneList = new ArrayList<>();
        for(int i=0; i<result.length;i++){
            if(result[i] == '1'){
                oneList.add(i);
            }
        }

        for(int idx = oneList.size()-1; idx>0;idx--){
            if((oneList.get(idx) - oneList.get(idx-1) -1)>gapResult){
                gapResult = oneList.get(idx) - oneList.get(idx-1) -1;
            }
        }

        return gapResult;
    }
}
