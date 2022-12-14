package kr.co.exam;

import java.util.Scanner;

public class Exam04_2 {

	public static void main(String[] args) {
//		Exam03.java 파일을 생성 후 다음의 문제를 풀어보세요.
//		사용자 입력으로 2~5 사이의 정수 값을 입력받아
//		입력받은 정수값과 동일한 크기의 배열을 생성하고, 
//		배열의 값을 초기화하기 위해 다시 사용자 입력을 사용하여 
//		1~10 사이의 값만을 입력받아 초기화하세요.
//		위와 동일한 과정으로 배열을 생성할 때 중복된 값이 없도록 초기화하세요.

		Scanner sc = new Scanner(System.in);
		int size = 0;
		while(!(size >= 2 && size <= 5)) {
			System.out.println("2 ~ 5 사이의 정수를 입력하세요.");
			size = sc.nextInt();
		}

		int arr1[] = new int[size];

		for(int i = 0; i < size;) {
			System.out.println("1 ~ 10 사이의 정수를 입력하세요.");
			int num = sc.nextInt();
			if (num >= 1 && num <= 10) {
				boolean isDuplicate = false;
				for(int j = 0; j < size; j++) {
					if (arr1[j] == num) {
						isDuplicate = true;
						break;
					}
				}
				if(!isDuplicate) {
					arr1[i] = num;
					i++;
				}
			}
		}
		for(int k = 0; k < arr1.length; k++) {
			System.out.print(arr1[k] + "\t");
		}
	}

}
