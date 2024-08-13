/*
 * 
 */
package vonglap;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class BT11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        int sodao;
        Scanner sc=new Scanner(System.in);
        System.out.print("Cho biet n: ");
        n=sc.nextInt();
        sodao=TimSoDao(n);
        if(sodao==n){
            System.out.println(n + " la so doi xung");
        }else{
            System.out.println(n + " la so khong doi xung");
        }
    }

    private static int TimSoDao(int n) {
        int sodao=0;
        while(n>0){
            sodao=sodao *10 + n%10;
            n=n/10;
        }
        return sodao;
    }
    
}
