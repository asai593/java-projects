package xyz;

public class constanttimeexample {
	public static void printFirstElement(int [] arr) {
		if(arr.length > 0) {
			System.out.println("First element is:"+arr[0]);
		}else {
			System.out.println("Array is empty");
		}
	}
	public static void main(String[] args) {
		int [] numbers = {10,11,12,13};
		printFirstElement(numbers);
	}

}
