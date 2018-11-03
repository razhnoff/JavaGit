package org.bsuir;
import java.util.Scanner;
public class Task14 {

	public static void main(String[] args) {
		int a;
        Scanner s=new Scanner(System.in);
        System.out.println("Vvedite chislo");
        if(s.hasNextInt()){            
            a=s.nextInt();          
            for(int i=(int)Math.sqrt(a);i>=1;i--){
                if(a%i==0 && i!=1){
                    System.out.println("Sostavnoe");
                    break;
                    }
                if(i==1) System.out.println("Prostoe");
            }
        }
        else {
        	System.out.println("vvedite celoe chislo");
        }
        s.close();

	}

}
