package com.Java11;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = { "BMW", "Tesla", "Merc", "Toyota", "Lexus", "Nissan" };
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		for (String cars : array) {
			System.out.println(cars);
		}

		int[] num = { 2, 3, 4, 5, 6 };
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			System.out.println(sum = sum + num[i]);
		}
		String[] country = { "India", "China", "Japan", "Afghanistan" };
		for (int i = 0; i < country.length; i++) {
			if (country[i].equals("India")) {
				System.out.println("The capital is New Delhi");
			} else if (country[i].equals("China")) {
				System.out.println("The capital is Beijing");
			} else if (country[i].contentEquals("Japan")) {
				System.out.println("The capital is Tokyo");
			} else if (country[i].contentEquals("Afghanistan")) {
				System.out.println("The capital is Kabul");
			}
		}

		for (String o : country) {
			switch (o) {

			case "India":
				System.out.println("New Delhi");
				break;
			case "China":
				System.out.println("Beijing");
				break;
			case "Japan":
				System.out.println("Tokyo");
				break;
			case "Afghanistan":
				System.out.println("Kabul");
break;
			default:
				System.out.println("Its a country");
			}

		}
	}
}