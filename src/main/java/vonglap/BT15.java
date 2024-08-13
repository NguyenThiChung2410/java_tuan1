/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vonglap;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BT15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int doanso = 0;
        int doandung = 0;
        boolean choi = true;

        System.out.println("Chao mung ban den voi tro choi doan so!");
        System.out.println("Nhap mot so tu 0 đen 10 de doan hoac nhan 't' de thoat.");

        while (choi) {
            int sodedoan = random.nextInt(11);
            boolean sodoandung = false;
            while (!sodoandung) {
                System.out.print("Nhap so doan cua ban: ");
                String input = scanner.next();
                if (input.equalsIgnoreCase("t")) {
                    choi = false;
                    break;
                }

                try {
                    int doan = Integer.parseInt(input);
                    if (doan < 0 || doan > 10) {
                        System.out.println("Vui long nhap so trong khoang tu 0 đen 10.");
                        continue;
                    }
                    doanso++;              
                    if (doan == sodedoan) {
                        System.out.println("Chuc mung! Ban da doan dung.");
                        doandung++;
                        sodoandung = true;
                    } else {
                        System.out.println("Sai roi. Hay thu lai.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Vui long nhap mot so hop le.");
                }
            }
        }
        if (doandung > 0) {
            double Tbdoandung = (double) doandung / doanso;
            System.out.println("Tro choi ket thuc!");
            System.out.println("Tong so lan doan: " + doanso);
            System.out.println("So lan doan dung: " + doandung);
            System.out.printf("Ty le doan dung trung binh: %.2f%%%n", Tbdoandung * 100);
        } else {
            System.out.println("Ban chua thuc hien bat ky lan doan nao.");
        }
    }
    
}
