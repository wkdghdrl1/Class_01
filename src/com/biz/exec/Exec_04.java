package com.biz.exec;

import java.util.Random;

import com.biz.model.Student;

public class Exec_04 {

	public static void main(String[] args) {
	
		// Student 클래스객체 배열 10개를 예약하라
		// 아직 예약만 되있고 
		// 사용할 준비가 되지 않은 상태
		Student[] stdScore = new Student[10];
		
		// 객체 배열은 사용(읽기, 쓰기)전에
		// 각 배열 요소를 개별적으로 초기화하는 코드 수행해야 한다.
		
		// 가상의 성적을 만들기 위해서 난수 발생기 사용
		 Random rnd = new Random();
		 
		// for 반복문을 사용해서 같은 코드를 10번 수행했다.
			System.out.println("========================================================");
			System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
			System.out.println("--------------------------------------------------------");
		for(int i = 0 ;  i < stdScore.length; i++) {
			stdScore[i] = new Student();
			
			stdScore[i].intKor =  rnd.nextInt(50) + 51;
			stdScore[i].intEng =  rnd.nextInt(50) + 51;
			stdScore[i].intMath =  rnd.nextInt(50) + 51;
			
			int intSum = stdScore[i].intKor;
			  intSum += stdScore[i].intEng;
			  intSum += stdScore[i].intMath;
			 
			float fAvg = intSum / 3.0f; 
            

		    stdScore[i].intNum = i + 1;
			System.out.print(stdScore[i].intNum + "\t");
			
			System.out.print(stdScore[i].intKor + "\t");
			System.out.print(stdScore[i].intEng + "\t");
			System.out.print(stdScore[i].intMath + "\t");
			
			System.out.print(intSum + "\t");
			System.out.print(fAvg + "\t");
			System.out.println();
			System.out.println("========================================================");		

			
		}
		
		
		
	}

}
