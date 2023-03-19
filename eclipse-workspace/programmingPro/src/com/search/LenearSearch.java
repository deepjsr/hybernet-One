package com.search;

public class LenearSearch {
	public static int findElement(int[] arr,int searchEle){
				
		for (int i = 0; i < arr.length; i++) {
			if (searchEle==arr[i]) {
				return i;
			}
		}
		return -1;
	}
	
public static void main(String[] args) {
	int arr[]= {21,32,99,80,20,13,76};
	int searchElement=89;
	int index=findElement(arr, searchElement);
	if (index>=0) 
		System.out.println("Element present at "+index);
	
	else
		System.out.println("Element no found");
  }
}
