package com.biz.exec;

import com.biz.model.Student;

public class Exec_01 {

	public static void main(String[] args) {
			
		// 선언된  Student class를 사용해서
		// Student 객체를 선안하고
		// 사용할 수 있도록 초기화를 수행
	
		/*
		 * java이전의 프로그램 개발 방법에서는
		 * 데이터들을 메소드에 전달하여 처리를 할 때 
		 * 필요한 데이터 개수만큼 매개변수를 선언하고
		 * 순서에 맞도록 위치 조정도 잘해서
		 * 메소드에게 전달해주어야 한다.
		 * 
		 * 그러나, 데이터가 많으면 혼란이 와서
		 * 엉뚱한 데이터가 전달되는 경우가 흔히 발생한다.
		 * 
		 * 또한 매개변수의 순서도 명확히 확인하기가 어려워
		 */
		view(1,"홍길동", 3,"컴공과");
		view(2,"이몽룡", 2,"물리학과");
		view(3,"성춘향", 4,"법학과");
		
		view(4,"회계학과", 4,"임꺽정");
			
	}
	
	public static void view(int intNum, String strName, int intGrade, String Dept) {
		System.out.println("학번 :" + intNum);
		System.out.println("이름 :" + strName);
		System.out.println("학년 :" + intGrade);
		System.out.println("학과 :" + Dept);
	}
	
}
