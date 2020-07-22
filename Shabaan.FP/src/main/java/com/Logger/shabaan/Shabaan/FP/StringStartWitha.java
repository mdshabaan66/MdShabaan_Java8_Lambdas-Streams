package com.Logger.shabaan.Shabaan.FP;

import java.util.List;
import java.util.stream.Collectors;

public class StringStartWitha {

	public static void main(String[] args) {
		List<String> courses=List.of("Spring","Spring Boot","api","Microservices","aws","PCF","azure","Dockers","Kubernetes");
		List<String> listOfa=listOfStringStartWitha(courses);
		System.out.println(listOfa);
	}

	private static List<String> listOfStringStartWitha(List<String> courses) {
		return courses.stream().filter(str->str.charAt(0)=='a').collect(Collectors.toList());
	}
}
