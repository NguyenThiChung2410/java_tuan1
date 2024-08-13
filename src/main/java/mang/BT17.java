/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mang;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class BT17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double []a;
        Scanner sc=new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap so luong phan tu n : ");
            n = sc.nextInt();
        } while (n < 1 || n > 20);
       
        
        //Cap nhat so phan tu
        a=new double[n];
        NhapMang(a, sc);
        System.out.println("====Mang a====");
        XuatMang(a);
        System.out.print("\nGia tri trung binh la:" +TinhTB(a));
        System.out.print("\nPhan tu nho nhat la:" +TimMin(a));
    }
    //Nhap mang
    public static void NhapMang(double[] a,Scanner sc){
        for(int i=0;i<a.length;i++){
            System.out.print("Cho biet gia tri a["+i+"]:");
            a[i]=sc.nextDouble();
        }
        
    }
    public static void XuatMang(double []a){
        for(double x :a){
            System.out.print(x+" ");
        }
    }
    public static double TinhTB(double[] a){
        double Tong=0;
        for(double x:a){
            Tong +=x;
        }
        return Tong/a.length;
    }
    public static double TimMin(double[] a){
         double min=a[0];
        for(double x : a){
            if(x<min){
                min =x;
            }
        }
        return min;
    }
}
