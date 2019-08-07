package com.wangxile.arithmetic.algorithm.easy.number;

public class CaculateProbability {
	//猴子第一天摘了若干个桃子，当即吃了一半，还不解馋，又多吃了一个；第二天，吃剩下的桃子的一半，还不过瘾，又多吃了一个；
	//以后每天都吃前一天剩下的一半多一个，到第10天想再吃时，只剩下一个桃子了。问第一天共摘了多少个桃子？
	public static int sumPeach(int day)
	{
	    if (day == 10)
	        return 1;
	    else
	    return 2 * sumPeach(day + 1) + 2;
	}
	
	//一个房间里有50个人，那么至少有两个人生日相同的概率是多少？（忽略闰年的事实，也就是一年365天）
    //计算某些事情的概率很多时候都可以转换成先计算其相对面。在这个例子里，我们可以计算所有人生日都互不相同的概率，
	//也就是：365/365 * 364/365 * 363/365 * … * (365-49)/365，这样至少两个人生日相同的概率就是1 – 这个值。
	public static double caculateProbability(int n){
	    double x = 1;

	    for(int i = 0; i < n; i++){
	        x *= (365.0-i)/365.0;
	    }

	    double pro = Math.round((1 - x) * 100);
	    return pro/100;
	}
	
	//问题： 有n步台阶，一次只能上1步或2步，共有多少种走法。
    //步骤1:找到走完前n步台阶和前n-1步台阶之间的关系。
    //为了走完n步台阶，只有两种方法：从n-1步台阶爬1步走到或从n-2步台阶处爬2步走到。
	//如果f(n)是爬到第n步台阶的方法数，那么f(n) = f(n-1) + f(n-2)。
	public static int f(int n){
	     if(n <= 2) return n;
	     int x = f(n-1) + f(n-2);
	     return x;
	}
	
    public static void main(String[] args) {
    	System.out.println(caculateProbability(50));
    	
    	System.out.println(f(10));
    	
    	int sum;
 	    sum=sumPeach(1);
 	    System.out.println("The first day of picking peaches number is："+sum);
	}
	
}
