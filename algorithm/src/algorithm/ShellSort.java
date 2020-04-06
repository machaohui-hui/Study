package algorithm;

import java.util.Random;

public class ShellSort {
    public static void shellSort(int[] arr,int a) {
    	int h = 1;
    	int temp;
    	//确定初始步长
		while(h < a/3) {
			h = 3*h +1;
		}
		while(h>0) {
			//直接插入排序
			for (int i = h; i < a; i++) {
				for(int j = i;j - h >= 0;j -= h) {
					if(arr[j] < arr[j - h]) {
						temp = arr[j];
						arr[j] = arr[j - h];
						arr[j - h] = temp;
					}
				}
			}
			h = h/3;
		}
		for(int k=0; k<a; k++) {
			System.out.println(arr[k]);
		}
	}
	public static void main(String[] args) {
		int[] arr = new int[100];
		Random random = new Random();
		for(int i=0; i<100 ;i++) {
			arr[i] = random.nextInt(100);
		}
		shellSort(arr, 100);
	}
}
