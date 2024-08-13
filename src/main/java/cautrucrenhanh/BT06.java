/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cautrucrenhanh;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BT06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen thu nhat: ");
        int so1 = sc.nextInt();

        System.out.print("Nhap so nguyen thu hai: ");
        int so2 = sc.nextInt();
        System.out.print("Nhap phep toan (+, -, *, /): ");
        String x = sc.next().trim(); 

        switch (x) {
            case "+":
                System.out.println("Ket qua phep toan " + so1 + " + " + so2 + " la: " + (so1 + so2));
                break;
            case "-":
                System.out.println("Ket qua phep toan " + so1 + " - " + so2 + " la: " + (so1 - so2));
                break;
            case "*":
                System.out.println("Ket qua phep toan " + so1 + " * " + so2 + " la: " + (so1 * so2));
                break;
            case "/":
                if (so2 != 0) {
                    System.out.println("Ket qua phep toan " + so1 + " / " + so2 + " la: " + ((double) so1 / so2));
                } else {
                    System.out.println("Khong the chia cho 0!!");
                }
                break;
            default:
                System.out.println("Phep toan khong hop le. Vui long nhap phep toan la +, -, *, hoac /.");
                break;
        }
    }
    
}
