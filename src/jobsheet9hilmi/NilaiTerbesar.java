/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet9hilmi;

/**
 *
 * @author HP ZBOOK 15
 */
import java.util.Scanner;
public class NilaiTerbesar {
    public static void main(String[] args) {
 int bilsatu, bildua, biltiga, bilter;
 Scanner scan = new Scanner(System.in);
  
 System.out.print("Masukkan bilangan pertama = ");
 bilsatu = scan.nextInt();
  
 System.out.print("Masukkan bilangan kedua = ");
 bildua = scan.nextInt();
  
 System.out.print("Masukkan bilangan ketiga = ");
 biltiga = scan.nextInt();
  
 if(bilsatu>bildua && bilsatu>biltiga){
 bilter = bilsatu;
 }else{
 if(bildua>biltiga){
 bilter=bildua;
 }else{
 bilter=biltiga;
 }
 }
  
 System.out.println("Bilangan terbesar adalah "+ bilter);
  
 }
}