package org.bsuir;
import java.util.Random;
public class Task32 {

	public static void main(String[] args) {
		int a[][] = new int [6][7];
		Random r = new Random();
		int max = 0, temp = 0,index = 0, i,j;
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a[i].length; j++) {
				a[i][j] = r.nextInt(10);
				if (j==0) {
					max = a[i][j];
				}
				else if (max < a[i][j]) {
					max = a[i][j];
					index = j;
				}
				if (j == a[i].length-1) {
					temp = a[i][0];
					a[i][0] = a[i][index];
					a[i][index] = temp;
				}
			}
		}
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println();
	
	
		
		
		
		/*int [][] Mas = new int[6][7];
        for(int i =0;i<Mas.length;i++){
            System.out.print("Строка №"+i+" ");
            for(int h=0;h<Mas[i].length;h++){
                Mas[i][h]=(int)(Math.random()*10);
                System.out.print(Mas[i][h]+" ");
                int max=0,temp_index=0;;
                if(h==0) {
                max=Mas[i][h];
                }
                else {
                    if(max<Mas[i][h]){
                        max=Mas[i][h];
                        temp_index=h;
                    }
                }
                if(h==Mas[i].length-1){
                    int temp = Mas[i][0];
                    Mas[i][0]=Mas[i][temp_index];
                    Mas[i][temp_index]=temp;
                }
            }
            System.out.println(" ");
        }
        for(int i =0;i<Mas.length;i++){
            System.out.print("Обработанная строка №"+i+" ");
            for(int h=0;h<Mas[i].length;h++){
                System.out.print(Mas[i][h]+" ");
            }
            System.out.println(" ");
        }
		*/
	}

}
