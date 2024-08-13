/*
 * 
 */
package cautrucrenhanh;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class BT04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("====KIEM TRA CHAN LE===");
        System.out.print("Nhap n: ");
        n=sc.nextInt();
        if(n%2==0){
            System.out.println( n+ " la so chan");
        }else{
            System.out.println(n +" la so le");
        }
    }
    
}
