/*
 
 */
package vonglap;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class BT09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        int dem;
        Scanner sc=new Scanner(System.in);
        System.out.println("====DEM UOC SO CUA SO NGUYEN====");
        System.out.print("Cho biet n: ");
        n=sc.nextInt();
        dem=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                dem++;
            }
        }
        System.out.println("So uoc so cua " + n + " la " + dem);
    }
    
}
