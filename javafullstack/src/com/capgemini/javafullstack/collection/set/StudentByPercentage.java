package com.capgemini.javafullstack.collection.set;

import java.util.Comparator;

public class StudentByPercentage implements Comparator<Student>{

		@Override
		public int compare(Student s1, Student s2) {
			if(s1.percentage > s2.percentage) {
				return 1;
			}else if(s1.percentage<s2.percentage) {
				return -1;
			}else {
				return 0;
			}
		}
	}

