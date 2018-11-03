package org.bsuir;

public class Task33 {

	public static void main(String[] args) {
		int [][] arr = new int[15][3];
        for(int i = 0;i<arr.length;i++){
            for(int k=0;k<arr[i].length;k++){
                arr[i][k]=(int)(Math.random()*8)+2;
                if(k==arr[i].length-1){
                    arr[i][k]=arr[i][k-2]*arr[i][k-1];
                    for(int q=0;q<i;q++){
                        if(arr[i][k]==arr[q][k]&&i>0){
                            if(arr[i][k-1]==arr[q][k-1]||arr[i][k-2]==arr[q][k-2]) {
                            }
                        }
                    }
                }   
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print("Пример–"+(i+1+" "));
            for(int k=0;k<arr[i].length;k++){
                if(k==0) {
                    System.out.print(arr[i][k]+" * ");
                }
                if(k==1) { 
                    System.out.println(arr[i][k]);
                }
            }
        }
	}

}
