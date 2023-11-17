package be7.oop1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Quiz1 {
    public static void main(String[] args) {
        // 0번째와 3번째 더하기
        int[] arr={4,3,1,2,5};
        int sum=arr[0]+arr[2];
        System.out.println("sum = " + sum);

        //모든 합계
        int sum1=arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
        System.out.println("sum1 = " + sum1);

        //배열 반복하여 출력
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println(); // 줄바꿈

        // 배열을 오름차순으로 정렬
        Arrays.sort(arr);
        System.out.println("오름차순 정렬 = " + Arrays.toString(arr));

        //배열의 특정 요소(이 경우 '3')를 검색
        System.out.println(arr[2]);



    }
}
