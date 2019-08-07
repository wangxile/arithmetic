package com.wangxile.arithmetic.algorithm.leetcode;

public class TrimGBK {
  public static void main(String[] args) throws Exception {
	String str = "我a爱中华abc我爱船只def";
	String str2 = "我abc汉";
	int num = trimGBK(str.getBytes("GBK"),6);
	System.out.println(str.subSequence(0, num));
	
   }
  public static int trimGBK(byte[] buf, int n){
	int num = 0;
	boolean tof = false;
	for(int i=0;i<n;i++){
		if(buf[i]<0 && !tof){
			tof = true;
		}else{
			num++;
			tof = false;
		}
	}
	return num;
	  
  }
}
