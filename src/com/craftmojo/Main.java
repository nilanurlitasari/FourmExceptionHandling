package com.craftmojo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner masukan = new Scanner(System.in);
        int x,y; //deklarasi type data x dan y untuk menampung nilai
        try{ //jalankan perintah pada blok try
            System.out.print("Masukkan X : ");
            x = masukan.nextInt(); //input nilai x
            System.out.print("Masukkan Y : ");
            y = masukan.nextInt();//input nilai y
            System.out.print("Hasilnya :"+ x/y);//cetak hasil x/y
        }catch (Exception e){
            //mendefinisikan error apabila blok try tidak dapat dijalankan (Error handling pada blok try)
            System.out.println("Hasilnya : "+e);
        }

    }
}
