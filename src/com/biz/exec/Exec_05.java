package com.biz.exec;

import com.biz.model.Student;
import com.biz.model.StudentArray;

// StudentArray 메소드 호출
public class Exec_05 {

	public static void main(String[] args) {
		
		StudentArray sArray = new StudentArray();
		Student[] stdScore = sArray.makeScore(50);
		sArray.viewScore(stdScore);
		
	}
}
