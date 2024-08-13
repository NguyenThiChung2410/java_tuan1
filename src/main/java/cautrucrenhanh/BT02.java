/*
 * 
 */
package cautrucrenhanh;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class BT02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double toan,van ,anh;
        double dtb;
        Scanner sc=new Scanner(System.in);
        System.out.println("=====XET HOC LUC====");
        System.out.print("Cho biet diem toan: ");
        toan=sc.nextDouble();
        System.out.print("Cho biet diem van: ");
        van=sc.nextDouble();
        System.out.print("Cho biet diem anh: ");
        anh=sc.nextDouble();
        dtb=(toan+van+anh)/3;
        String kq="";
        if(dtb<=4){
            kq="Yeu";
        }else if(dtb<=6.5){
            kq="Trung binh";
        }else if(dtb<=8){
            kq="Kha";
        }else{
            kq="Gioi";
        }
        System.out.println("Hoc luc:" + kq);
               
    }
    
}
