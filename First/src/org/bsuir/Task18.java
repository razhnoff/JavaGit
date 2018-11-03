package org.bsuir;

public class Task18 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i < 100000; i++) {
			String s = i + "";
			if(s.indexOf("4") != 1) {
	        	count++;
	        }
	        else if(s.indexOf("1")!=-1 && s.indexOf("1")+1==s.indexOf("3")){
	        	count++;
	        }
			
		}
		System.out.println("Придется исключить " + count);
	}

}
