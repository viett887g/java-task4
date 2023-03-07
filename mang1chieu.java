
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
// * @author ADMIN
// */
public class mang1chieu {
    public static void main(String[] args){
//        int[] a;
//        a= new int[4];
//        a[0]=12;
//        a[1]=12;
//        a[2]=12;
//        a[3]=12;
//        System.out.println(Arrays.toString(a));
//        int[] b= new int[]{1,3,5,6,1};
//        System.out.println(Arrays.toString(b));
        
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int n = Integer.parseInt(input); 
        int[] c = new int[n];
//        for (int i =0;i<n;i++){
//            System.out.print("c"+ i +"=");
//            input = sc.nextLine();
//            c[i]= Intenger.parseInt(input);
        Random rnd = new Random();
        for (int i =0; i<n ; i++){
            c[i]=rnd.nextInt(10);
        }       
        System.out.println(Arrays.toString(c));
    }
}
