package algorithm;

import java.awt.print.Printable;
import java.util.Random;

public class DirectInsertionSort {
	public static void directInsertionSort(int[] arr,int a) {
        //外循环： 遍历数组元素逐一插入数组      
		for(int i=1; i<a; i++){
        //记录所遍历的数组元素	
		int temp = arr[i];
        //内循环：与已排序部分逐一比较		
			for(int j=i-1;j>=0;j--) {
				//如果大于该元素，退出内循环
				if(temp>=arr[j]) {
					break;
				}
				//否则将两个元素交换位置
				arr[j+1] = arr[j];
				arr[j] = temp;
			}
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
		directInsertionSort(arr, 100);
	}
}
