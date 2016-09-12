package search;

public class BinarySearch {
	public static void main(String[] args) {
		int []arr = {1,5,6,7,4,3,9};
		int index = binarySearch(arr,9);
		System.out.println(index);
		
		int position = binSearch(arr,9,0,arr.length-1);
		System.out.println(position);
	}
	public static int binarySearch(int []arr, int key){
		int low = 0;
		int high = arr.length - 1;
		while(low <= high){
			int mid = (low + high)/2;
			if(arr[mid] == key){
				return mid;
			}
			else if(arr[mid] < key){	//待查元素位于右字表
				low = mid + 1;
			}
			else if(arr[mid] > key){	//待查元素位于左字表
				high = mid - 1;
			}
		}
		return 0;
	}
	public static int binSearch(int []arr, int key, int low, int high){
		if(low <= high){
			int mid = (low + high)/2;
			if(arr[mid] == key){
				return mid;
			}else if(arr[mid] < key){	//待查元素位于右字表
				return binSearch(arr,key,mid+1,high);
			}else if(arr[mid] > key){	//待查元素位于左字表
				return binSearch(arr,key,low,mid-1);
			}
		}
		return 0;
	}
}
