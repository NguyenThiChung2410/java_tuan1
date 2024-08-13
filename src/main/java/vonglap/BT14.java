/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vonglap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BT14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> so = new ArrayList<>();
        int input;
        System.out.print("Nhap danh sach cac so nguyen khac 0 (nhap 0 de ket thuc): ");

        while (true) {
            input = sc.nextInt();
            if (input == 0) {
                break; 
            }
            so.add(input);
        }
        if (so.isEmpty()) {
            System.out.println("Danh sach rong. Khong the tinh trung binh.");
        } else {
            double sum = 0;
            for (int number : so) {
                sum += number;
            }
            double average = sum / so.size();
            
            System.out.printf("Trung binh cac so la: %.3f%n", average);
        }

    }
    
}
