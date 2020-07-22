package com.Logger.shabaan.Shabaan.FP;

import java.util.List;
import java.util.stream.Collectors;

public class ListOfPallendromString {

	public static void main(String[] args) {
		List<String> listOfString=List.of("radar","dear","madam","mom","dad","train","road","apple");
		List<String> listOfPallendrom=pallendromOrNot(listOfString);
		System.out.println(listOfPallendrom);

	}
	private static boolean pallendrom(String str) {
		String reverseString=new StringBuffer(str).reverse().toString();
		if(str.equals(reverseString)) {
			return true;
		}
		return false;
	}
	private static List<String> pallendromOrNot(List<String> listOfString) {
		return listOfString.stream().filter(ListOfPallendromString::pallendrom).collect(Collectors.toList());
	}

}
