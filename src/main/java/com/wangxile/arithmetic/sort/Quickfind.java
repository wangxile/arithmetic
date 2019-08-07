package com.wangxile.arithmetic.sort;

public class Quickfind {
	//2路逻辑
	public static int partition(int[] arr,int low,int high){  
        int temp=arr[low];  
        while(low<high){  
            while(arr[high]<=temp&&high>low)  
                --high;  
            arr[low]=arr[high];  
            while(arr[low]>=temp&&low<high)  
                ++low;  
            arr[high]=arr[low];  
        }  
        arr[high]=temp;  
        return high;          
    }  
	public static int partition2(int[] arr,int left,int right){  
		int v = arr[left];
		 int i = left + 1;       
		     int j = right;         
		      while (true) {
		          while ((i < right) && (arr[i] >= v)) i++;    
		         while ((j > left) && (arr[j] <= v)) j--; 
		          if (i >= j) break;                          
		         int temp = arr[j];
		         arr[j] = arr[i];
		         arr[i] = temp;
		         i++;                                        
		        j--;
		     }
		      int t = arr[j];
		      arr[j] = arr[left];
		      arr[left] = t;
		      return j;
		      
    }  
	
	
    public static void find_k(int k,int[] arr,int low,int high){  
        int temp=partition(arr,low,high);  
        if(temp==k-1){  
            System.out.print("第"+k+"大的数是："+arr[temp]);  
        }else if(temp>k-1){  
            find_k(k,arr,low,temp-1);             
        }else{  
            find_k(k,arr,temp+1,high);  
        }  
    }  
      
  
    public static void main(String[] args) {  
        int[] arr={5,2,3,1,4,3,7,8,9,6,6};  
        find_k(3,arr,0,arr.length-1);  
    }  
}
