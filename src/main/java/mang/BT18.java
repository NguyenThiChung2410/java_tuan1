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
public class BT18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int []a;
        Scanner sc=new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap so luong phan tu n : ");
            n = sc.nextInt();
        } while (n < 1 || n > 50);
       
        //Cap nhat so phan tu
        a=new int[n];
        NhapMang(a, sc);
        System.out.println("====Mang a====");
        XuatMang(a);
        System.out.print("\nSo khong phai la so nguyen to la: ");
        KhongLaSoNguyenTo(a);
        System.out.print("\nTrung binh so nguyen to: " +TrungBinhSoNguyenTo(a));
    }
    //Nhap mang
    public static void NhapMang(int[] a,Scanner sc){
        for(int i=0;i<a.length;i++){
            System.out.print("Cho biet gia tri a["+i+"]:");
            a[i]=sc.nextInt();
        }
        
    }
    public static void XuatMang(int []a){
        for(int x :a){
            System.out.print(x+" ");
        }
    }
    public static boolean LaSoNguyenTo(int n) {
        if (n <= 1) return false; 
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false; 
        }
        return true;
    }
    public static void KhongLaSoNguyenTo(int[] a){
        for(int x:a){
            if(!LaSoNguyenTo(x)){
                System.out.print(x+ " ");
            }
        }
    }
    public static double TrungBinhSoNguyenTo(int[] a) {
        double sum = 0;
        int count = 0;

        for (int x : a) {
            if (LaSoNguyenTo(x)) {
                sum += x;
                count++;
            }
        }

        if (count == 0) {
            return -1; 
        }
        return sum / count; 
    }

}
