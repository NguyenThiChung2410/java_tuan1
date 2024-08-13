/*
 
 */
package vonglap;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class BT08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("====Tinh tong day so : s=1+2+3+...+ n====");
        System.out.print("Cho biet n: ");
        n=sc.nextInt();
        for(int i=1; i<=n;i++){
            sum +=i;
        }
        System.out.println("Tong day so:" +sum);
    }
    
}
