package com.hackerearth;
import java.io.*;
import java.util.*;


class TestClass4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        String[] arr_A = br.readLine().split(" ");
        int[] A = new int[N];
        for(int i_A=0; i_A<arr_A.length; i_A++)
        {
            A[i_A] = Integer.parseInt(arr_A[i_A]);
        }

        long out_ = SimilarElementsPairs(A,N);
        System.out.println(out_);

        wr.close();
        br.close();
    }
    static long SimilarElementsPairs(int[] A,int N){
        // Write your code here
        long result = 0;
        // TODO later...
        return result;
    }
}
