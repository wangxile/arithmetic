package com.wangxile.arithmetic.probability;

/**
 * 巧用取余
 * @author Administrator
 *
 */
public class SkillfulUseOfRedundancy {
	
	/**
	 * 有时候我们在遍历数组的时候，会进行越界判断，如果下标差不多要越界了，我们就把它置为0重新遍历。
	 * 特别是在一些环形的数组中，例如用数组实现的队列。往往会写出这样的代码：
	 * @param pos
	 * @param n
	 */
	public void f(int pos, int n){
		for (int i = 0; i < n; i++) {
		       if (pos < n) {
		        //没有越界
		        // 使用数组arr[pos]
		       } else {
		          pos = 0;
		          //置为0再使用数组
		          //使用arr[pos]
		       }
		       pos++;
		}
	}

	public void f(int pos, int n, int m){
		for (int i = 0; i < n; i++) {
		  //使用数组arr[pos]   
		  //(我们假设刚开始的时候pos < N)
		  pos = (pos + 1) % n;
		}
	}

       
       

}
