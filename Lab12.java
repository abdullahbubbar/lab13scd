package lab12;

import java.util.Scanner;
public class Lab12 {
	public static int[] getArray() {
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) { 
			array[i] = (int)(Math.random() * 100) + 1;
			} 
		return array;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] array = getArray();
		System.out.print("Enter the index of the array: ");
		System.out.print("Enter the index of the array: ");
		try {
			System.out.println("The corresponding element value is " + array[input.nextInt()]);
			}
		catch (ArrayIndexOutOfBoundsException ex) { 
			System.out.println("Array Index Out of Bounds.");
			}
		}
	}
