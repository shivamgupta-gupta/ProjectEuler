/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigint;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bigint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        BigInteger[] a= new BigInteger[100];
        BigInteger sum;
        sum = new BigInteger("0");
        System.out.print("Enter 5 elements of array - ");
        for(int i=0;i<100;i++){
            a[i] = sc.nextBigInteger();
            sum = sum.add(a[i]);
        }
        System.out.print(sum);
    }
    
}
