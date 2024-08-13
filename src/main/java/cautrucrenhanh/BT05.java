/*
 * 
 */
package cautrucrenhanh;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class BT05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double sokm;
        double thanhTien;
        Scanner sc=new Scanner(System.in);
        System.out.println("===TINH TIEN TAXI");
        System.out.println("Nhap so km: ");
        sokm=sc.nextDouble();
        if (sokm == 1)
            {
                thanhTien = sokm * 15000;
                System.out.println("Thanh tien la " +thanhTien);
            }
        else if(sokm>=2 && sokm<=5){
            thanhTien = (sokm - 1) * 13500 + 1 * 15000;
            System.out.println("Thanh tien la: " +thanhTien);
        }
        else if(sokm >= 6&& sokm<=120){
            thanhTien = ((sokm - 5) * 11000) + (1 * 15000) + (4 * 13500);
            System.out.println("Thanh tien la: " +thanhTien);
        }
        else
            {
                thanhTien=((1*15000)+(4*13500)+(sokm-5)*11000)*0.9;
                System.out.println("Thanh tien la: " +thanhTien);
            }
    }
    
}
