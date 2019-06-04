package com.biz.exec;

import java.util.Random;

public class Exec_06 {

	public static void main(String[] args) {

		int[] intNum = new int[10];
		int i;
		Random rnd = new Random();

		for ( i = 0; i < intNum.length; i++) {

			intNum[i] = rnd.nextInt(10) + 1;

		}
		for ( i = 0; i < intNum.length; i++) {
			System.out.print(intNum[i] + "\t");

		}
		System.out.println();
		for ( i = 0; i < intNum.length; i++) {
			if (intNum[i] == 7) {
				System.out.println((i + 1) + "번째 입니다.");
				break;
			}

		}if(i >= intNum.length) {
			System.out.println("7은 없습니다.");
		}

	}

}
