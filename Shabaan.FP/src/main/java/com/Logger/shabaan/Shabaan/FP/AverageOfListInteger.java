package com.Logger.shabaan.Shabaan.FP;

import java.util.List;

public class AverageOfListInteger {

	public static void main(String[] args) {
		List<Integer> numbers=List.of(56,98,12,36,4,0,16,9,78,63,42,21);
		double avg=average(numbers);
		System.out.println(avg);
	}

	private static double average(List<Integer> numbers) {
		double sum=numbers.stream().reduce(0,Integer::sum);
		return sum/(numbers.size());
	}

}
