/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mang;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BT19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int []a;
       
        Scanner sc=new Scanner(System.in);
        int n;
        
       System.out.print("Nhap so luong phan tu n : ");
            n = sc.nextInt();
        //Cap nhat so phan tu
       
        a=new int[n];
        PhatSinhMang(a);
        System.out.print("Mang phat sinh: ");
        XuatMang(a);
        SapXepTang(a);
        System.out.print("\nMang sau khi sap xep tang: " );
        XuatMang(a);
        
        System.out.print("\nCho biet gia tri cua x: ");
        int x=sc.nextInt();
        System.out.print("\ncac phan tu la uoc so cua x: ");
        LietKeUocSo(a, x);
    }
    public static void PhatSinhMang(int[] a){
        Random rd=new Random();
        for(int i=0;i<a.length;i++){
            a[i]=rd.nextInt(100);
        }
    }
    public static void XuatMang(int[] a){
        for (int x : a) {
            System.out.print(x+" ");
        }
    }
    public static void SapXepTang(int[] a){
        Arrays.sort(a);
            
    }
    public static void LietKeUocSo(int[] a,int x){
        for(int item:a){
            if(item>0 && x%item==0){
                System.out.print(item+ " ");
            }
        }
    }
}
    

