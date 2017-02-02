package com.tinus.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainPemecahanBilangan {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.print("Masukkan bilangan yang ingin dipecahkan: ");

		Scanner input = new Scanner(System.in);
		int x = input.nextInt();

		List<Integer> resultList = pemecahan(x);
		for (Integer result : resultList) {
			System.out.println(result);
		}
	}

	private static List<Integer> pemecahan(int x) {
		List<Integer> resultList = new ArrayList<Integer>();

		String stringValue = String.valueOf(x);
		int numberLength = stringValue.length();
		numberLength--;
		char[] charValues = stringValue.toCharArray();

		for (char charValue : charValues) {
			String value = String.valueOf(charValue);
			for (int i = 0; i < numberLength; i++) {
				value += "0";
			}
			numberLength--;
			resultList.add(Integer.parseInt(value));
		}
		return resultList;
	}
}
