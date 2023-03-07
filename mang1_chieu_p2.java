
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class mang1_chieu_p2 {
    public static void main(String[] args){
        int n;  
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the number of elements you want to store: ");  
        n=sc.nextInt();   
        int[] array = new int[10];  
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++)  
        {  
        array[i]=sc.nextInt();  
        }  
        System.out.println("Array elements are: ");  
        for (int i=0; i<n; i++)   
        {  
        System.out.println(array[i]);  
        }  
        }
}
    
        
